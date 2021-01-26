package gongchangmoshi.chouxianggongchang;

/**
 * @author zhangkai
 * @date 26/1/21
 */
public class Main {
    // 提供一个创建一系列相关或相互依赖对象的接口，而无需指定他们具体的类。
    public static void main(String[] args) {
        IUser iuser = DataAccess.createUser();
        iuser.insertUser(new User());
        iuser.getUser(1);

        IDepartment idepartment = DataAccess.createDepartment();
        idepartment.insertDepartment(new Department());
        idepartment.getDepartment(1);
    }


}
