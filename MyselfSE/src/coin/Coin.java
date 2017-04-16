package coin;

import java.util.HashMap;
import java.util.Scanner;

public class Coin {
    private HashMap<Integer, String>  coinsname = new HashMap<Integer, String>(); 
	
    
    public Coin(){
    	coinsname.put(1, "first");
        coinsname.put(2, "second");
        coinsname.put(5, "fiveth");
        
//        System.out.println(coinsname.keySet().size());  //输出coinsname（hashmap类型）的key值的size
//    	  System.out.println(coinsname);
    	
    	for(Integer k : coinsname.keySet()){   //对于coinsname里面的key值（integer）
    		String s = coinsname.get(k);         //get k的值再赋给s
            System.out.println(s);
    		
    	}
    }
    
    
    
    public String getName(int amount){
    	if(coinsname.containsKey(amount))
    		return coinsname.get(amount);
    	else 
    		return "NOT　FOUND";
    }
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int amount = in.nextInt();
		Coin coin = new Coin();
		String name = coin.getName(amount);
		System.out.println(name);

	}

}
