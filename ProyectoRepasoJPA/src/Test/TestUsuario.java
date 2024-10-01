package Test;

import DaoImp.UsuarioImp;
import model.TblUsuario;

public class TestUsuario {
	public static void main(String[] args) {
		// Realizamos la respectiva instancia
		TblUsuario tblusu=new TblUsuario();
		UsuarioImp usuimp=new UsuarioImp();
		//asignamos valores
		tblusu.setIdusuario(123456);
		tblusu.setUsuario("carlos perez");
		tblusu.setClave("123456789");
		//invocamos el metodo para registrar
		usuimp.RegistrarUsuario(tblusu);
		System.out.println("Datos Registrados");
	}

}
