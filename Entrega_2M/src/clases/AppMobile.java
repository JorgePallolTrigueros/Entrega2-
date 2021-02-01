package clases;

import java.util.Arrays;

public class AppMobile extends AppSoftware {

	private boolean TecnologiaHibrida;
	private String[] permisos;
	private String tecnologia;
	
	


	public AppMobile(String[] permisos, String lenguajeProgramacion, boolean basededatos, double complejidad, int lineasCodigo,
			int casosTest, boolean tecnologiaHibrida) {
		super(lenguajeProgramacion, basededatos, complejidad, lineasCodigo, casosTest);
		this.permisos = permisos;
		this.TecnologiaHibrida = tecnologiaHibrida;
	}

	public AppMobile() {

	}


	
	
	
	
	public boolean eshibrida (boolean Eleccionhibrida) {
		
		if(Eleccionhibrida == true) {
		System.out.println("HiBRIDA");
		this.tecnologia = "HIBRIDA";
		}
		else {
		System.out.println("NATIVA");
		this.tecnologia = "NATIVA";
		}
		return Eleccionhibrida;
	}
	
	
	
	

	@Override
	public float imprimirStack() {
		
		String str = String.join(",", getPermisos());
		
		System.out.println("LA TECNOLOGIA POR LA QUE ME PREGUNTA ES MOBIL Y ES "
							+ getTecnologia() 
							+ "Los permisos son "+str +"\n"
								+ "El lenguaje de programacion es "+getLenguajeProgramacion()+"\n"
								+ "La complejidad "+calcularCalidad(getComplejidad())+"\n"
								+ "\n La Base de datos" + getHaybasededatos() + "\n"
								+ "Has usado "+getCasosTest()+"\n"
								+ "\n La Base de datos" + getHaybasededatos() + "\n"
								+ "");
		return 0;
	
		

	}







	public String getTecnologia() {
		return tecnologia;
	}

	public void setTecnologia(String tecnologia) {
		this.tecnologia = tecnologia;
	}

	@Override
	public String toString() {
		return "AppMobile [TecnologiaHibrida=" + TecnologiaHibrida + ", permisos=" + Arrays.toString(permisos) + "]";
	}

	public boolean isTecnologiaHibrida() {
		return TecnologiaHibrida;
	}

	public void setTecnologiaHibrida(boolean tecnologiaHibrida) {
		TecnologiaHibrida = tecnologiaHibrida;
	}

	public String[] getPermisos() {
		return permisos;
	}

	public void setPermisos(String[] permisos) {
		this.permisos = permisos;
	}



	

	
	
}
