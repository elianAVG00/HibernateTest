package test;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.List;

import datos.Cliente;
import datos.Prestamo;
import negocio.ClienteABM;
import negocio.PrestamoABM;

public class TestAgregarPrestamo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Agrego Cliente
		String apellido = "Marin";
		String nombre = "Marcos";
		int documento = 42818059;
		LocalDate fechaDeNacimiento = LocalDate.now();
		ClienteABM abm = new ClienteABM();
		long idCliente = abm.agregar(apellido, nombre, documento, fechaDeNacimiento);
		// Le agrego Prestamos
		
		double monto = 10000;
		double interes = 0.1;
		LocalDate fechaPrestamo= LocalDate.of(2020, 6, 25);
		PrestamoABM.getInstancia().agregar(fechaPrestamo, monto, interes, 10, abm.traer(idCliente));
		}
		 
	
}
