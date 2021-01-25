package mobanfangfamoshi;

/**
 * @author zhangkai
 * @date 26/1/21
 */
public abstract class TestPaper {
    public void answer() {
        System.out.println("题目一：巴拉巴拉");
        answer1();
        System.out.println("题目二：稀里哗啦");
        answer2();
    }

    /**
     * 第一题的回答
     */
    protected abstract void answer1();

    /**
     * 第二题的回答
     */
    protected abstract void answer2();

}
