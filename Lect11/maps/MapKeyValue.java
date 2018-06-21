package maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapKeyValue {
	
	public static void main(String[] main) {
		Scanner sc = new Scanner(System.in);
		HashMap<String,String> maps = new HashMap<String,String>();
		
		String key = "";
		String value = "";
		String quit = "quit";
		
		System.out.println("IN ORDER TO STOP ENTERING, ENTER YOUR NAME AS quit");
		System.out.print("Enter your name : ");
		key = sc.nextLine();
		while(!(key.equals(quit))) {
			System.out.print("Enter your Phone Number : ");
			value = sc.nextLine();
			maps.put(key,value);
			System.out.print("Enter your name : ");
			key = sc.nextLine();
		}
		
		sc.close();
		
		for(Map.Entry map:maps.entrySet()) {
			System.out.println("Key : "+map.getKey()+"    Value : "+map.getValue());
		}
		
	}

}
