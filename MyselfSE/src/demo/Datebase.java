package demo;

import java.util.ArrayList;


public class Datebase {
    private ArrayList<Item> listItem = new ArrayList<Item>();
    
    public void add(Item item){
    	listItem.add(item);
    }
	
    public void list( ){
    	 for(Item item :listItem){
    		 item.print();
    	 }
    }
    
	public static void main(String[] args) {
		Datebase db =new Datebase();
		db.add(new CD("qingtian",60,"jayzhou"));
        db.add(new CD("yuanyouhui",35,"jayzhou"));
        db.add(new DVD("Secret",120,"jayzhou"));
        db.list();
	}

}
