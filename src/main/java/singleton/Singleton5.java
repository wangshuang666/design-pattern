package singleton;

/**
 * 单例模式的特点
 * 1.内存中只有一个实例
 * 2.只能自己创建自己的实例
 * 3.给其他对象提供自己的实例
 */
public class Singleton5 {

    private static Singleton5 singleton ;

    private Singleton5(){
        if(singleton==null){
            synchronized (Singleton5.class){
                if(singleton==null){
                    singleton =new Singleton5();
                }
            }
        }
    }

    /**
     *Singleton4依然存在线程安全问题
     * 例如：线程a运行到synchronized (Singleton5.class)线程的执行权被线程b抢走，执行完 singleton =new Singleton5();
     * 当线程b抢到执行权时继续执行synchronized (Singleton5.class)内容，所以singleton =new Singleton5();被执行了两次
     * 因此在synchronized (Singleton5.class)同步锁里面添加if(singleton==null)判断
     *
     *
     * @return
     */
    public   static Singleton5 getInstance(){
        return  new Singleton5();
    }

}
