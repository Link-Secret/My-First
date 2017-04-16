package demo;

public class DVD extends Item {
    private String dircoter;

	public DVD(String title, int time, String dircoter) {
		super(title, time);
		this.dircoter = dircoter;
	}
    
	public void print(){
		System.out.print("DVD:");
		super.print();
		System.out.println(dircoter);
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}
