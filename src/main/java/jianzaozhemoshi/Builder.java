package jianzaozhemoshi;

/**
 * @author zhangkai
 * @date 27/1/21
 */
public abstract class Builder {
    private Product product = new Product();

    public abstract void buildPartA();

    public abstract void buildPartB();

    public Product getResult() {
        return product;
    }
}
