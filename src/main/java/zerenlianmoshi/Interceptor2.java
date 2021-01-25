package zerenlianmoshi;

import dongtaidaili.interceptor.Interceptor;

import java.lang.reflect.Method;

/**
 * @author zhangkai
 * @date 25/1/21
 */
public class Interceptor2 implements Interceptor {
    public boolean before(Object proxy, Object target, Method method, Object[] args) {
        System.out.println("【拦截器2】的before方法");
        return true;
    }

    public void around(Object proxy, Object target, Method method, Object[] args) {
        System.out.println("【拦截机2】的around方法");
    }

    public void after(Object proxy, Object target, Method method, Object[] args) {
        System.out.println("【拦截器2】的after方法");
    }
}
