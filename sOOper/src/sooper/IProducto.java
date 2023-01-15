package sooper;

public interface IProducto {
	
	String getReferencia();
	
	int getPeso();
	
	int getVolumen();
	
	String getCategoria();
	
	boolean esCompatible(IProducto producto);
	
	boolean puedeEntrar(IContenedor contenedor  );
}
