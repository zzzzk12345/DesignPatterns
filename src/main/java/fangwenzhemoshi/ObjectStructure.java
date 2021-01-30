package fangwenzhemoshi;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangkai
 * @date 30/1/21
 */
public class ObjectStructure {
    private List<Person> elements = new ArrayList<Person>();

    // 增加
    public void attach(Person element) {
        elements.add(element);
    }

    // 减少
    public void detach(Person element) {
        elements.remove(element);
    }

    // 查看显示
    public void show(Action action) {
        for (Person element : elements) {
            element.accept(action);
        }
    }
}
