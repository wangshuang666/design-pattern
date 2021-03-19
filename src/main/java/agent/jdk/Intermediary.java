package agent.jdk;

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
     * @param proxy  代理对象------>在内存中
     * @param method 代理方法
     * @param args   代理方法的参数
     * @return
     * @throws Throwable
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("befor");
        method.invoke(intermediary, args);
        System.out.println("after");
        return null;
    }
}
