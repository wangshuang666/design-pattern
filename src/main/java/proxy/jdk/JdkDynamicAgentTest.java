package proxy.jdk;

import java.lang.reflect.Proxy;

/**
 * 1.被代理的对象必须要实现一个接口，BLandlordServiceImpl
 * 2.代理需要实现InvocationHandler，中介
 * 3.代理过程在invoke中实现,中介处理业务的过程
 * 4.创建代理对象Proxy.newProxyInstance实现，客户端调用
 */
public class JdkDynamicAgentTest {
    public static void main(String[] args) {
        //创建被代理类
        LandlordService landlord = new BLandlordServiceImpl();
        LandlordService landlordProxy = (LandlordService) Proxy.newProxyInstance(
                //被代理的类加载器
                BLandlordServiceImpl.class.getClassLoader(),
                //被代理类实现的所有接口
                BLandlordServiceImpl.class.getInterfaces(),
                //代理类
                new Intermediary(landlord));

        landlordProxy.rentCollection("租客花花", "链家中介小王");
    }
}
