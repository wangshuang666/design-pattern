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

    public   static Singleton5 getInstance(){
        return  new Singleton5();
    }

}
