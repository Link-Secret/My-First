
import java.util.Scanner;
public class a5_52 {
     public static void main(String[] args){
    	 Scanner in=new Scanner(System.in);
          
    	    int[] arr=new int[5];
    	     int sum=0;
    	   for(int i=0;i<5;i++){
    		  System.out.println("請輸入第"+(i+1)+"學生成績");
    		arr[i]=in.nextInt();
    		 sum+=arr[i];
    	   }
    	   System.out.println("平均成績為"+sum/5);
    	 in.close();
     }
     
}

