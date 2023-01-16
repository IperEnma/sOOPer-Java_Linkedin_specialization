package sooper.contenedores;

import java.util.HashSet;
import java.util.Set;

import sooper.IContenedor;
import sooper.IProducto;

public abstract class Contenedor implements IContenedor{

	private String referencia;
	private int alto;
	private int resistencia;
	private Set<IProducto> productos;

	public Contenedor(String referencia, int alto) {
		this.referencia = referencia;
		this.alto = alto;
		productos = new HashSet<IProducto>();
	}

	@Override
	public String getReferencia() {
		return referencia;
	}

	@Override
	public int getVolumen() {
		return alto * getSuperficie();
	}

	@Override
	public int getResistencia() {
		return resistencia;
	}

	@Override
	public int volumenDisponible() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Set<IProducto> getProductos() {
		return productos;
	}

	@Override
	public boolean meter(IProducto producto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean resiste(IProducto producto) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Contenedor: " + referencia
				+ " [" + getTipo() + "]"
				+ "(" + "Superficie: " + getSuperficie() + "cm2"
				+ ", Volumen: " + getVolumen() + "cm3"
				+ ", Resistencia: " + resistencia + "g"
				+ ", Volumen disponible: " + volumenDisponible() + "cm3" + ")"
				+ "\n");
		if (productos.isEmpty()) {
			sb.append("\t No tiene productos");
		}
		for (IProducto producto : productos) {
			sb.append("\t" + producto + "\n");
		}
		return sb.toString();
	}

}
