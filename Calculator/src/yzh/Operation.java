package yzh;
/**
 * @since JDK7
 * @version 1.0
 * 计算器的父类， 提供构造方法和一个虚方法
 * @author 余正红 03/28/2016
 *
 */
public class Operation
{
	private double firstNum;
	private double secondNum;
	public double getFirstNum()
	{
		return firstNum;
	}
	public void setFirstNum(double firstNum)
	{
		this.firstNum = firstNum;
	}
	public double getSecondNum()
	{
		return secondNum;
	}
	public void setSecondNum(double secondNum)
	{
		this.secondNum = secondNum;
	}
	
	/**
	 *  @param NumA double 第一个操作数
	 * @param NumB double 第二个操作数
	 * @return 返回操作结果
	 */
	public double getResult()
	{
		return 0;
	}
	

}
