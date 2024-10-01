package Interfaces;

import java.util.List;

import model.TblUsuario;

public interface Iusuario {
	//dclaramos los mtodos
		void RegistrarUsuario (TblUsuario usuario);
		void ActualizarUsuario (TblUsuario usuario);
		void EliminarUsuario (TblUsuario usuario);
		List<TblUsuario> Listado();
		TblUsuario BuscarUsuario(TblUsuario usuario);

}
