package qiaojiemoshi;

/**
 * @author zhangkai
 * @date 28/1/21
 */
public class Main {
    // 将抽象部分与它的实现部分分离，使他们都可以独立地变化
    public static void main(String[] args) {
        HandSetBrand handSetBrand;
        handSetBrand = new HandSetBrandM();
        handSetBrand.setHandSetSoft(new HandSetGame());
        handSetBrand.run();

        handSetBrand.setHandSetSoft(new HandSetAddressList());
        handSetBrand.run();

        handSetBrand = new HandSetBrandN();
        handSetBrand.setHandSetSoft(new HandSetGame());
        handSetBrand.run();

        handSetBrand.setHandSetSoft(new HandSetAddressList());
        handSetBrand.run();
    }
}
