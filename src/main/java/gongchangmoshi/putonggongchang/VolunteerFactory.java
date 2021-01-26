package gongchangmoshi.putonggongchang;

/**
 * @author zhangkai
 * @date 26/1/21
 */
public class VolunteerFactory implements IFactory {
    public LeiFeng createLeiFeng() {
        return new Volunteer();
    }
}
