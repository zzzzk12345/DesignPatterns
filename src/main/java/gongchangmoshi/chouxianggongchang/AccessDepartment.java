package gongchangmoshi.chouxianggongchang;

/**
 * @author zhangkai
 * @date 26/1/21
 */
public class AccessDepartment implements IDepartment {
    public void insertDepartment(Department department) {
        System.out.println("在Access中给Department表增加一条记录");
    }

    public Department getDepartment(int id) {
        System.out.println("在Access中根据ID得到Department表一条记录");
        return null;
    }
}
