package reflect;

/**
 * @author zhangkai
 * @date 24/1/21
 */
public class ReflectServiceImpl2Arg {
    private String name;

    private int num;

    public ReflectServiceImpl2Arg(String name, int num) {
        this.name = name;
        this.num = num;
    }

    public void sayHello(String name, int num) {
        System.out.println("hello" + name + ", " + num);
    }
}
