package DaoImp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.Iproducto;
import model.TblProducto;

public class ProductoImp implements Iproducto{

	@Override
	public void RegistrarProducto(TblProducto producto) {
		// Nos conectamos con la nidad de persistecia
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ProyJPA_LPII_T1_CABRERA_SANCHEZ_ANTHONY");
		EntityManager em=emf.createEntityManager();
		//Iniciamos las transacciones
		em.getTransaction().begin();
		//invocamos al metodo persi.. que nos permite insertar datos a la BD
		em.persist(producto);
		//Confrmamos la transaccion
		em.getTransaction().commit();
		//cerramos la transaccion
		em.close();
	}

	@Override
	public void ActualizarProducto(TblProducto producto) {
		//Nos conectamos con la unidad de persistencia para
				//regstrar los datos
				EntityManagerFactory emf=Persistence.createEntityManagerFactory("ProyJPA_LPII_T1_CABRERA_SANCHEZ_ANTHONY");
				//Para administrar as transacciones
				EntityManager em=emf.createEntityManager();
				
				try{
				//Inicimos la transaccion
				em.getTransaction().begin();
				//invocamos el m{etodo actualizar
				em.merge(producto);
				//confirmamos
				em.getTransaction().commit();
				
				}catch(RuntimeException ex){
					ex.getMessage();
				}finally{
				//cerrmos
				em.close();
				}
			}//fin del metodo actualizar

	@Override
	public void EliminarProducto(TblProducto producto) {
		//Nos conectamos con la unidad de persistencia para 
				//poder registrar datos
				EntityManagerFactory emf=Persistence.createEntityManagerFactory("ProyJPA_LPII_T1_CABRERA_SANCHEZ_ANTHONY");
				//Para aministrar las transacciones
				EntityManager em=emf.createEntityManager();
				try{
				//Iniciar la transaccione
				em.getTransaction().begin();
				//Recuperamos el codigo a eliminar..
				TblProducto eliprod=em.find(TblProducto.class,producto.getIdproductot1());
				//aplicamos condicion
				if(eliprod!=null){
					//ivocamos el m�todo eliminar
					em.remove(eliprod);
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
	public List<TblProducto> Listado() {
		//nos conectamos cn la unidad de persistencia
		//para poder trabajar con la BD
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ProyJPA_LPII_T1_CABRERA_SANCHEZ_ANTHONY");
		//Para administrar las transacciones...
		EntityManager em=emf.createEntityManager();
		
		List<TblProducto> list=null;
		try{
		//Iniciamos la transaccion
		em.getTransaction().begin();
		//aplicamos consultas JAVA PERSISTENCE JPQL
		list=em.createQuery("select p from TblProducto p", TblProducto.class).getResultList();
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
	public TblProducto BuscarProducto(TblProducto producto) {
		//Nos conectamos con la unidad de persistencia
		//para poder trabajar con la BD
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ProyJPA_LPII_T1_CABRERA_SANCHEZ_ANTHONY");
		//Para administrar las transacciones...
		EntityManager em=emf.createEntityManager();
		
		TblProducto buscarprod=null;
		try{
		//Iniciamos la trasaccion
		em.getTransaction().begin();
		//invocamos el m�todo buscar
		buscarprod=em.find(TblProducto.class,producto.getIdproductot1());
		//CONFIRMAMOS
		em.getTransaction().commit();
		}catch(RuntimeException ex){
			ex.getMessage();
		}finally{
		//cerramos
		em.close();
		}//fin del finally

		return buscarprod;
	//Fin del metodo Buscar usuario
	}

}
