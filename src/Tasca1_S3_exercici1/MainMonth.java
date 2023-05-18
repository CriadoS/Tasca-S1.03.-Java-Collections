package Tasca1_S3_exercici1;
import java.util.*;
public class MainMonth {

	public static void main(String[] args) {
		
		// exercici 1 
		ArrayList <Month> mesos = new ArrayList <Month>();
		
		// crear cada mes 
		Month mesG = new Month("Gener");
		Month mesF = new Month("Febrer");
		Month mesM = new Month("Març");
		Month mesA = new Month("Abril");
		Month mesMa = new Month("Maig");
		Month juny = new Month("Juny");
		Month juliol = new Month("Juliol");
		Month set = new Month("Setembre");
		Month nov = new Month("Novembre");
		Month des = new Month("Desembre");
		
		
		// Afegir els diferents mesos a l'arraylist 
		mesos.add(mesG);
		mesos.add(mesF);
		mesos.add(mesM);
		mesos.add(mesA);
		mesos.add(mesMa);
		mesos.add(juny);
		mesos.add(juliol);
		mesos.add(set);
		mesos.add(nov);
		mesos.add(des);
	
		
		System.out.println("té un lenght de "+ mesos.size()); // mirar quina llargada té 
		
		// crea el mes d'agost i afegir el mes d'agost en la posició 7
		
		Month agost = new Month("Agost"); 
		mesos.add(7,agost); 
		
		
		//Mostrar per pantalla que mante l'ordre 
		for(Month m: mesos) {
			
			System.out.println(m);
			
		}
		
		// crear un hashset del mesos
		Set <Month> mesosHSet = new HashSet<Month>();
		
		// Afegir els diferents mesos al HashSet
			mesosHSet.add(mesG);
			mesosHSet.add(mesF);
			mesosHSet.add(mesM);
			mesosHSet.add(mesA);
			mesosHSet.add(mesMa);
			mesosHSet.add(juny);
			mesosHSet.add(juliol);
			mesosHSet.add(set);
			mesosHSet.add(nov);
			mesosHSet.add(des);
			System.out.println("--------------------------");
			
	 // Comprovar que no em deixa posar duplicats 
			
		Month mesDuplicat = new Month("Agost"); // creo un mes duplicat 
		
	// Intento afegir el mes agost duplicat 
		
		System.out.println(mesosHSet.add(mesDuplicat)); // Com està duplicat ens torna un true; 
		
	// Mostro per pantalla la llista hashSet, no surten endreçats
		System.out.println("--------------------------");
		
		for(Month m: mesosHSet) {
			
			System.out.println(m);
			
		}
		
	// Iterador 
		Iterator<Month> it = mesosHSet.iterator();
		
		System.out.println("--------------------------");
		System.out.println("Mostrar dades amb iterador: ");
		
		while(it.hasNext()) { // mentre hi hagi un element continua el bucle  
			
			String nomMesos = it.next().getName(); // salta i després llegeix
			
			System.out.println(nomMesos);
		}
		
		
		//Exercici 2 
		
		// Primer list 
		LinkedList <Integer> numeros = new LinkedList <Integer>();
		
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);
		numeros.add(5);
		numeros.add(6);
		
		// Segon list 
		LinkedList <Integer> numeros2 = new LinkedList<Integer>();
		
		numeros2.add(7);
		numeros2.add(8);
		numeros2.add(9);
		numeros2.add(10);
		numeros2.add(11);
		numeros2.add(12);
		
		
		ListIterator <Integer> itNum = numeros.listIterator(numeros2.size()); // per posar el it al final 
		
		
		while(itNum.hasPrevious()) { // anar avançant si hi ha un element previ
			
			numeros2.add(itNum.previous());// afegir el element a list numeros2
					
		}
		
		// mostrar per pantalla els elements del linkedList numeros 2 
		for(Integer n : numeros2) {
			
			System.out.println(n);
			
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
