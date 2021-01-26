package gongchangmoshi.chouxianggongchang;

/**
 * @author zhangkai
 * @date 26/1/21
 */
public class AccessUser implements IUser {
    public void insertUser(User user) {
        System.out.println("在Access中给User表增加一条记录");
    }

    public User getUser(int id) {
        System.out.println("在Access中根据ID得到User表一条记录");
        return null;
    }
}
