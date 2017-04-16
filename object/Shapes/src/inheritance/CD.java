package inheritance;

public class CD extends Item {
   
    private String artist;
    private int numofTracks;
    
    private boolean gotInt = false;
    
    
	public CD(String title, String artist, int numofTracks, int playingTime,
			String comment) {
		super(title,comment,playingTime);
		
		this.artist = artist;
		this.numofTracks = numofTracks;
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

	public void print() {
		System.out.print("CD:");
		super.print();
		System.out.println(artist);
		
	}

}
