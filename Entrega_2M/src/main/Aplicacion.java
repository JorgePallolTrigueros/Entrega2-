package main;

import interfaces.AppMovileService;
import interfaces.AppMovileServiceImplement;
import interfaces.AppWebService;
import interfaces.AppWebServiceImplements;
import interfaces.ApploTService;
import interfaces.ApploTServiceImplement;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

import clases.AppIoT;
import clases.AppMobile;
import clases.AppWeb;
import clases.EProtocols;

public class Aplicacion {

	public static void main(String[] args) {
		
		 Scanner sn = new Scanner(System.in);
	        boolean salir = false;
	        int opcion; //Guardaremos la opcion del usuario
	        while (!salir) {
	        	
	        	

	        	System.out.println("Vamos ha pedir unos datos para poder continuar");
                System.out.println("Dinos, por favor el Lenguaje de Programacion que utilizas");
            	String LenguajeProgramacion = sn.next();
                System.out.println("Dinos, por favor si usas o no base de datos");
                String utilizasbasedatos = sn.next();
                System.out.println("Dinos, por favor el numero de lineas que usas");
                double Complejidad = sn.nextDouble();
                System.out.println("Dinos, por favor las veces probadas");
                int casostest = sn.nextInt();	
	        	
	        	
	        	
			System.out.println("Poir Favor Seleciona uno de estas Opciones");
			System.out.println("1 --- Aplicacion Movil");
			System.out.println("2 --- Aplicacion Web");
			System.out.println("3 --- Aplicacion T");
	            	System.out.println("4. Salir");
	            try {
	                System.out.println("Escribe una de las opciones");
	                opcion = sn.nextInt();
	                switch (opcion) {
	                
	                
	                
	                
	                
	                    case 1:
			                        System.out.println("Has seleccionado la opcion Movil");
			                        AppMovileServiceImplement MovileService = new  AppMovileServiceImplement();
			                        AppMobile movil = MovileService.createApp();
			                        movil.setPermisos(args);
			                        System.out.println("Cuantos permisos tienes?");
			                        
			                      //Creamos el String con los datos llenos que mostraremos al usuario quepermisos tiene opcion
			                        int valor1  = sn.nextInt();
			                        
			                        String[] permisosobtenidos = new String[valor1];
			                        
			                        for (int i=0; i < valor1; i++ ) {
			                        	System.out.println("Inserta el permiso");
			                        	String permiso = sn.next();
			                        	permisosobtenidos[i] = permiso;
			                        }
		                    
			                   
			                        
			                        System.out.println("Dinos, por favor si usas o no tecnologia nativa");
			                        String utilizanativa = sn.next();
			                        System.out.println("la varialbe utilizanativa vale: ");
			                        System.out.println(utilizanativa);
			                        
	                        			//Pregunta sobre que tipo de Tecnologia usas	
			                        if (utilizanativa.contains("si")) {
			                        
			                        	movil.eshibrida(false);
			                        }
			                        else if (utilizanativa.contains("no")) {//Debemos mandar false
			                        	
			                        	movil.eshibrida(true);	
			                        	}	
			                        else {
			                        
			                        	movil.eshibrida(true);
			                        }
			                        
					                movil.calcularCalidad(Complejidad);    
					                movil.setLenguajeProgramacion(LenguajeProgramacion);
					               movil.setCasosTest(casostest);
					               movil.setPermisos(permisosobtenidos);			                        	  
					                     
					                        //Pregunta sobre la base de datos
					                        
		                        if (utilizasbasedatos.contains("si")) {
		                        	System.out.println("utilizanativa es igual a si");
		                        	movil.haybasededatos(true);
		                        }
		                        else if (utilizasbasedatos.contains("no")) {//Debemos mandar false
		                        	System.out.println("utilizanativa es igual a no");
		                        	movil.haybasededatos(false);	
		                        	}	
		                        else {
		                        	System.out.println("sale por el elseeeeeeeeee");
		                        	movil.haybasededatos(false);
		                        }
		                        
		                        
					                        //
					                        System.out.println(utilizanativa);	                        
					                        movil.imprimirStack(); 
     
		                               
                        break;			                        
			                        
			                        
			                        
			                        
			                        
			                        
			                        
			                        
			                        
			                        
			                        
	                    case 2:
			                        System.out.println("Has seleccionado la opcion Web");
			                        System.out.println("Vamos ha pedir unos datos para poder continuar");
				                        System.out.println("Dinos, por favor el fronheand que utilizas");
				                        	String frontheand_nombre = sn.next();
					                    System.out.println("Dinos, por favor el backend que utilizas");
				                        	String backhend_nombre = sn.next();
				                        	
				                        	     
					                        
			                        AppWebServiceImplements WebService = new  AppWebServiceImplements();
			                        AppWeb web = WebService.createApp();
			                        web.setNombre_Backend(backhend_nombre);
			                        web.setNombre_Frontend(frontheand_nombre); 
						          //------------------------------------------------//      	
			                        
			                        if (utilizasbasedatos.contains("si")) {
			                        	
			                        	 web.haybasededatos(true);
			                        }
			                        else if (utilizasbasedatos.contains("no")) {//Debemos mandar false
			                        	
			                        	 web.haybasededatos(false);	
			                        	}	
			                        else {
			                        	
			                        	 web.haybasededatos(false);
			                        }
       
						                 web.calcularCalidad(Complejidad);    
						                 web.setLenguajeProgramacion(LenguajeProgramacion);
						                 web.setCasosTest(casostest);
						                 
						                web.imprimirStack();        
			                               
	                        break;
	                        
	                        
	                        
	                        
	                        
	                        
	                        
	                        
	                    case 3:
	                    	
	                    	
	                    	System.out.println("Has seleccionado la opcion T");
	                    	System.out.println("Dinos, por favor el Protocolo que utilizas");		
	                    	ApploTServiceImplement OtlService= new ApploTServiceImplement();
	                    	AppIoT otlnew = OtlService.createApp();      
	                    	
//HACER UNA ACCION BOLEANA POR WIFI Y POR LA APLICACION GRAFICA IGUAL QUE LA HIBRIDA
	                    	System.out.println("Dinos, por favor si utilizas interfaz grafica");	
	                    	 String utilizagrafica = sn.next();
	                    	 System.out.println("Dinos, por favor si utilizas interfaz wifi");	
	                    	 String utilizawifi = sn.next();
                			//Pregunta sobre que tipo de Tecnologia usas	
	                        if (utilizawifi.contains("no")) {
	                        	otlnew.utilizagrafica(false);
	                        }
	                        else if (utilizawifi.contains("si")) {
	                        	otlnew.utilizagrafica(true);	
	                        	}	
	                        else {
	                        	otlnew.utilizagrafica(true);
	                        }	


	                        if (utilizagrafica.contains("no")) {
	                        	otlnew.utilizagrafica(false);
	                        }
	                        else if (utilizagrafica.contains("si")) {
	                        	otlnew.utilizagrafica(true);	
	                        	}	
	                        else {
	                        	otlnew.utilizagrafica(true);
	                        }               	
	            
                        	
	                        System.out.println("Eliga in protocolo:");
	                        System.out.println(Arrays.toString(EProtocols.values())); //Enum parseado
	                        System.out.println("Dinos, por favor el Protocolo que utilizas");	
	                        String valor = sn.next();
	                        
	                        
	                        
	                        
	                        
	                        
	                        //valor.replace("\n", "");
	                           
	                            switch (valor){
	                            case "AMOP": otlnew.setProtocolo(EProtocols.AMOP);break;
	                            case "HTML": otlnew.setProtocolo(EProtocols.HTML);break;
	                            case "MQTT": otlnew.setProtocolo(EProtocols.MQTT);break;
	                            case "ETC": otlnew.setProtocolo(EProtocols.ETC);break;
	                            case "ASP": otlnew.setProtocolo(EProtocols.ASP);break;
	                            case "PHP": otlnew.setProtocolo(EProtocols.PHP);break;
	                            default:System.out.println("Protocolo incorrecto\"");
	                            }

	                    	
                    			//Pregunta sobre que tipo de Tecnologia usas	
	                        if (utilizasbasedatos.contains("si")) {
	                        	
	                        	otlnew.haybasededatos(true);
	                        }
	                        else if (utilizasbasedatos.contains("no")) {//Debemos mandar false
	                        	
	                        	otlnew.haybasededatos(false);	
	                        	}	
	                        else {
	                        	
	                        	otlnew.haybasededatos(false);
	                        }
	                        
	                        
	                        
	                        otlnew.calcularCalidad(Complejidad);    
	                        otlnew.setLenguajeProgramacion(LenguajeProgramacion);
	                        otlnew.setCasosTest(casostest);	  
	                        
	                        otlnew.calcularCalidad(Complejidad);    
	                        otlnew.setLenguajeProgramacion(LenguajeProgramacion);
	                        otlnew.setCasosTest(casostest);
	                        otlnew.imprimirStack();     
	                        break;  	                        
	                        
	                        
	 
	                        
	                        
	                        
	                        
	                        
	                        
	                        
	                        
	                        
	                    case 4:
	                        salir = true;
	                        break;
	                    default:
	                        System.out.println("Solo numeros entre 1 y 4");
	                }
	            } catch (InputMismatchException e) {
	                System.out.println("Debes insertar un n�mero");
	                sn.next();
	            }
	        }
	    }
	}

