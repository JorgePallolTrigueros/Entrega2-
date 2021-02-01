package clases;

public abstract class AppSoftware{

		private String LenguajeProgramacion;
		private boolean Basededatos;
		private double Complejidad;
		private int LineasCodigo;
		private int CasosTest;
		private String haybasededatos;

		
		public AppSoftware(String lenguajeProgramacion, boolean basededatos, double complejidad, int lineasCodigo,
				int casosTest) {
			super();
			LenguajeProgramacion = lenguajeProgramacion;
			Basededatos = basededatos;
			Complejidad = complejidad;
			LineasCodigo = lineasCodigo;
			CasosTest = casosTest;
		}
		
		public AppSoftware() {}

		public String getLenguajeProgramacion() {
			return LenguajeProgramacion;
		}

		public void setLenguajeProgramacion(String lenguajeProgramacion) {
			LenguajeProgramacion = lenguajeProgramacion;
		}

		public boolean isBasededatos() {
			return Basededatos;
		}

		public void setBasededatos(boolean basededatos) {
			Basededatos = basededatos;
		}

		public double getComplejidad() {
			return Complejidad;
		}

		public void setComplejidad(double complejidad) {
			Complejidad = complejidad;
		}

		public int getLineasCodigo() {
			return LineasCodigo;
		}

		public void setLineasCodigo(int lineasCodigo) {
			LineasCodigo = lineasCodigo;
		}

		public int getCasosTest() {
			return CasosTest;
		}

		public void setCasosTest(int casosTest) {
			CasosTest = casosTest;
		}

		
		
		
		
		public String getHaybasededatos() {
			return haybasededatos;
		}

		public void setHaybasededatos(String haybasededatos) {
			this.haybasededatos = haybasededatos;
		}

		
		
		
		public abstract float imprimirStack();
		
		
		/* Metodo para volver */
		public double calcularCalidad(double Complejidad) {
			
			double valoracion =100.00;
					if (Complejidad >= 11 && Complejidad <= 20) {
							valoracion=valoracion-10;			
					}
					else if (Complejidad >= 21 && Complejidad <= 50) {
						valoracion=valoracion-30;			
					}
					else if (Complejidad >=50) {
						valoracion=valoracion-50;			
					}
					else if (Complejidad >=50 && CasosTest <= 3000) {
						valoracion=valoracion-20;			
					}
					
					return valoracion;
		}
		
		
		
		
		public boolean haybasededatos(boolean Basededatos) {
			
			
					if (Basededatos=true) {
						System.out.println("Hay Base de datos");
						this.haybasededatos = "Hay Base de datos";			
					}
					else {
						System.out.println("No hay Base de datos");
						this.haybasededatos = "Ho hay Base de datos";										
					}
					
					return Basededatos;
		}	

		
		
		
		@Override
		public String toString() {
			return "AppSoftware [LenguajeProgramacion=" + LenguajeProgramacion + ", Basededatos=" + Basededatos
					+ ", Complejidad=" + Complejidad + ", LineasCodigo=" + LineasCodigo + ", CasosTest=" + CasosTest
					+ "]";
		}
		
		
		
}
