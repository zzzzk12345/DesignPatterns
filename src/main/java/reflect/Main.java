package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author zhangkai
 * @date 24/1/21
 */
public class Main {

    public static void main(String[] args) {
        new Main().getInstance().sayHello("zhangkai");
        new Main().getInstace2Arg("zhangkai", 24).sayHello("zhangkai", 24);
        new Main().reflectMethod();
        new Main().reflect();
    }

    // 通过反射构建无参对象
    public ReflectServiceImpl getInstance() {
        ReflectServiceImpl object = null;
        // 通过Class.forName("$PATH").newInstance()的形式，反射得到 ReflectServiceImpl 对象
        try {
            object = (ReflectServiceImpl) Class.forName("reflect.ReflectServiceImpl").newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return object;
    }

    // 通过反射构建2参数对象
    public ReflectServiceImpl2Arg getInstace2Arg(String name, int num) {
        ReflectServiceImpl2Arg object = null;
        try {
            object = (ReflectServiceImpl2Arg) Class.forName("reflect.ReflectServiceImpl2Arg")
                    .getConstructor(String.class, int.class).newInstance(name, num);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return object;
    }

    // 通过反射获得方法
    public Object reflectMethod() {
        Object returnObj = null;
        ReflectServiceImpl2Arg target = new ReflectServiceImpl2Arg("zhangkai", 24);
        try {
            Method method = ReflectServiceImpl2Arg.class.getMethod("sayHello", String.class, int.class);
            returnObj = method.invoke(target, "zhangkai", 24);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return returnObj;
    }

    // 结合，先反射对象，在反射方法
    public void reflect() {
        try {
            ReflectServiceImpl2Arg obj = (ReflectServiceImpl2Arg) Class.forName("reflect.ReflectServiceImpl2Arg")
                    .getConstructor(String.class, int.class).newInstance("zhangkai", 24);
            Method method = ReflectServiceImpl2Arg.class.getMethod("sayHello", String.class, int.class);
            method.invoke(obj, "zhangkai", 24);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}


