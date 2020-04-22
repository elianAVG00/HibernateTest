package test;

import datos.Cliente;
import datos.Prestamo;
import negocio.ClienteABM;
import negocio.PrestamoABM;

public class TestTraer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrestamoABM prestamoABM = new PrestamoABM();
		long idPrestamo = 1;
		System.out.println("n----> TraerPrestamo idPrestamo =" + idPrestamo + "\n\n");
		Prestamo p = prestamoABM.traerPrestamo(idPrestamo);
		System.out.println(p + "\nPertenece a " + p.getCliente());
		
		System.out.println("----------------------------------");
		
		ClienteABM clienteABM=new ClienteABM();
		int dni=14000000;
		Cliente c= clienteABM.traerClienteYPrestamos(1);
		System.out.println(c);
	}

}
