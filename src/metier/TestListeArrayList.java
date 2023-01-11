package metier;

import java.util.*;

public class TestListeArrayList {

	public static void main(String[] args) {
		List <String> list =new ArrayList <> ();
		list.add("une premiere chaine");
		list.add("une troisieme chaine");
		System.out.println(list.size());
       list.add(1, "deuxieme chaime");
       System.out.println(list.size());
       for(String s :list) {
    	   System.out.println(s);
       }
       String premierElement =list.get(0);
       System.out.println(list.contains("une premiere chaine"));
       System.out.println(list.contains("une troisieme che"));
   list.remove(list.size() - 1);
   System.out.println(list.size());
   String [] tab = {"une autre chaine","et encore une chaine"};
   list.addAll(Arrays.asList(tab));
   System.out.println(list.size());
   System.out.println(list);
	}
}
