package Test;

import java.util.Date;

import DaoImp.ProductoImp;
import model.TblProducto;

public class TestProducto {
	
	public static void main(String[] args) {
	// Realizamos la respectiva instancia
			TblProducto tblprod=new TblProducto();
			ProductoImp prodimp=new ProductoImp();
			
			/*//asignamos valores
			tblprod.setIdproductot1(4);
			tblprod.setNombret1("Chicitos Peruanos");
			tblprod.setPreciot1(1.5);
			tblprod.setDescripciont1("rico");
			tblprod.setEstadot1("Buen estado");
			Date fecha=new Date();
			Date fechasql=new Date(fecha.getTime());
			tblprod.setFechavencimt1(fechasql);
			tblprod.setFechavencimt1(fechasql);

			//invocamos el metodo para registrar
			prodimp.ActualizarProducto(tblprod);
			System.out.println("Actualizado");*/
			
			//TESTEAMOS EL MTODO ACTUALIZAR
			tblprod.setIdproductot1(3);
			tblprod.setNombret1("Chicitos Peruanos");
			tblprod.setPreciot1(1.5);
			tblprod.setDescripciont1("rico");
			tblprod.setEstadot1("Buen estado");
			Date fecha=new Date();
			Date fechasql=new Date(fecha.getTime());
			tblprod.setFechavencimt1(fechasql);
			Date fechav=new Date();
			Date fechasqlv=new Date(fecha.getTime());
			tblprod.setFechavencimt1(fechasqlv);
			//Invoco el m�todo Actualizar
			prodimp.ActualizarProducto(tblprod);
			//emitims un mensaje por consola
			System.out.println("Datos Actualizados");
			
	
				
	}
}
