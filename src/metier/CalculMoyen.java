package metier;

import java.util.Collection;
import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CalculMoyen {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		Map<String,Double> maClass =new HashMap<>();
		 System.out.print("Entrer le nom :");
			String key = scanner.next();

		System.out.print("Entrer le nom :");
		double nots =scanner.nextDouble();
			maClass.put(key, nots);
	 while (nots!=-1) {
		   System.out.print("Entrer le nom :");
			key = scanner.next();

		System.out.print("Entrer le nom :");
		nots =scanner.nextDouble();
			maClass.put(key, nots);

	 }
	 Collection<Double> notes = maClass.values();
	 Set<String> noms=maClass.keySet();
	 double somme=0;
	 for(String s :noms) {
		 
		 somme+=maClass.get(s);
		}
	 System.out.println(maClass);
	 System.out.println("La moyenne est :"+somme/maClass.size());
	 
	 
				
		
	System.out.println("le max est:"+ Collections.max(maClass));
	System.out.println("le max est:" +Collections.min(maClass));

	}

}
