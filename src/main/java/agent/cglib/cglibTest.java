package agent.cglib;

import org.springframework.cglib.core.DebuggingClassWriter;
import org.springframework.cglib.proxy.Enhancer;

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
