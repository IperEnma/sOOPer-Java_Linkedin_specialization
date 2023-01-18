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

	public Contenedor(String referencia, int alto, int resistencia) {
		this.referencia = referencia;
		this.alto = alto;
		this.resistencia = resistencia;
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
		return getVolumen() - volumenOcupado();
	}	

	private int volumenOcupado() {
		int volumenTotal = 0;
		for (IProducto p : productos) {
			volumenTotal += p.getVolumen();
		}
		return volumenTotal;
	}

	@Override
	public Set<IProducto> getProductos() {
		return productos;
	}

	@Override
	public boolean meter(IProducto producto) {
		boolean resistenciaOk = resiste(producto);
		boolean volumenOk = producto.tengoEspacio(this);
		boolean compatibilidadOk = true;
		
		for (IProducto p : productos) {
			boolean compatibleOk = producto.esCompatible(p);
			compatibilidadOk &= compatibleOk;
		}
		
		boolean acepta = resistenciaOk && volumenOk && compatibilidadOk;
		if (acepta) {
			productos.add(producto);
			producto.meter(this);
		}
		return acepta;
	}

	@Override
	public boolean resiste(IProducto producto) {
		return resistencia > producto.getPeso();
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
