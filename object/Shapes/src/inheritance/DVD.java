package inheritance;

public class DVD extends Item{

	
    private String director;
    private boolean gotInt = false;
    

	public DVD(String title, String director, int playingTime, String comment) {
		super(title,comment,playingTime);
		
		this.director = director;
	
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

	public void print() {
		System.out.print("DVD:");
		super.print();
		System.out.println(director);
		
	}

}
