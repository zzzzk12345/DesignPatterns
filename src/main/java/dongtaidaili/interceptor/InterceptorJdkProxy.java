package dongtaidaili.interceptor;


import dongtaidaili.HelloWorld;
import dongtaidaili.HelloWorldImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author zhangkai
 * @date 25/1/21
 */
public class InterceptorJdkProxy implements InvocationHandler {

    private Object target; // 真实对象

    private String interceptorClass; // 拦截器全限定名

    public Object bind(Object target, String interceptorClass) {
        this.target = target;
        this.interceptorClass = interceptorClass;
        return Proxy.newProxyInstance(target.getClass().getClassLoader()
                , target.getClass().getInterfaces()
                , this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (interceptorClass == null) {
            return method.invoke(target, args);
        }
        Object res = null;
        Interceptor inter = (Interceptor) Class.forName(interceptorClass).newInstance();
        if (inter.before(proxy, target, method, args)) {
            res = method.invoke(target, args);
        } else {
            inter.around(proxy, target, method, args);
        }
        inter.after(proxy, target, method, args);
        return res;
    }

    public static void main(String[] args) {
        InterceptorJdkProxy interceptorJdkProxy = new InterceptorJdkProxy();
        HelloWorld proxy = (HelloWorld) interceptorJdkProxy.bind(new HelloWorldImpl()
                , "dongtaidaili.interceptor.MyInterceptor");
        proxy.hello();
    }
}
