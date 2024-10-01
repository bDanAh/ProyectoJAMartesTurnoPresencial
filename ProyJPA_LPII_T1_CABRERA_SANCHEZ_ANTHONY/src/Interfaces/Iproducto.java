package Interfaces;

import java.util.List;

import model.TblProducto;;

public interface Iproducto {
	//declaramos los m�todos
			void RegistrarProducto(TblProducto producto);
			void ActualizarProducto(TblProducto producto);
			void EliminarProducto(TblProducto producto);
			List<TblProducto> Listado();
			TblProducto BuscarProducto(TblProducto producto);
}
