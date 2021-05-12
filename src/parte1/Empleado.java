package parte1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class Empleado {

	private String nombre;
	private List<Capacitacion> CapacitacionEmpleado;
	
	public Empleado(String nombre) {
		super();
		CapacitacionEmpleado = new ArrayList<Capacitacion>();
		this.nombre = nombre;
	}

	public int calcularCreditosObt() {
		return CapacitacionEmpleado.stream().mapToInt(C->C.OtorgarCredito()).sum();
	}
	
	public Double calcularCosto() {
		return CapacitacionEmpleado.stream().mapToDouble(c->c.costo()).sum();
	}
	
	public OptionalDouble costoPromedio() {
		return CapacitacionEmpleado.stream().mapToDouble(c->c.costo()).average();
	}
	
	public List<Capacitacion> CapacitacionesOrdenadas (Tema tema){
		List<Capacitacion> aux = new ArrayList<Capacitacion>();
		aux = CapacitacionEmpleado.stream().filter(T->T.getTema().equals(tema)).sorted((C1,C2)->Double.compare(C1.costo(), C2.costo())).collect(Collectors.toList());
		Collections.reverse(aux);
		return aux;
	}
	
	public Optional<Object> DocenteCursoMasCredito() {
		return CapacitacionEmpleado.stream().filter(c->c.getClass().equals(Curso.class))
				.max(Comparator.comparing(c->((Curso)c).getCreditos_requerido()))
				.map(c->((Curso)c).getDocente());
	}

	public List<Capacitacion> CapacitacionEstrategica(){
		return CapacitacionEmpleado.stream().filter(c->c.isEsPrioritaria()==true).collect(Collectors.toList());
	}
	
	public List<Capacitacion> CapacitacionesOrdenadasCredito(){
		return CapacitacionEmpleado.stream().sorted((C1,C2)->Integer.compare(C1.OtorgarCredito(), C2.OtorgarCredito()))
				.sorted(Collections.reverseOrder())
				.collect(Collectors.toList());
	}
	
  	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Capacitacion> getCapacitacionEmpleado() {
		return CapacitacionEmpleado;
	}
	public void setCapacitacionEmpleado(Capacitacion c) {
		this.CapacitacionEmpleado.add(c);
	}
	
	
}