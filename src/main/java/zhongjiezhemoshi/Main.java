package zhongjiezhemoshi;

/**
 * @author zhangkai
 * @date 30/1/21
 */
public class Main {
    // 用一个中介对象来封装一系列的对象交互
    public static void main(String[] args) {
        UnitedNationSecurityCouncil unitedNationSecurityCouncil = new UnitedNationSecurityCouncil();
        USA usa = new USA(unitedNationSecurityCouncil);
        Iraq iraq = new Iraq(unitedNationSecurityCouncil);

        unitedNationSecurityCouncil.setIraq(iraq);
        unitedNationSecurityCouncil.setUsa(usa);

        iraq.declare("Iraq Message");
        usa.declare("USA Message");
    }
}
