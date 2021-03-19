package agent.jdk;

import java.lang.reflect.Proxy;

/**
 * 1.被代理类必须实现接口
 * 2.代理类实现InvocationHandler接口，并重写invoke方法
 * 3.
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

        landlordProxy.rentCollection("租客花花","链家中介小王");
    }
}
