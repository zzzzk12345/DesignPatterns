package jianzaozhemoshi;

/**
 * @author zhangkai
 * @date 27/1/21
 */
public class Director {
    public Product constuct(Builder builder) {
        builder.buildPartA();
        builder.buildPartB();
        return builder.getResult();
    }
}
