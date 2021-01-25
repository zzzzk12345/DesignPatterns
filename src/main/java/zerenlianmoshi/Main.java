package zerenlianmoshi;

import com.sun.org.apache.xml.internal.res.XMLErrorResources_tr;
import dongtaidaili.HelloWorld;
import dongtaidaili.HelloWorldImpl;
import dongtaidaili.interceptor.InterceptorJdkProxy;

/**
 * @author zhangkai
 * @date 26/1/21
 */
public class Main {
    public static void main(String[] args) {
        Interceptor1 interceptor1 = new Interceptor1();
        HelloWorld proxy1 = (HelloWorld) new InterceptorJdkProxy().bind(new HelloWorldImpl()
                , "zerenlianmoshi.Interceptor1");
        Interceptor2 interceptor2 = new Interceptor2();
        HelloWorld proxy2 = (HelloWorld) new InterceptorJdkProxy().bind(proxy1
                , "zerenlianmoshi.Interceptor2");
        Interceptor3 interceptor3 = new Interceptor3();
        HelloWorld proxy3 = (HelloWorld) new InterceptorJdkProxy().bind(proxy2
                , "zerenlianmoshi.Interceptor3");
        proxy3.hello();

    }
}
