package demo;

public class CD extends Item {
    private String star;
   
	
	public CD(String title, int time, String star) {
		super(title,time);
		this.star = star;
	}

    public void print(){
    	System.out.print("CD:");
    	super.print();
    	System.out.println(star);
    }
	public static void main(String[] args) {
		

	}

}
