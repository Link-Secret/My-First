package overloading;

public class Overloading {
       /*����   Overloading*/
        
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
		// TODO �Զ����ɵķ������
         Overloading ol=new Overloading(100);
          ol.isprime();
         Overloading old=new Overloading(100.0);
          old.isprime();
	}

}
