package gongchangmoshi.jianDanGongChang;

/**
 * @author zhangkai
 * @date 22/1/21
 */
public class OperationFactory {
    public static Operator getOperator(String desc) {
        return Operator.getOperator(desc);
    }

    public static void main(String[] args) {
        double num1 = 20d, num2 = 0d;
        Operator opAdd = OperationFactory.getOperator("+");
        System.out.println(opAdd.getOperation().operate(num1, num2));
        Operator opSub = OperationFactory.getOperator("-");
        System.out.println(opSub.getOperation().operate(num1, num2));
        Operator opMul = OperationFactory.getOperator("*");
        System.out.println(opMul.getOperation().operate(num1, num2));
        Operator opDiv = OperationFactory.getOperator("/");
        System.out.println(opDiv.getOperation().operate(num1, num2));
    }
}
