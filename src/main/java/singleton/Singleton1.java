package singleton;

/**
 * 单例模式的特点
 * 1.内存中只有一个实例
 * 2.只能自己创建自己的实例
 * 3.给其他对象提供自己的实例
 */
public class Singleton1 {

    private static Singleton1 singleton = new Singleton1();

    private Singleton1(){

    }

    public static Singleton1 getInstance(){
        return  singleton;
    }

}
