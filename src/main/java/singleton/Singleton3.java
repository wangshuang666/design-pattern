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

    public synchronized  static  Singleton3 getInstance(){
        return  new Singleton3();
    }

}
