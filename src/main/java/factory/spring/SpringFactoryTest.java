package factory.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 *
 */

public class SpringFactoryTest {
    public static void main(String[] args) {


        /**
         * 经典的工厂模式
         *
         *  1.Resource resource = new ClassPathResource("Spring-factory.xml");
         * 解析xml，将xml中的bean存成map，key为id，value为class对象
         * 2.通过AbstractApplicationContext中的getBean看出来的，
         * 点点点org.springframework.beans.factory.support.DefaultSingletonBeanRegistry#getSingleton(java.lang.String, boolean)
         *
         */

        Resource resource = new ClassPathResource("Spring-factory.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);
        Car benTian = (Car) beanFactory.getBean("benTian");
        System.out.println(benTian.creatCar());
        Car daZhong = (Car) beanFactory.getBean("daZhong");
        System.out.println(daZhong.creatCar());


       /* ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring-factory.xml");
        Car benTian1 = (Car) applicationContext.getBean("benTian");
        System.out.println(benTian1.creatCar());
        Car daZhong1 = (Car) applicationContext.getBean("daZhong");
        System.out.println(daZhong1.creatCar());*/
    }
}
