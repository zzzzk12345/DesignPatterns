package jianzaozhemoshi;

/**
 * @author zhangkai
 * @date 27/1/21
 */
public class ConcreteBuilderA extends Builder{
    private Product product = new Product();

    @Override
    public void buildPartA() {
        product.add("部件A_A");
    }

    @Override
    public void buildPartB() {
        product.add("部件A_B");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
