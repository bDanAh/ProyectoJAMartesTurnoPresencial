package test;

import java.util.List;

import DaoImp.ClienteImp;
import model.TblCliente;

public class TestCliente {
	
	public static void main(String[] args) {
		// Realizamos la respectiva instancia
		TblCliente tblcli=new TblCliente();
		ClienteImp climp=new ClienteImp();


		
		/*//asignamos valores
		tblcli.setNombre("nilson alexander");
		tblcli.setApellido("gomez gomez");
		tblcli.setEmail("nilson@gmail.com");
		tblcli.setTele("38741596");
		tblcli.setDni("1045786");
		tblcli.setSexo("M");
		tblcli.setNacion("chilena");
		//invocamos el metodo para registrar
		climp.RegistrarCliente(tblcli);
		System.out.println("Datos Registrados");
	}
	*/
	/*public static void main(String[] args) {
		// Realizamos la respectiva instancia
		TblCliente tblcli=new TblCliente();
		ClienteImp climp=new ClienteImp();
		//asignamos valores
		tblcli.setNombre("maria juana");
		tblcli.setApellido("fernandez perez");
		tblcli.setEmail("juana@gmail.com");
		tblcli.setTele("54678521");
		tblcli.setDni("2563257");
		tblcli.setSexo("F");
		tblcli.setNacion("colombiana");
		//invocamos el metodo para registrar
		climp.RegistrarCliente(tblcli);
		System.out.println("Datos Registrados");
	}*/
	
	/*//TESTEAMOS EL MTODO ACTUALIZAR
	tblcli.setIdcliente(2);
	tblcli.setNombre("nataly");
	tblcli.setApellido("perez gomez");
	tblcli.setEmail("nataly@gmail.com");
	tblcli.setTele("12345678");
	tblcli.setDni("10234567");
	tblcli.setSexo("f");
	tblcli.setNacion("chilena");
	//Invoco el método Actualizar
	climp.ActualizarCliente(tblcli);
	//emitims un mensaje por consola
	System.out.println("Datos Actualizados");
	*/
	
	/*//TESTEANDO EL METDO ELIMINAR
		//ELIMINAMOS EL COD 2
		tblcli.setIdcliente(2);
		//invoco el método eiminar...
		climp.EliminarCliente(tblcli);
		//Emitimos un mensaje por pantalla
		System.out.println("Dato eliminado");*/
		
	/*//TESTEANDO EL MÉTODO LISTADO
		List<TblCliente> listadocliente=climp.Listado();
		//Aplicamos BUCLE FOR...
		for(TblCliente lis:listadocliente){
			//Imprimimos por pantalla los datos de la BD
			System.out.println(" codigo "+lis.getIdcliente()+
									" nombre "+lis.getNombre()+
									" apellido "+lis.getApellido()+
									" emai " +lis.getEmail()+
									" telefono "+lis.getTele()+
									" dni "+lis.getDni()+
									" sexo "+lis.getSexo()+
									" nacion "+lis.getNacion());
		}//Fin del bucle FOR*/
	
	//TESTEANDO EL MÉODO BUSCAR CLIENTE
		//Codig a buscar
		tblcli.setIdcliente(1);
		TblCliente buscli=climp.BuscarCliente(tblcli);
		//Imprimimos por pantalla
		System.out.println(" codigo "+buscli.getIdcliente()+
					" nombre "+buscli.getNombre()+
					" apellido "+buscli.getApellido()+
					" emai " +buscli.getEmail()+
					" telefono "+buscli.getTele()+
					" dni "+buscli.getDni()+
					" sexo "+buscli.getSexo()+
					" nacion "+buscli.getNacion());
		
	}
	
	
	
	
}//Fin de la clase............
