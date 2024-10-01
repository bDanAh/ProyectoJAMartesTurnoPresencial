package Interfaces;

import java.util.List;

import model.TblUsuariot1;;

public interface Iusuario {
	//declaramos los métodos
		void RegistrarUsuario(TblUsuariot1 usuario);
		void ActualizarUsuario(TblUsuariot1 usuario);
		void EliminarUsuario(TblUsuariot1 usuario);
		List<TblUsuariot1> Listado();
		TblUsuariot1 BuscarUsuario(TblUsuariot1 usuario);

}
