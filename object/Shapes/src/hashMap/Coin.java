package hashMap;

import java.util.HashMap; 
import java.util.Scanner;


public class Coin {

	private HashMap<Integer, String> coinsname = new HashMap<>();
	
	public Coin(){
		coinsname.put(1, "one");
		coinsname.put(2, "two");
		coinsname.put(3, "three");
		coinsname.put(4, "four");
		System.out.println(coinsname.keySet().size());  //hashmapÈÝÆ÷µÄsize
	    System.out.println(coinsname);
	    
	    for(Integer k:coinsname.keySet()){
	    	String s = coinsname.get(k);
	    	System.out.println(s);
	    }
	}
	
	public String getName(int amount){
		if(coinsname.containsKey(amount))
		   return coinsname.get(amount);
		else
		    return "not found";
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int amount = in.nextInt();
        Coin coin = new Coin();
        String name = coin.getName(amount);
        System.out.println(name);
        
        in.close();
	}
  
}
