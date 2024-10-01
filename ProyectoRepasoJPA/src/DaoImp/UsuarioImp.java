package DaoImp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.Iusuario;
import model.TblUsuario;

public class UsuarioImp implements Iusuario{

	@Override
	public void RegistrarUsuario(TblUsuario usuario) {
		// Nos conectamos con la nidad de persistecia
				EntityManagerFactory emf=Persistence.createEntityManagerFactory("ProyectoRefuerzoJPA");
				EntityManager em=emf.createEntityManager();
			//Iniciamos las transacciones
				em.getTransaction().begin();
			//invocamos al metodo persi.. que nos permite insertar datos a la BD
				em.persist(usuario);
			//Confrmamos la transaccion
				em.getTransaction().commit();
			//cerramos la transaccion
				em.close();
	}

	@Override
	public void ActualizarUsuario(TblUsuario usuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void EliminarUsuario(TblUsuario usuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<TblUsuario> Listado() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TblUsuario BuscarUsuario(TblUsuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

}
