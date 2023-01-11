package metier;

import java.util.*;

public class TestSetHast {

	public static void main(String[] args) {
		Set <String> brands = new HashSet<>();
		brands.add("wilson");
		brands.add("nike");
		brands.add("volvo");
		brands.add("kia");
		brands.add("lenevo");
		brands.add("ibm");
		brands.add("ibm");
		System.out.println(brands);
		Set <String> brands2 = new HashSet<>();
		brands2.add("kia");
		brands2.add("moto");
		brands2.add("lenevo");
		brands2.add("oumar");
		int tail =brands.size();
		System.out.format("le set contient %d element %n", tail);
		System.out.println(brands);
		System.out.println("--------------------utilisation du foreach");
		brands.forEach(e->System.out.println(e));
		System.out.println("--------------affichage avec iterateur");
		Iterator<String> it = brands.iterator();
		while (it.hasNext()) {
			String e = it.next();
			System.out.println(e);
		}
		brands.remove("kia");
		brands.remove("lenevo");
		System.out.println(brands);
		brands.removeAll(brands2);
		System.out.println(brands);
		if (brands.isEmpty());
		System.out.println("le set est vide ");
	}

}
