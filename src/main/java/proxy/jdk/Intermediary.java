package proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 中介
 */
public class Intermediary implements InvocationHandler {

    private Object intermediary;

    public Intermediary(Object intermediary) {
        this.intermediary = intermediary;
    }

    /**
     * @param proxy  被代理对象的字节码------>在内存中
     * @param method 被代理方法
     * @param args   被代理方法的参数
     * @return
     * @throws Throwable
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("befor");
        Object result = method.invoke(intermediary, args);
        System.out.println("after");
        return result;
    }
}
