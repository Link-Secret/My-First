package yzh;
public class OperationFactory
{
  
   public   static Operation createOperation(String op)
   {    
	   Operation opp=null;
       if(op.equals("+"))
       {
    	   opp=new Add();
       }
       else if(op.equals("-"))
       {
    	   opp=new Sub();
       }
       else if(op.equals("*"))
       {
    	   opp=new Multiply();
       }
       else if(op.equals("/"))
       {
    	   opp=new Div();
       }
	   return opp;
   }
}
