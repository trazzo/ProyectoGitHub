package domain;

public class Alumno extends Persona{
	
	private String matricula;
	private String curso;
	
	
	public Alumno(String nombre, int edad, String matricula,
			String curso) {
		super(nombre, edad);
		this.matricula = matricula;
		this.curso = curso;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}

	public void responderLista(String saludo) {
		System.out.println(saludo);
	}
	
	@Override
	public String toString() {
		return "Alumno [matricula=" + matricula + ", curso=" + curso + "]";
	}
	
	
}
