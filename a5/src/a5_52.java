
import java.util.Scanner;
public class a5_52 {
     public static void main(String[] args){
    	 Scanner in=new Scanner(System.in);
          
    	    int[] arr=new int[5];
    	     int sum=0;
    	   for(int i=0;i<5;i++){
    		  System.out.println("Ոݔ���"+(i+1)+"�W���ɿ�");
    		arr[i]=in.nextInt();
    		 sum+=arr[i];
    	   }
    	   System.out.println("ƽ���ɿ���"+sum/5);
    	 in.close();
     }
     
}

