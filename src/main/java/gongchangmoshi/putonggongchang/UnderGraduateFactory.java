package gongchangmoshi.putonggongchang;

/**
 * @author zhangkai
 * @date 26/1/21
 */
public class UnderGraduateFactory implements IFactory {
    public LeiFeng createLeiFeng() {
        return new Undergraduate();
    }
}
