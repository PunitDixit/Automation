package toolsQa;

import java.util.HashMap;
import java.util.Set;

public class hmapDemo {

	public static void main(String[] args) {


		String str = "Hello Hello adh Hello My name Hello";

		String [] arr = str.split(" ");

		HashMap<String, Integer> hmap = new HashMap<String, Integer>();

		hmap =null;

		for (int i =0 ; i< arr.length;i++) {


			if (hmap.get(arr[i])!=null) {
				hmap.put(arr[i], hmap.get(arr[i])+1);
			}

			hmap.put(arr[i], 1);

		}

	 Set<String> hKey= hmap.keySet();
	 
		for (String key: hKey) {
		
			System.out.println(hmap.get(key));
	}

	}

}
