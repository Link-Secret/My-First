package yzh;

public class Test
{

	public static void main(String[] args)
	{
		double a=3;
		double b=4;
		String oper="p";
		Operation op=OperationFactory.creatOperation(oper);
		op.setFirstNum(a);
	     op.setSecondNum(b);
		System.out.print(op.getResult());
		

	}

}
