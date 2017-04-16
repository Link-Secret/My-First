import java.util.Scanner;
public class TS{
   public static void main(String[] args){
	   Scanner in=new Scanner(System.in);
	    int[] arr=new int[5];
	    int sum=0;
	     for(int i=0;i<5;i++){
	    	 System.out.println("请输入第"+(i+1)+"学生成绩");
	    	 arr[i]=in.nextInt();
	    	 sum+=arr[i];
	     }
	   System.out.println("平均成绩为"+sum/5);
	   in.close();
   }
       
}
