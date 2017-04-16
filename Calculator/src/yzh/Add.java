package yzh;
/**
 * @since JDK7
 * @version 1.0
 * 计算器的加法类， 提供加法运算
 * @author 余正红 03/28/2016
 *
 */
public class Add extends Operation
{
	/**
	 * @return 两个操作数相加的结果
	 */
	public double getResult()
	{
		return this.getFirstNum()+this.getSecondNum();
	}

}
