package qiaojiemoshi;

/**
 * @author zhangkai
 * @date 28/1/21
 */
public abstract class HandSetBrand {
    protected HandSetSoft handSetSoft;

    public void setHandSetSoft(HandSetSoft handSetSoft) {
        this.handSetSoft = handSetSoft;
    }

    public abstract void run();
}
