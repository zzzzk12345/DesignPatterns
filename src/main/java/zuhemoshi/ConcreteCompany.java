package zuhemoshi;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangkai
 * @date 28/1/21
 */
public class ConcreteCompany extends Company {
    // 树枝节点
    private List<Company> children = new ArrayList<Company>();

    public ConcreteCompany(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {
        children.add(company);
    }

    @Override
    public void remove(Company company) {
        children.remove(company);
    }

    @Override
    public void display(int depth) {
        StringBuilder head = new StringBuilder();
        while (head.length() < depth) {
            head.append("-");
        }
        System.out.println(head.toString()+name);
        for (Company company : children) {
            company.display(depth+2);
        }
    }

    @Override
    public void lineOfDuty() {
        for (Company company : children) {
            company.lineOfDuty();
        }
    }
}
