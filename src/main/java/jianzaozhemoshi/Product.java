package jianzaozhemoshi;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangkai
 * @date 27/1/21
 */
public class Product {
    List<String> parts = new ArrayList<String>();

    public void add(String part) {
        parts.add(part);
    }

    public void show() {
        System.out.println("产品创建");
        for (String part : parts) {
            System.out.println(part);
        }
    }
}
