package Tasca1_S3_exercici1_3;
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class Main__S3_exercici1_3 {
	static String resposta = ""; 
	static String nomUser= "";
	public static void main(String[] args) {
		 
		final int INTENTS = 10; 
		String clau = ""; 
		String valor = "";
		int suma = 0;

		Scanner lector = new Scanner(System.in);
	    HashMap <String, String > dadesMap = new HashMap <String, String>(); 
		File fitxer = new File("C:\\Users\\formacio\\eclipse-workspace\\Tasca1_S3Collections\\dades\\countries.txt"); // ruta d'on està el fitxer
		
		try {
					
			lector = new Scanner(fitxer);
					
			while(lector.hasNext()) { // llegir fins que troba un element 
				
				clau= lector.next(); // llegeix el primer string fins al valor i el guarda 
				valor = lector.next();
				
				dadesMap.put(clau, valor); // ficar valors als hashmap
						    
			}
			
			System.out.println(dadesMap);
		
			lector.close();
				
		}catch(IOException e) {
			
			System.out.println("No s'ha trobat el fitxer");
			
			
		}
		 
		// demanar nom a l'usuari: 
		demanarNom();
		
		// mostrar els paisos de forma aleatoria 
		
	
		 Random r = new Random();
		 
		System.out.println("Recorrer las claves");
		
        for (String clave : dadesMap.keySet()) {
            valor = (dadesMap.get(clave));
            System.out.println("Clave: " + clave + " valor:" + valor);
        }
        
     
		for (int i = 0; i < INTENTS; i++) {
			
			 	Object[] crunchifyKeys = dadesMap.keySet().toArray();


		        Object keyValor = crunchifyKeys[new Random().nextInt(crunchifyKeys.length)];
		        

		        System.out.println("************ Random Value ************ \n" + keyValor + " :: " );
		        
		        respostaUser();
		        
		    	System.out.println(keyValor);
				
				
				valor = (dadesMap.get(keyValor)); // Agafo el valor de la clau valor
				
		        
				if(resposta.equalsIgnoreCase(valor)) {
	         	
					suma++;
	     	
	     		System.out.println("Has encertat");
	     	
			 	}else {
	     	
			 		 System.out.println("Has fallat");
			 	}
	            		
			
		}
		// Haig de guarda en un hashmap el nom de l'usuari amb la puntuacio i ficar-ho al arxiu  
		
		//HashMap <String, Integer> dadesJoc = new HashMap <String, Integer>();
		
		//dadesJoc.put(nomUser, suma);
		
		// crear arxiu // que no sobreescriba 
		
		File file2 = new File("C:\\Users\\formacio\\eclipse-workspace\\Tasca1_S3Collections\\dades\\classificacio.txt");
		String arxiu= nomUser +" "+ suma;
		
		try {
			
			FileWriter fw = new FileWriter(file2);
	        BufferedWriter bw = new BufferedWriter(fw);
	        bw.write(arxiu);
	        bw.close();
				
			
		}catch(Exception e) {
			
			
		}
		
		
		
	}
	public static String demanarNom() {
		
		
		Scanner entrada = new Scanner (System.in); 
		
		System.out.println("Introdueixi el seu nom:");
		nomUser = entrada.next(); 
		
		return nomUser;
	
	}
	 public static String respostaUser() {
		 
		 
		 Scanner entrada = new Scanner(System.in);
		 
		System.out.println("Introdueixi la capital en anglès:");
		resposta= entrada.next(); 
			
		 
		 return resposta; 
		 
	 }
	
	
}


