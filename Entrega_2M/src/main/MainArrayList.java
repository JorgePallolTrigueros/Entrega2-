package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MainArrayList {


	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		ArrayList<String> permisos = new ArrayList<String>();
		System.out.println("Dime cuantos valores vas ha meter");
		int valor1  = sn.nextInt();		
        for (int i=0; i < valor1; i++ ) {
        	System.out.println("Inserta los Permisos para llenar el ArrayList");
        	String permisoss = sn.next();
        	permisos.add(permisoss); 
        }

		
		
	    Collections.sort(permisos);  // Sort myNumbers

	    for (String i : permisos) {
	      System.out.println(i);
	    }
	}

}
