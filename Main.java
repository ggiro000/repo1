package ControlVersions;

public class Main {

	public static void main(String[] args) {
		
		String nom="AAA";
		
		for(int i=0;i<nom.length();i++){
			pinta(nom.charAt(i));
		}
	}

	
	public static void pinta(char c){
		switch (c) {
		case 'A':
		case 'a':
			pinta_A();				
			break;	
		default:
			break;
		}
	}
	
	public static void pinta_A(){
		System.out.println(" xxx");
		System.out.println("x   x");
		System.out.println("xxxxx");
		System.out.println("x   x");
		System.out.println("");
	}
		
}


