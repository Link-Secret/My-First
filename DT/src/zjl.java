import java.util.*;
public class zjl {
public static void main(String[] args){	
 Scanner in=new Scanner(System.in);
String[][] arr=new String[3][2];
for(int i=0;i<arr.length;i++){
  for(int a=0;a<arr[i].length;a++){	
   System.out.println("ÇëÊäÈëÐÕÃû£º");
     arr[i][a]=in.next();
   }
}
for(int i=0;i<arr.length;i++){	
 for(int a=0;a<arr[i].length;a++){	
   System.out.print(arr[i][a]+"\t");
  }
    System.out.print("\n");
    }
in.close();
}
}