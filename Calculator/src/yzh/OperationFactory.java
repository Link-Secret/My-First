package yzh;

public class OperationFactory
{
	
	 public static Operation creatOperation(String oper)
	 {
		 Operation op=null;
		if(oper=="+")
		{
			op=new Add();
		}
		else if(oper=="-")
		{
			op=new Sub();
		}
		else if(oper=="p")
		{
			op=new Pow();
		}
		
		return op;
	 }

}
