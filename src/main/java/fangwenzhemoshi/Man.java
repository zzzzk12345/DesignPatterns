package fangwenzhemoshi;

/**
 * @author zhangkai
 * @date 30/1/21
 */
public class Man extends Person{

    @Override
    public void accept(Action visitor) {
        visitor.getManConclusion(this);
    }
}
