package inheritance;

public class Item {
	 private String title;
	 private String comment;
	 private int playingTime;
	 
	
	public Item(String title, String comment, int playingTime) {
		super();
		this.title = title;
		this.comment = comment;
		this.playingTime = playingTime;
	}


	public void print() {
	   
		System.out.print(title+":");
	}

}
