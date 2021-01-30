package fangwenzhemoshi;

/**
 * @author zhangkai
 * @date 30/1/21
 */
public class Failure extends Action {
    @Override
    public void getManConclusion(Man concreteElementA) {
        System.out.println("Man Failure");
    }

    @Override
    public void getWomanConclusion(Woman concreteElementB) {
        System.out.println("Woman Failure");
    }
}
