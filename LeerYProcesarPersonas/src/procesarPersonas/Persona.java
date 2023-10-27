package procesarPersonas;

public class Persona implements Comparable<Persona>{
	private Integer dni;
	private String apenom;
	private Integer edad;
	public Persona(Integer dni, String apenom, Integer edad) {
		super();
		this.dni = dni;
		this.apenom = apenom;
		this.edad = edad;
	}
	@Override
	public String toString() {
		return  dni + ";" + apenom + ";" + edad;
	}
	public Integer getDni() {
		return dni;
	}
	public void setDni(Integer dni) {
		this.dni = dni;
	}
	public String getApenom() {
		return apenom;
	}
	public void setApenom(String apenom) {
		this.apenom = apenom;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	@Override
	public int compareTo(Persona o) {
		return this.apenom.compareTo(o.getApenom());
	}
}
