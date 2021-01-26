package gongchangmoshi.chouxianggongchang;

/**
 * @author zhangkai
 * @date 26/1/21
 */
public class SqlserverUser implements IUser {
    public void insertUser(User user) {
        System.out.println("在Sqlserver中给User表增加一条记录");
    }

    public User getUser(int id) {
        System.out.println("在Sqlserver中根据ID得到User表的一条记录");
        return null;
    }
}
