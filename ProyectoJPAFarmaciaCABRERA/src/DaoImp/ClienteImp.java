package DaoImp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.RollbackException;

import com.mysql.cj.protocol.TlsAsynchronousSocketChannel;

import interfaces.*;
import model.TblCliente;

public class ClienteImp implements Icliente{

	@Override
	public void RegistrarCliente(TblCliente cliente) {
		// Nos conectamos con la nidad de persistecia
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("ProyectoJPAFarmaciaCABRERA");
			EntityManager em=emf.createEntityManager();
		//Iniciamos las transacciones
			em.getTransaction().begin();
		//invocamos al metodo persi.. que nos permite insertar datos a la BD
			em.persist(cliente);
		//Confrmamos la transaccion
			em.getTransaction().commit();
		//cerramos la transaccion
			em.close();
			
	}

	@Override
	public void ActualizarCliente(TblCliente cliente) {
		//Nos conectamos con la unidad de persistencia para
		//regstrar los datos
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ProyectoJPAFarmaciaCABRERA");
		//Para administrar as transacciones
		EntityManager em=emf.createEntityManager();
		
		try{
		//Inicimos la transaccion
		em.getTransaction().begin();
		//invocamos el m{etodo actualizar
		em.merge(cliente);
		//confirmamos
		em.getTransaction().commit();
		
		}catch(RuntimeException ex){
			ex.getMessage();
		}finally{
		//cerrmos
		em.close();
		}
	}//fin del metodo actualizar cliente

	@Override
	public void EliminarCliente(TblCliente cliente) {
		//Nos conectamos con la unidad de persistencia para 
		//poder registrar datos
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ProyectoJPAFarmaciaCABRERA");
		//Para aministrar las transacciones
		EntityManager em=emf.createEntityManager();
		try{
		//Iniciar la transaccione
		em.getTransaction().begin();
		//Recuperamos el codigo a eliminar..
		TblCliente elimcli=em.find(TblCliente.class,cliente.getIdcliente());
		//aplicamos condicion
		if(elimcli!=null){
			//ivocamos el método eliminar
			em.remove(elimcli);
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
	public List<TblCliente> Listado() {
		//nos conectamos cn la unidad de persistencia
		//para poder trabajar con la BD
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ProyectoJPAFarmaciaCABRERA");
		//Para administrar las transacciones...
		EntityManager em=emf.createEntityManager();
		
		List<TblCliente> list=null;
		try{
		//Iniciamos la transaccion
		em.getTransaction().begin();
		//aplicamos consultas JAVA PERSISTENCE JPQL
		list=em.createQuery("select c from TblCliente c", TblCliente.class).getResultList();
		//Confirmamos
		em.getTransaction().commit();
		}catch(RuntimeException ex) {
			
		}finally{
		//cerramos
		em.close();
		}
		return list;
	}//Fin del metodo listar Cliente

	@Override
	public TblCliente BuscarCliente(TblCliente cliente) {
		//Nos conectamos con la unidad de persistencia
		//para poder trabajar con la BD
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ProyectoJPAFarmaciaCABRERA");
		//Para administrar las transacciones...
		EntityManager em=emf.createEntityManager();
		
		TblCliente buscarcli=null;
		try{
		//Iniciamos la trasaccion
		em.getTransaction().begin();
		//invocamos el método buscar
		buscarcli=em.find(TblCliente.class,cliente.getIdcliente());
		//CONFIRMAMOS
		em.getTransaction().commit();
		}catch(RuntimeException ex){
			ex.getMessage();
		}finally{
		//cerramos
		em.close();
		}//fin del finally

		return buscarcli;
	}//Fin del metodo Buscar Cliente
	

}//fin de la clase..........
