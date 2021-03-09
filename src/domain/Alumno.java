package domain;

public class Alumno {
	
	private String matricula;
	private String curso;
	
	public Alumno() {}
	
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

	@Override
	public String toString() {
		return "Alumno [matricula=" + matricula + ", curso=" + curso + "]";
	}
	
	
}
