package fangwenzhemoshi;

/**
 * @author zhangkai
 * @date 30/1/21
 */
public class Success extends Action {
    @Override
    public void getManConclusion(Man concreteElementA) {
        System.out.println("Man Success");
    }

    @Override
    public void getWomanConclusion(Woman concreteElementB) {
        System.out.println("Woman Success");
    }
}
