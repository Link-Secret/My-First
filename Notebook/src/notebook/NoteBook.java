package notebook;


import java.util.ArrayList;





public class NoteBook {	
    private ArrayList<String> notes = new ArrayList<String>();
    
	public void add(String s){
		notes.add(s);
	}
	
	public void add(String s,int location){
		notes.add(location,s);
	}
	
	public int getsize(){
		return notes.size();
	}
	
	public String getNode(int index){
		return notes.get(index);
	}
	
	public void removeNode(int index){
		notes.remove(index);
	}
	
	public String[] list(){
		String a[] = new String[notes.size()];
//		for (int i=0; i<notes.size(); i++){
//			a[i]=notes.get(i);
//		}
		
		notes.toArray(a);
		return a;
	}
	public static void main(String[] args) {
		NoteBook nb = new NoteBook();

		nb.add("first");
		nb.add("Secret");
		nb.add("world",1);
		
		
		System.out.println(nb.getsize());
		System.out.println(nb.getNode(0));
		System.out.println(nb.getNode(1));
		nb.removeNode(1);
		String a[] = nb.list();
		for (String s:a){
			System.out.println(s);
		}
	}

}