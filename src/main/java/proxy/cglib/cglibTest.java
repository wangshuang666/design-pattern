package proxy.cglib;

import org.springframework.cglib.core.DebuggingClassWriter;
import org.springframework.cglib.proxy.Enhancer;

/**
 * 底层是基于jdk实现，只是做了一些优化
 * JDK代理要求被代理的类必须实现接口，有很强的局限性。
 * 而CGLIB动态代理则没有此类强制性要求。
 * 简单的说，CGLIB会让生成的代理类继承被代理类，并在代理类中对代理方法进行强化处理(前置处理、后置处理等)。
 * 在CGLIB底层，其实是借助了ASM这个非常强大的Java字节码生成框架。
 */
public class cglibTest {
    public static void main(String[] args) {
        // 代理类class文件存入本地磁盘方便我们反编译查看源码
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "D:\\project\\test\\mygithub\\design-pattern\\code");
        // 通过CGLIB动态代理获取代理对象的过程
        Enhancer enhancer = new Enhancer();
        // 设置enhancer对象的父类
        enhancer.setSuperclass(CLandlordService.class);
        //设置回调函数
        enhancer.setCallback(new Intermediary());
        // 创建代理对象
        CLandlordService cLandlordService = (CLandlordService) enhancer.create();
        // 通过代理对象调用目标方法
        cLandlordService.rentCollection("租客花花","链家小王");
    }
}
