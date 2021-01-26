package gongchangmoshi.chouxianggongchang;

/**
 * @author zhangkai
 * @date 26/1/21
 */
public class SqlserverDepartment implements IDepartment {
    public void insertDepartment(Department department) {
        System.out.println("在Sqlserver中给Department表增加一条记录");
    }

    public Department getDepartment(int id) {
        System.out.println("在Sqlserver中查找Department一条记录");
        return null;
    }
}
