package yzh;

public class Pow extends Operation
{
	/**
	 * @return 两个操作数x^y的结果
	 */
	public double getResult()
	{
		return Math.pow(this.getFirstNum(),this.getSecondNum());
	}
}
