package dongtaidaili.interceptor;

import java.lang.reflect.Method;

/**
 * @author zhangkai
 * @date 25/1/21
 */
public interface Interceptor {
    public boolean before(Object proxy, Object target, Method method, Object[] args);

    public void around(Object proxy, Object target, Method method, Object[] args);

    public void after(Object proxy, Object target, Method method, Object[] args);
}
