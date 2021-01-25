package dongtaidaili.interceptor;

import java.lang.reflect.Method;

/**
 * @author zhangkai
 * @date 25/1/21
 */
public class MyInterceptor implements Interceptor {
    public boolean before(Object proxy, Object target, Method method, Object[] args) {
        System.out.println("拦截之前");
        // 返回false表示拦截方法，true表示不拦截
        return true;
    }

    public void around(Object proxy, Object target, Method method, Object[] args) {
        System.out.println("拦截成功");
    }

    public void after(Object proxy, Object target, Method method, Object[] args) {
        System.out.println("拦截后");
    }
}
