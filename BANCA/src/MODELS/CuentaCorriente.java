package MODELS;

public class CuentaCorriente {

	// Propiedades
	private int NumeroCuenta;
	private double saldo;
	private Persona titular;

	
	// Constructor
	public CuentaCorriente(int numerocuenta2, double saldo, Persona titular) {
		super();
		NumeroCuenta = numerocuenta2;
		this.saldo = saldo;
		this.titular = titular;
	}

	
	// Getter y setter
	public int getNumeroCuenta() {
		return NumeroCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public Persona getTitular() {
		return titular;

	}

	public void setTitular(Persona titular) {
		this.titular = titular;
	}

	// Metodos

	public void sumarCantidad(double cantidad) {
		
		this.saldo = this.saldo += cantidad;
		
	}

	public void restarCantidad(double cantidad) {

		this.saldo = this.saldo -= cantidad;
	}

	// ToString

	@Override
	public String toString() {
		return String.format("CuentaCorriente [NumeroCuenta=%s, saldo=%s, persona=%s]", NumeroCuenta, saldo, titular);
	}

}
