package Test;

import DaoImp.UsuarioImp;
import model.TblUsuario;

public class TestUsuario {

	public static void main(String[] args) {
		// Realizamos la respectiva instancia
		TblUsuario tblusu=new TblUsuario();
		UsuarioImp usuimp=new UsuarioImp();
		//asignamos valores
		tblusu.setIdusuario(3);;
		tblusu.setUsuario("jose valverde");
		tblusu.setClave("65487956");
		//invocamos el metodo para registrar
		usuimp.RegistrarUsuario(tblusu);
		System.out.println("Datos Registrados");
	}

}
