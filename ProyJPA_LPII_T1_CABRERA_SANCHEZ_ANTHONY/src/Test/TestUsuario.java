package Test;

import java.util.List;

import DaoImp.UsuarioImp;
import model.TblUsuariot1;;

public class TestUsuario {
	public static void main(String[] args) {
		// Realizamos la respectiva instancia
		TblUsuariot1 tblusu=new TblUsuariot1();
		UsuarioImp usuimp=new UsuarioImp();
		
		
		
		
		/*//asignamos valores
		tblusu.setUsuariot1("Lionel Messi");
		tblusu.setPasswordt1("martita321");
		//invocamos el metodo para registrar
		usuimp.RegistrarUsuario(tblusu);
			System.out.println("Datos Registrados");*/
		
		/*//TESTEAMOS EL MTODO ACTUALIZAR
		tblusu.setIdusuariot1(8);
		tblusu.setUsuariot1("Paolo Guerrero");
		tblusu.setPasswordt1("josecarlo987");

		//Invoco el m�todo Actualizar
		usuimp.ActualizarUsuario(tblusu);
		//emitims un mensaje por consola
		System.out.println("Datos Actualizados");*/
		
		//TESTEANDO EL METDO ELIMINAR
		//ELIMINAMOS EL
		tblusu.setIdusuariot1(8);
		//invoco el m�todo eiminar...
		usuimp.EliminarUsuario(tblusu);
		//Emitimos un mensaje por pantalla
		System.out.println("Dato eliminado");
		
		/*//TESTEANDO EL M�TODO LISTADO
		List<TblUsuariot1> listadousuario=usuimp.Listado();
		//Aplicamos BUCLE FOR...
		for(TblUsuariot1 lis:listadousuario){
			//Imprimimos por pantalla los datos de la BD
			System.out.println(" codigo "+lis.getIdusuariot1()+
									" usuario "+lis.getUsuariot1()+
									" password "+lis.getPasswordt1());
		}//Fin del bucle FOR*/
		
		/*//TESTEANDO EL M�ODO BUSCAR 
				//Codig a buscar
				tblusu.setIdusuariot1(2);
				TblUsuariot1 bususu=usuimp.BuscarUsuario(tblusu);
				//Imprimimos por pantalla
				System.out.println(" codigo "+bususu.getIdusuariot1()+
						" usuario "+bususu.getUsuariot1()+
						" password "+bususu.getPasswordt1());*/
		
		
	}

}
