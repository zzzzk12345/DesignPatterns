package waiguanmoshi;

/**
 * @author zhangkai
 * @date 27/1/21
 */
public class Facade {
    private SubSystemOne one;
    private SubSystemTwo two;
    private SubSystemThree three;
    private SubSystemFour four;

    public Facade() {
        one = new SubSystemOne();
        two = new SubSystemTwo();
        three = new SubSystemThree();
        four = new SubSystemFour();
    }

    public void methodA() {
        System.out.println("方法组A：");
        one.methodOne();
        two.methodTwo();
        four.methodFour();
    }

    public void methodB() {
        System.out.println("方法组B：");
        two.methodTwo();
        three.methodThree();
    }
}
