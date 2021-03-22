package observer.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ApplicationContext(spring容器)在初始化完毕
 * 通知
 */
public class SpringObserverTest {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("SpringObserverApplicationContext.xml");


    }
}
