package negocio;

import java.time.LocalDate;
import java.util.List;

import dao.ClienteDao;
import datos.Cliente;

public class ClienteABM {
	ClienteDao dao = new ClienteDao();
	
	public Cliente traer(long idCliente) {
		Cliente c = dao.traer(idCliente);
		return c;
	}
	
	public Cliente traerClienteYContacto(long idCliente) {
		Cliente c = dao.traer(idCliente);
		return c;
	}
	
	public Cliente traer(int dni) {
		Cliente c = dao.traer(dni);
		return c;
	}
	
	public int agregar(String apellido, String nombre, int dni, LocalDate fechaDeNacimiento) {
		//consultar si existe un cliente con el mismo dni, si exite arrojar la
		//Excepcion
		Cliente c = new Cliente(apellido, nombre, dni, fechaDeNacimiento);
		return dao.agregar(c);
	}
	
	public void modificar(Cliente c) {
		//implementar antes de actualizar que no exista un cliente con 
		//el mismo documento a modificar y con el mismo id, lanzar la Excepcion
		dao.actualizar(c);
	}
	
	public void eliminar(long idCliente) {
		//en este caso es fisica en gral. no se aplicaria este caso de uso, si 
		//se hiciera habria que validar que el cliente no tenga dependencias
		Cliente c = dao.traer(idCliente);
		//Implementar que si es null que arroje  la excepcion la excepcion
		dao.eliminar(c);
	}
	
	public List<Cliente> traer(){
		return dao.traer();
	}
	
	public Cliente traerClienteYPrestamos(long idCliente) {
		return dao.traerClienteYPrestamos(idCliente);
	}

}
