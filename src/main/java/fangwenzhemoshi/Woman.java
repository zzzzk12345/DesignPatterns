package fangwenzhemoshi;



/**
 * @author zhangkai
 * @date 30/1/21
 */
public class Woman extends Person {
    public void accept(Action visitor) {
        visitor.getWomanConclusion(this);
    }

}
