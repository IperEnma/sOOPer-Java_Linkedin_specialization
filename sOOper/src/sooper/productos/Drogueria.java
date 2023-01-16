package sooper.productos;

import sooper.IProducto;
import sooper.enums.Categoria;

public class Drogueria extends Producto {

	public Drogueria(String referencia, int peso, int volumen) {
		super(referencia, peso, volumen);
	}

	@Override
	public Categoria getCategoria() {
		return Categoria.DROGUERIA;
	}

	@Override
	public boolean esCompatible(IProducto producto) {
		// TODO Auto-generated method stub
		return false;
	}

}
