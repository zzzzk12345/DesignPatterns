package zhuangshimoshi;

/**
 * @author zhangkai
 * @date 25/1/21
 */
public class Person {
    private String name;

    public Person(){

    }

    public Person(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("装扮的" + name);
    }
}
