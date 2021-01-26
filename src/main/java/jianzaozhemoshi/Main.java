package jianzaozhemoshi;

/**
 * @author zhangkai
 * @date 27/1/21
 */
public class Main {
    // 将一个复杂对象的构建与他的表示分离，使得同样的构建过程可以创建不同的表示。
    // 是当创建复杂对象的算法独立于该对象的组成部分以及他们的装配方法时适用的模式
    public static void main(String[] args) {
        Director director = new Director();
        Product productA = director.constuct(new ConcreteBuilderA());
        Product productB = director.constuct(new ConcreteBuilderB());
        productA.show();
        productB.show();
    }
}
