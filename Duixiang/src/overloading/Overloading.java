package overloading;

public class Overloading {
       /*重载   Overloading*/
        
        int isprime=56;
        
        void isprime(){
        	System.out.println("hello");
        }
        public Overloading(int intger){
        	 System.out.println(intger);
        }
        
        public Overloading(double dou){
        	System.out.println(dou);
        }
	   
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
         Overloading ol=new Overloading(100);
          ol.isprime();
         Overloading old=new Overloading(100.0);
          old.isprime();
	}

}
