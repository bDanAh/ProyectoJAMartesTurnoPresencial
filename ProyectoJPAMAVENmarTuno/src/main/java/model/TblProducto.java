package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the tbl_producto database table.
 * 
 */
@Entity
@Table(name="tbl_producto")
@NamedQuery(name="TblProducto.findAll", query="SELECT t FROM TblProducto t")
public class TblProducto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idproducto;

	private double cantidad;

	private String codbarras;

	private String descripciont1;

	private String estadot1;

	@Temporal(TemporalType.DATE)
	private Date fechafabrit1;

	@Temporal(TemporalType.DATE)
	private Date fechaven;

	@Temporal(TemporalType.DATE)
	private Date fechavencimt1;

	private int idproductot1;

	private String nombret1;

	private String nomprod;

	private String nrolote;

	private double precio;

	private double preciot1;

	private double total;

	public TblProducto() {
	}

	public int getIdproducto() {
		return this.idproducto;
	}

	public void setIdproducto(int idproducto) {
		this.idproducto = idproducto;
	}

	public double getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public String getCodbarras() {
		return this.codbarras;
	}

	public void setCodbarras(String codbarras) {
		this.codbarras = codbarras;
	}

	public String getDescripciont1() {
		return this.descripciont1;
	}

	public void setDescripciont1(String descripciont1) {
		this.descripciont1 = descripciont1;
	}

	public String getEstadot1() {
		return this.estadot1;
	}

	public void setEstadot1(String estadot1) {
		this.estadot1 = estadot1;
	}

	public Date getFechafabrit1() {
		return this.fechafabrit1;
	}

	public void setFechafabrit1(Date fechafabrit1) {
		this.fechafabrit1 = fechafabrit1;
	}

	public Date getFechaven() {
		return this.fechaven;
	}

	public void setFechaven(Date fechaven) {
		this.fechaven = fechaven;
	}

	public Date getFechavencimt1() {
		return this.fechavencimt1;
	}

	public void setFechavencimt1(Date fechavencimt1) {
		this.fechavencimt1 = fechavencimt1;
	}

	public int getIdproductot1() {
		return this.idproductot1;
	}

	public void setIdproductot1(int idproductot1) {
		this.idproductot1 = idproductot1;
	}

	public String getNombret1() {
		return this.nombret1;
	}

	public void setNombret1(String nombret1) {
		this.nombret1 = nombret1;
	}

	public String getNomprod() {
		return this.nomprod;
	}

	public void setNomprod(String nomprod) {
		this.nomprod = nomprod;
	}

	public String getNrolote() {
		return this.nrolote;
	}

	public void setNrolote(String nrolote) {
		this.nrolote = nrolote;
	}

	public double getPrecio() {
		return this.precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getPreciot1() {
		return this.preciot1;
	}

	public void setPreciot1(double preciot1) {
		this.preciot1 = preciot1;
	}

	public double getTotal() {
		return this.total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

}