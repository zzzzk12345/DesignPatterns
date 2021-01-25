package dongtaidaili.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import reflect.ReflectServiceImpl;

import java.lang.reflect.Method;

/**
 * @author zhangkai
 * @date 24/1/21
 */
public class CglibProxyExample implements MethodInterceptor {

    public Object bind(Class cls) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(cls);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("调用真实对象前");
        Object res = methodProxy.invokeSuper(o, objects);
        System.out.println("调用真实对象后");
        return res;
    }

    public static void main(String[] args) {
        CglibProxyExample cpe = new CglibProxyExample();
        ReflectServiceImpl obj = (ReflectServiceImpl)cpe.bind(ReflectServiceImpl.class);
        obj.sayHello("zhangkai");
    }
}
