package dao;


import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import datos.Cuota;

public class CuotaDao {
	private static Session session;
	private Transaction tx;
	
	private void iniciaOperacion() throws HibernateException{
		session = HibernateUtil.getSessionFactory().openSession();
		tx = session.beginTransaction();
	}
	
	private void manejaExcepcion(HibernateException he) throws HibernateException{
		tx.rollback();
		throw new HibernateException("ERROR en la capa de acceso de datos", he);
	}
	
	public Cuota traer(long idCuota) throws HibernateException {
		
		Cuota obj = null;
		try {
		iniciaOperacion();
		String hQL = "from Cuota c inner join fetch c.prestamo p where c.idCuota=" + idCuota;
		obj = (Cuota) session.createQuery(hQL).uniqueResult();
		}catch(HibernateException he) {
			manejaExcepcion(he);
			throw he;
		} finally {
			session.close();
		}
		
		return obj;
	}
	
	public void actualizar(Cuota objeto) throws HibernateException{
		try {
			iniciaOperacion();
			session.update(objeto);
			tx.commit();
		}catch(HibernateException he) {
			manejaExcepcion(he);
			throw he;
		}finally {
			session.close();
		}
	}
	
}
