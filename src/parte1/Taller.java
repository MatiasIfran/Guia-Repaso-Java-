package parte1;

public class Taller extends Capacitacion{

	private Integer Cant_max_alumnos;
	private Integer Duracion_taller;
	private Integer Cant_insc;
	private Double costo_hora;
	
	public Taller(Integer cant_max_alumnos, Integer duracion_taller, Integer cant_insc, Double costo_hora) {
		super();
		Cant_max_alumnos = cant_max_alumnos;
		Duracion_taller = duracion_taller;
		Cant_insc = cant_insc;
		this.costo_hora = costo_hora;
	}

	public int OtorgarCredito() {
		int credito=0;
		if(Duracion_taller<=72) {
			credito = Duracion_taller/6;
			if(this.isEsPrioritaria()==true) {
				return credito +=1;
			}else return credito;
		}
		return 0;
	}
	
	public Double Costo() {
		if(this.isEsPrioritaria()==true) {
			return costo_hora*Duracion_taller*1.20;
		}
		return costo_hora*Duracion_taller;
	}
	
	public Integer getCant_max_alumnos() {
		return Cant_max_alumnos;
	}
	public void setCant_max_alumnos(Integer cant_max_alumnos) {
		Cant_max_alumnos = cant_max_alumnos;
	}
	public Integer getDuracion_taller() {
		return Duracion_taller;
	}
	public void setDuracion_taller(Integer duracion_taller) {
		Duracion_taller = duracion_taller;
	}
	public Integer getCant_insc() {
		return Cant_insc;
	}
	public void setCant_insc(Integer cant_insc) {

		Cant_insc = cant_insc;
	}
	public Double getCosto_hora() {
		return costo_hora;
	}
	public void setCosto_hora(Double costo_hora) {
		this.costo_hora = costo_hora;
	}

	@Override
	public Double costo() {
		
		return null;
	}

}
