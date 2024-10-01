package interfaces;

import java.util.List;

import model.TblCliente;

public interface Icliente {
	//declaramos los métodos
	void RegistrarCliente(TblCliente cliente);
	void ActualizarCliente(TblCliente cliente);
	void EliminarCliente(TblCliente cliente);
	List<TblCliente> Listado();
	TblCliente BuscarCliente(TblCliente cliente);
	
	
	
}
