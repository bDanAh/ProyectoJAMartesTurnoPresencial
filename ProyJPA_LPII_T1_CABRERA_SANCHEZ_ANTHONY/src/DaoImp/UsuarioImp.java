package DaoImp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.Iusuario;
import model.TblUsuariot1;

public class UsuarioImp implements Iusuario{

	@Override
	public void RegistrarUsuario(TblUsuariot1 usuario) {
		// Nos conectamos con la nidad de persistecia
				EntityManagerFactory emf=Persistence.createEntityManagerFactory("ProyJPA_LPII_T1_CABRERA_SANCHEZ_ANTHONY");
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
	public void ActualizarUsuario(TblUsuariot1 usuario) {
			//Nos conectamos con la unidad de persistencia para
			//regstrar los datos
				EntityManagerFactory emf=Persistence.createEntityManagerFactory("ProyJPA_LPII_T1_CABRERA_SANCHEZ_ANTHONY");
				//Para administrar as transacciones
				EntityManager em=emf.createEntityManager();
				try{
				//Inicimos la transaccion
				em.getTransaction().begin();
				//invocamos el m{etodo actualizar
				em.merge(usuario);
				//confirmamos
				em.getTransaction().commit();
				
				}catch(RuntimeException ex){
					ex.getMessage();
				}finally{
				//cerramos
				em.close();
				}
	}//fin del metodo actualizar

	@Override
	public void EliminarUsuario(TblUsuariot1 usuario) {
		//Nos conectamos con la unidad de persistencia para 
		//poder registrar datos
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ProyJPA_LPII_T1_CABRERA_SANCHEZ_ANTHONY");
		//Para aministrar las transacciones
		EntityManager em=emf.createEntityManager();
		try{
		//Iniciar la transaccione
		em.getTransaction().begin();
		//Recuperamos el codigo a eliminar..
		TblUsuariot1 eliusu=em.find(TblUsuariot1.class,usuario.getIdusuariot1());
		//aplicamos condicion
		if(eliusu!=null){
			//ivocamos el m�todo eliminar
			em.remove(eliusu);
			//comfirmamos
			em.getTransaction().commit();
		}//Fin de la condicion
		}catch(RuntimeException ex){
			//Aplicamos una condicion
			if(em.getTransaction().isActive()) em.getTransaction().rollback();
			ex.getMessage();
		}//fin del catch
		finally{
		//cerramos
		em.close();
		}//Fin del Finally
		
	}

	@Override
	public List<TblUsuariot1> Listado() {
		//nos conectamos cn la unidad de persistencia
				//para poder trabajar con la BD
				EntityManagerFactory emf=Persistence.createEntityManagerFactory("ProyJPA_LPII_T1_CABRERA_SANCHEZ_ANTHONY");
				//Para administrar las transacciones...
				EntityManager em=emf.createEntityManager();
				
				List<TblUsuariot1> list=null;
				try{
				//Iniciamos la transaccion
				em.getTransaction().begin();
				//aplicamos consultas JAVA PERSISTENCE JPQL
				list=em.createQuery("select u from TblUsuarit1 u", TblUsuariot1.class).getResultList();
				//Confirmamos
				em.getTransaction().commit();
				}catch(RuntimeException ex) {
					
				}finally{
				//cerramos
				em.close();
				}
				return list;
		//Fin del metodo listar
	}

	@Override
	public TblUsuariot1 BuscarUsuario(TblUsuariot1 usuario) {
		//Nos conectamos con la unidad de persistencia
				//para poder trabajar con la BD
				EntityManagerFactory emf=Persistence.createEntityManagerFactory("ProyJPA_LPII_T1_CABRERA_SANCHEZ_ANTHONY");
				//Para administrar las transacciones...
				EntityManager em=emf.createEntityManager();
				
				TblUsuariot1 buscarusu=null;
				try{
				//Iniciamos la trasaccion
				em.getTransaction().begin();
				//invocamos el m�todo buscar
				buscarusu=em.find(TblUsuariot1.class,usuario.getIdusuariot1());
				//CONFIRMAMOS
				em.getTransaction().commit();
				}catch(RuntimeException ex){
					ex.getMessage();
				}finally{
				//cerramos
				em.close();
				}//fin del finally

				return buscarusu;
			//Fin del metodo Buscar usuario
	}

}
