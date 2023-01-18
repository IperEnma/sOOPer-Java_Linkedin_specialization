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
		return !Categoria.ALIMENTACION.equals(producto.getCategoria())
				&& !Categoria.MASCOTAS.equals(producto.getCategoria());
	}

}
