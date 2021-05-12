package parte1;

public class Curso extends Capacitacion{

	private Docente docente;
	private Integer cant_clases;
	private Integer Duracion_clase;
	private Integer creditos_requerido;
	
	public Curso(Docente docente, Integer cant_clases, Integer duracion_clase, Integer creditos_requerido) {
		super();
		this.docente = docente;
		this.cant_clases = cant_clases;
		Duracion_clase = duracion_clase;
		this.creditos_requerido = creditos_requerido;
	}
	
	public Docente getDocente() {
		return docente;
	}
	public void setDocente(Docente docente) {
		this.docente = docente;
	}
	public Integer getCant_clases() {
		return cant_clases;
	}
	public void setCant_clases(Integer cant_clases) {
		this.cant_clases = cant_clases;
	}
	public Integer getDuracion_clase() {
		return Duracion_clase;
	}
	public void setDuracion_clase(Integer duracion_clase) {
		Duracion_clase = duracion_clase;
	}
	public Integer getCreditos_requerido() {
		return creditos_requerido;
	}
	public void setCreditos_requerido(Integer creditos_requerido) {
		this.creditos_requerido = creditos_requerido;
	}
	
	public int OtorgarCredito() {
		int credito=0;
		if(cant_clases<=5) {
			credito = cant_clases*2;
			
			if(docente.getA�os_antiguedad()<5) {
				credito++;
			}else if(docente.getA�os_antiguedad()<15) {
				credito +=3;
			}else credito +=5;
			
			if(this.isEsPrioritaria()==true) {
				return credito +=2;
			}else return credito;
		}
		return 0;
		
	}
	
	public Double costo() {
		if(this.isEsPrioritaria()==true) {
			return (((docente.getCosto_hora()*1.10)*Duracion_clase)*cant_clases);
		}
		return (docente.getCosto_hora()*Duracion_clase)*cant_clases;
	}
	
}


