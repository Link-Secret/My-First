package coin;

import java.util.HashMap;
import java.util.Scanner;


public class Coin {
    private HashMap<Integer, String> coinnames = new HashMap<Integer, String>();
    
    public Coin(){  //���캯����
    	coinnames.put(1, "one");
    	coinnames.put(2,"two");
    	coinnames.put(10, "ten");
    	
    	System.out.println(coinnames.keySet().size());  //���coinsname��hashmap���ͣ���keyֵ��size
    	System.out.println(coinnames);  //���hashmap
    	
    	for(Integer k : coinnames.keySet()){   //����coinsname�����������coinsname�����keyֵ��integer��
    		String s = coinnames.get(k);       //get k��ֵ�ٸ���s
    		System.out.println(s);
    	}
    }
    
    public String getName(int amount){  //�ӿ�
    	if(coinnames.containsKey(amount))   //�������contains���key(amount)
    	  return coinnames.get(amount); 
    	else 
			return "NOT FOUND";	
    }
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int amount = in.nextInt();
		Coin coin = new Coin();    //��������
		String name = coin.getName(amount);  //������get��amount����name
		System.out.println(name);    //���name

	}

}
