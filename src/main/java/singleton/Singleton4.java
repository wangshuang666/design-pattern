package singleton;

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

    public   static Singleton4 getInstance(){
        return  new Singleton4();
    }

}
