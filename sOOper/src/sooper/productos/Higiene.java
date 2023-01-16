package sooper.productos;

import sooper.IProducto;

public class Higiene extends Producto {

	public Higiene(String referencia, int peso, int volumen) {
		super(referencia, peso, volumen);
	}

	@Override
	public String getCategoria() {
		return "Higiene";
	}

	@Override
	public boolean esCompatible(IProducto producto) {
		// TODO Auto-generated method stub
		return false;
	}

}
