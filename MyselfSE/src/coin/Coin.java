package coin;

import java.util.HashMap;
import java.util.Scanner;

public class Coin {
    private HashMap<Integer, String>  coinsname = new HashMap<Integer, String>(); 
	
    
    public Coin(){
    	coinsname.put(1, "first");
        coinsname.put(2, "second");
        coinsname.put(5, "fiveth");
        
//        System.out.println(coinsname.keySet().size());  //���coinsname��hashmap���ͣ���keyֵ��size
//    	  System.out.println(coinsname);
    	
    	for(Integer k : coinsname.keySet()){   //����coinsname�����keyֵ��integer��
    		String s = coinsname.get(k);         //get k��ֵ�ٸ���s
            System.out.println(s);
    		
    	}
    }
    
    
    
    public String getName(int amount){
    	if(coinsname.containsKey(amount))
    		return coinsname.get(amount);
    	else 
    		return "NOT��FOUND";
    }
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int amount = in.nextInt();
		Coin coin = new Coin();
		String name = coin.getName(amount);
		System.out.println(name);

	}

}