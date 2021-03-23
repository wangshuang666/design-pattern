package singleton;

import com.sun.deploy.util.StringUtils;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;
import java.util.Date;

/**
 * 单例模式的特点
 * 1.内存中只有一个实例
 * 2.只能自己创建自己的实例
 * 3.给其他对象提供自己的实例
 */
public class Singleton4 {

    private static Singleton4 singleton ;

    private Singleton4(){
        if(singleton==null){

            synchronized (Singleton4.class){

                    singleton =new Singleton4();

            }
        }
    }

    /**
     * Singleton3 因为在getInstance()方法上添加了synchronized所以会有效率问题
     * 例如线程a在getInstance()的时候，线程b也要getInstance()，
     * 线程b就必须得等线程a执行完getInstance()才能执行getInstance()。降低了效率不好
     * 所以将锁移动到构造函数中的if下面，对象等于的空的时候才加锁创建对象
     * @return
     */
    public   static Singleton4 getInstance(){
        return  new Singleton4();
    }

}
