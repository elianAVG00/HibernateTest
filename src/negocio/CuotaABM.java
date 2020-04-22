package negocio;

import dao.CuotaDao;
import datos.Cuota;

public class CuotaABM {
	CuotaDao dao = new CuotaDao();
	
	public Cuota traer(long idCuota) {
		Cuota c = dao.traer(idCuota);
		return c;
	}
	
	public void modificar(Cuota c) {
		//implementar antes de actualizar que no exista un cliente con 
		//el mismo documento a modificar y con el mismo id, lanzar la Excepcion
		dao.actualizar(c);
	}
}
