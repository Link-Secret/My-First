package inheritance;

public class DVD extends Item{

	
    private String director;
    private boolean gotInt = false;
    

	public DVD(String title, String director, int playingTime, String comment) {
		super(title,comment,playingTime);
		
		this.director = director;
	
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

	}

	public void print() {
		System.out.print("DVD:");
		super.print();
		System.out.println(director);
		
	}

}
