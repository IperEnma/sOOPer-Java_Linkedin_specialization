package sooper.contenedores;

public class Bolsa extends Contenedor{
	
	private int ancho;
	
	public Bolsa(String referencia, int alto, int ancho) {
		super(referencia, alto);
		this.ancho = ancho;
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
	public String getTipo() {
		return "Bolsa";
	}

}