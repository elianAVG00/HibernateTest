package negocio;
import dao.PrestamoDao;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import datos.Cliente;
import datos.Cuota;
import datos.Prestamo;

public class PrestamoABM {
	
	private static PrestamoDao instancia;
	private static PrestamoABM instanciaABM;
	
	private static PrestamoDao getInstanciaDao() {
		if (instancia == null) {
			instancia = new PrestamoDao();
		}
		return instancia;
	}
	
	public static PrestamoABM getInstancia() {
		if (instanciaABM == null) {
			instanciaABM = new PrestamoABM();
		}
		return instanciaABM;
	}
	
	public Prestamo traerPrestamo(long idPrestamo){
		//Implementar: si el no existe el prestamo lanzar la excepción
		Prestamo p =getInstanciaDao().traer(idPrestamo);
		return p;
	}
	
	public List<Prestamo> traerPrestamo(Cliente c) {
		return getInstanciaDao().traer(c);
	}
	/* Pendiente implementar
	* Alta, Modificar
	*/
	public void agregar(LocalDate fecha, double monto, double interes, int cantCuotas, Cliente cliente) {
		
		Prestamo prestamo = new Prestamo(fecha, monto, interes, cantCuotas, cliente, new HashSet<Cuota>());
		
		  for (int i = 0; i < cantCuotas; i++) { // Cálculos de valor de cuota
			  
			  double amortizacion = ( (monto * interes) /( Math.pow((1 + interes), (cantCuotas - i ) ) - 1));
			  double saldoPendiente = monto - amortizacion;
			  double cuota = saldoPendiente * interes;
			  
			  
			  prestamo.getCuotas().add(new Cuota(fecha.plusDays(30), i+1 ,saldoPendiente, amortizacion, interes, cuota, monto,
			  false, null, 6, prestamo)); 
		  
		  }
		 
		getInstanciaDao().agregar(prestamo);
	}
}
