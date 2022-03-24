package br.dio.exceptions;

public class DivisaoNaoExataException extends Exception{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@SuppressWarnings("unused")
	private int numerador;
    @SuppressWarnings("unused")
	private int denominador;

    public DivisaoNaoExataException(String message, int numerado, int denominador) {
        super(message);
        this.numerador = numerado;
        this.denominador = denominador;
    }
}
