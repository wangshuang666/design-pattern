package agent.cglib;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 代理类
 */
public class Intermediary implements MethodInterceptor {
    /**
     *
     * @param o cglib生成的代理对象
     * @param method cglib生成的代理对象
     * @param objects 方法入参
     * @param methodProxy 代理方法
     * @return
     * @throws Throwable
     */
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("befor");
        methodProxy.invokeSuper(o,objects);
        System.out.println("after");
        return null;
    }
}
