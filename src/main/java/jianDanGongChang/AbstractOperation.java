package jianDanGongChang;

/**
 * @author zhangkai
 * @date 22/1/21
 */
public abstract class AbstractOperation {

    /**
     * 枚举操作符
     */
    public Operator op;

    /**
     * 抽象方法体
     *
     * @param num1
     * @param num2
     * @return
     */
    public abstract Double operate(double num1, double num2);
}


//~ Formatted by Jindent --- http://www.jindent.com
