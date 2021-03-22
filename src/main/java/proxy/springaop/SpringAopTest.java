package proxy.springaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAopTest {
    public static void main(String[] args) {
        /**
         * DefaultAopProxyFactory
         * return new ObjenesisCglibAopProxy(config);cglib动态代理
         *  return new JdkDynamicAopProxy(config);jdk动态代理
         */
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-aop.xml");
        UserServiceImpl userServiceImpl = (UserServiceImpl) applicationContext.getBean("userServiceImpl");
        userServiceImpl.findUser();
    }
}
