package dongtaidaili.jdk;

import dongtaidaili.HelloWorld;
import dongtaidaili.HelloWorldImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author zhangkai
 * @date 24/1/21
 */
public class JdkProxyExample implements InvocationHandler {

    private Object target;

    public Object bind(Object target) {
        this.target = target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                this);
    }

    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        System.out.println("进入代理逻辑方法");
        System.out.println("在调度真实对象之前的服务");
        Object obj = method.invoke(target, objects);
        System.out.println("在调度真实对象之后的服务");
        return obj;
    }

    public static void main(String[] args) {
        JdkProxyExample jdk = new JdkProxyExample();
        HelloWorld proxy = (HelloWorld)jdk.bind(new HelloWorldImpl());
        proxy.hello();
        proxy.hi();
    }
}
