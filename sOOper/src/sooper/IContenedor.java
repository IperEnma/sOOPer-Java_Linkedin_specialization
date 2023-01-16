package sooper;

import java.util.Set;

import sooper.enums.TipoContenedor;

public interface IContenedor {
	
	String getReferencia();
	
	int getVolumen();
	
	int getSuperficie();
	
	int getResistencia();
	
	int volumenDisponible();
	
	Set<IProducto> getProductos();
	
	TipoContenedor getTipo();
	
	boolean meter(IProducto producto);
	
	boolean resiste(IProducto producto);
}
