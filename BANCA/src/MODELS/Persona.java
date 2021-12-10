package MODELS;

public class Persona {

	// Propiedades

	private String nombre;
	private String apellidos;
	private String dni;
	private double sueldo;
	private CuentaCorriente cuenta;

	// Construtor

	public Persona(String nombre, String dni, int sueldo, CuentaCorriente cuenta) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.sueldo = sueldo;
		this.cuenta = cuenta;

	}

	

	// Getter y setter
	public CuentaCorriente getCuenta() {
		return cuenta;
	}

	public void setCuenta(CuentaCorriente cuenta) {
		this.cuenta = cuenta;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public String getDni() {
		return dni;
	}

	public double getSueldo() {
		return sueldo;
	}

	// Metodos

	public void cobrarSueldo(double cantidad) {
		
		cuenta.sumarCantidad(sueldo);
		}

	public void sacarPasta(double cantidad) {
		
		cuenta.restarCantidad(sueldo);
	}

	public void subirSueldo(double nuevoSueldo) {

		this.sueldo =  nuevoSueldo;
		
	}

	// ToString
	@Override
	public String toString() {
		return String.format("Persona [nombre=%s,  dni=%s, sueldo=%s, cuenta=%s]", nombre,dni,
				sueldo, cuenta);
	}

	
}
