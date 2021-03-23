package singleton;

/**
 * 单例模式的特点
 * 1.内存中只有一个实例
 * 2.只能自己创建自己的实例
 * 3.给其他对象提供自己的实例
 */
public class Singleton3 {

    private static Singleton3 singleton ;


    private Singleton3(){
        if(singleton==null){
            singleton =new Singleton3();
        }
    }
    /**
     * Singleton2 存在现线程安全问题，所以添加了synchronized
     * 例如线程a执行完 if(singleton==null)，线程执行权被线程b抢走
     * 线程b在判断if(singleton==null)的时候，依然为true，所以线程a和线程b new了两次对象
     */
    public synchronized  static  Singleton3 getInstance(){
        return  new Singleton3();
    }

}
