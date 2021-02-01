package clases;

public class AppWeb  extends AppSoftware{

	private String Nombre_Backend;
	private String Nombre_Frontend;
	
	
	
	


	

	public AppWeb(String lenguajeProgramacion, boolean basededatos, double complejidad, int lineasCodigo, int casosTest,
			String nombre_Backend, String nombre_Frontend) {
		super(lenguajeProgramacion, basededatos, complejidad, lineasCodigo, casosTest);
		Nombre_Backend = nombre_Backend;
		Nombre_Frontend = nombre_Frontend;
	}

	public AppWeb() {
	}
	
	public String getNombre_Backend() {
		return Nombre_Backend;
	}
	public void setNombre_Backend(String nombre_Backend) {
		Nombre_Backend = nombre_Backend;
	}
	public String getNombre_Frontend() {
		return Nombre_Frontend;
	}
	public void setNombre_Frontend(String nombre_Frontend) {
		Nombre_Frontend = nombre_Frontend;
	}





	@Override
	public float imprimirStack() {
		System.out.println("LA TECNOLOGIA POR LA QUE ME PREGUNTA ES WEB Y EL"
								+ " FRONT ES: " + Nombre_Frontend + "\n "
								+ "Y EL BACK ES " + Nombre_Backend + "\n"
								+ "El lenguaje de programacion es "+getLenguajeProgramacion()+"\n"
								+ "\n La Base de datos" + getHaybasededatos() + "\n"
								+ "La complejidad "+calcularCalidad(getComplejidad())+"\n"
								+ "Has usado "+getCasosTest()+"\n"
								+ "");
		return 0;
	}

}
