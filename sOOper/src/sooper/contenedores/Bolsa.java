package sooper.contenedores;

import java.time.LocalDate;

import sooper.Caducable;
import sooper.enums.TipoContenedor;

public class Bolsa extends Contenedor implements Caducable{
	
	private static final long ANYOS_CADUCIDAD = 5;
	private int ancho;
	private LocalDate fechaCompra;
	
	public Bolsa(String referencia, int alto, int ancho, int resistencia) {
		super(referencia, alto, resistencia);
		this.ancho = ancho;
		this.fechaCompra = LocalDate.now();
	}

	@Override
	public int getSuperficie() {
		int radio = getDiametro() / 2;
		return (int)(Math.PI * radio * radio);
	}

	private int getDiametro() {
		return (int) ((int)(2 * ancho) / Math.PI);
	}

	@Override
	public TipoContenedor getTipo() {
		return TipoContenedor.BOLSA;
	}

	@Override
	public boolean estaCaducado() {
		return LocalDate.now().isBefore(fechaCompra.plusYears(ANYOS_CADUCIDAD));
	}

}
