package parte1;

public class App {
	
	public static void main(String[] args) {
		
		Docente D1 = new Docente("Nadine", null, 3, 105.99);
		Docente D2 = new Docente("Juani", null, 9, 50.5);
		
		Curso C1 = new Curso(D1, 10, 4, 10);
		Curso C2 = new Curso(D1, 5, 2, 0);
		Curso C3 = new Curso(D2, 60, 2, 50);
		
		Taller T1 = new Taller(10, 50, 4, 10.5);
		Taller T2 = new Taller(20, 12, 10, 99.99);
		
		Empleado E1 = new Empleado("Matias", 50);
	
		E1.setCapacitacionEmpleado(C1);
		E1.setCapacitacionEmpleado(T2);
		E1.setCapacitacionEmpleado(C2);
		E1.setCapacitacionEmpleado(T2);
		E1.setCapacitacionEmpleado(C3);
		
		
		System.out.println(E1.calcularCreditosObt()); 
		System.out.println("hola mundo");
	}

}
