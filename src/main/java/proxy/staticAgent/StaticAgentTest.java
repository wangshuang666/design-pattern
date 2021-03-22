package proxy.staticAgent;


/**
 * 1.代理类要实现被代理类实现的接口
 * 2.代理类中有被代理类的引用
 * 3.代理类在实例化时将被代理类的引用初始化
 */
public class StaticAgentTest {
    public static void main(String[] args) {
        LandlordService aLandlord = new ALandlordServiceImpl();

        LandlordService aLandlordService = new Intermediary(aLandlord);
        aLandlordService.rentCollection("租客花花","链家中介小王");
    }
}
