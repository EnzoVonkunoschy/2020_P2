package vectores01;

import java.util.Scanner;

public class VectoresEj01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Leer = new Scanner(System.in);
		
		int miVector [] = new int[5];
		
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println("Ingrese un entero");
			int k = Leer.nextInt();
			if(k%7 != 0) {
				miVector[i]=k;
			}
		}
		
		int aux = 0;
		
		for(int j = 0 ; j < 4 ; j++) {
			
			if(miVector[j]>miVector[j+1]) {
				          aux = miVector[j];
				  miVector[j] = miVector[j+1];
				miVector[j+1] = aux;
			}	
		}		
		
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println("Elemento: "+i+"  "+miVector[i]);
			
		}	
		
		Leer.close();

	}

}
