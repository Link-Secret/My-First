package yzh;

public class Pow extends Operation
{
	/**
	 * @return ����������x^y�Ľ��
	 */
	public double getResult()
	{
		return Math.pow(this.getFirstNum(),this.getSecondNum());
	}
}
