package gongchangmoshi.chouxianggongchang;

/**
 * @author zhangkai
 * @date 26/1/21
 */
public class DataAccess {
    //private static String db = "Access";
    private static String db = "Sqlserver";

    public static IUser createUser() {
        IUser res = null;
        if ("Sqlserver".equals(db)) {
            res = new SqlserverUser();
        } else if ("Access".equals(db)) {
            res = new AccessUser();
        }
        return res;
    }

    public static IDepartment createDepartment() {
        IDepartment res = null;
        if ("Sqlserver".equals(db)) {
            res = new SqlserverDepartment();
        } else if ("Access".equals(db)) {
            res = new AccessDepartment();
        }
        return res;
    }
}
