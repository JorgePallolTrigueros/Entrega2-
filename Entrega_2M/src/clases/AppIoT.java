package clases;

public class AppIoT extends AppSoftware {

	private boolean interfazGrafica;
	private boolean Wiffi;
	private EProtocols protocolo;
	private String tienewifi;
	private String tienegrafiaca;
	
	

	
	
	
	public AppIoT(String lenguajeProgramacion, boolean basededatos, double complejidad, int lineasCodigo, int casosTest,
			boolean interfazGrafica, boolean wiffi, EProtocols protocolo) {
		super(lenguajeProgramacion, basededatos, complejidad, lineasCodigo, casosTest);
		this.interfazGrafica = interfazGrafica;
		this.Wiffi = wiffi;
		this.protocolo = protocolo;
	}

	public AppIoT() {

	}

	
	public String getTienewifi() {
		return tienewifi;
	}

	public void setTienewifi(String tienewifi) {
		this.tienewifi = tienewifi;
	}

	public String getTienegrafiaca() {
		return tienegrafiaca;
	}

	public void setTienegrafiaca(String tienegrafiaca) {
		this.tienegrafiaca = tienegrafiaca;
	}

	public EProtocols getProtocolo() {
		return protocolo;
	}

	public void setProtocolo(EProtocols protocolo) {
		this.protocolo = protocolo;
	}

	
	public boolean isInterfazGrafica() {
		return interfazGrafica;
	}



	public void setInterfazGrafica(boolean interfazGrafica) {
		this.interfazGrafica = interfazGrafica;
	}



	public boolean isWiffi() {
		return Wiffi;
	}



	public void setWiffi(boolean wiffi) {
		Wiffi = wiffi;
	}



	public boolean utilizagrafica (boolean grafica) {
		
		if(grafica == true) {
		System.out.println("Si Se utiliza la grafica");
		this.tienewifi = "Si Se utiliza la grafica";
		}
		else {
		System.out.println("No Se utiliza la grafica");
		this.tienewifi = "No Se utiliza la grafica";
		}
		

		return grafica;
	}

	public boolean  utilizawiffi(boolean wiffi) {
		
		if(wiffi == true) {
		System.out.println("Si Se utiliza la Wiffi");
		this.tienegrafiaca = "Si Se utiliza la Wiffi";
		}
		else {
		System.out.println("No Se utiliza la Wiffi");
		this.tienegrafiaca = "No Se utiliza la Wiffi";
		}
		return wiffi;
	}	
	
	
	
	
	
	@Override
	public float imprimirStack() {
		
		System.out.println("LA TECNOLOGIA POR LA QUE ME PREGUNTA ES T "
							+ getProtocolo()
						
								+ "El lenguaje de programacion es "+getLenguajeProgramacion()+"\n"
								+ "La complejidad "+calcularCalidad(getComplejidad())+"\n"
								+ "\n Wiffi" +getTienewifi() + "\n"
								+ "\n Wiffi" +getTienegrafiaca() + "\n"
								+ "\n GraficaLa Base de datos" +getTienewifi() + "\n"
								+ "\n La Base de datos" + getHaybasededatos() + "\n"
								+ "Has usado "+getCasosTest()+"\n"
								+ "\n La Base de datos" + getHaybasededatos() + "\n"
								+ "");
		return 0;
	}
	
	



	@Override
	public String toString() {
		return "AppIoT [interfazGrafica=" + interfazGrafica + ", Wiffi=" + Wiffi + "]";
	}


	
	
	
}
