package zuhemoshi;

/**
 * @author zhangkai
 * @date 28/1/21
 */
public class FinanceDepartment extends Company {
    public FinanceDepartment(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {

    }

    @Override
    public void remove(Company company) {

    }

    @Override
    public void display(int depth) {
        StringBuilder head = new StringBuilder();
        while (head.length() < depth) {
            head.append("-");
        }
        System.out.println(head.toString()+name);
    }

    @Override
    public void lineOfDuty() {
        System.out.println(name+" 公司财务收支管理");
    }
}
