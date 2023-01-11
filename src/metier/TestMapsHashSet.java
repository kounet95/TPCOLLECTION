package metier;

import java.util.*;

public class TestMapsHashSet {

	public static void main(String[] args) {
		Map <String, Integer> tableassociatif =new HashMap<>();
		tableassociatif.put("un", 1);
		tableassociatif.put("deux", 2);
		tableassociatif.put("trois", 3);
		tableassociatif.put("quatre", 4);
		System.out.println(tableassociatif.get("deux"));
		Set <String> keys = tableassociatif.keySet();
		Collection<Integer> values = tableassociatif.values();
		int resultat =0;
		for(String s :keys) {
			resultat =resultat + tableassociatif.get(s);
		}
		System.out.println(resultat);
		tableassociatif.remove("trois");
		tableassociatif.put("deux",1000);
		System.out.println(keys);
		System.out.println(values);
	}

}
