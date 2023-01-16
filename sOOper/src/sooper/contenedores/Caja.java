package sooper.contenedores;

import sooper.enums.TipoContenedor;

public class Caja extends Contenedor{
	
	private int ancho;
	private int largo;
	
	public Caja(int largo, int ancho, int alto, String referencia) {
		super(referencia, alto);
		this.ancho = ancho;
		this.largo = largo;
	}
	
	@Override
	public int getSuperficie() {
		// TODO Auto-generated method stub
		return ancho * largo;
	}

	@Override
	public TipoContenedor getTipo() {
		// TODO Auto-generated method stub
		return TipoContenedor.CAJA;
	}
}
