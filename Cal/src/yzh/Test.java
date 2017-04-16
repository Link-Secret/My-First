package yzh;

import java.util.Scanner;

public class Test
{
	public static void main(String[] args)
	{
		Scanner sin=new Scanner(System.in);
	System.out.println("input numA:");
	double numA=sin.nextDouble();
	System.out.println("input numB:");
	double numB=sin.nextDouble();
	System.out.println("input operator:");
	String op=sin.next();
	Operation o=OperationFactory.createOperation(op);
	
	o.setNumA(numA);
	o.setNumB(numB);
	
	double rs=o.getResult();
	System.out.println(rs);
	
	}

}
