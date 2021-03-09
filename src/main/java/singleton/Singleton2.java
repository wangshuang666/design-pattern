package singleton;

/**
 * 单例模式的特点
 * 1.内存中只有一个实例
 * 2.只能自己创建自己的实例
 * 3.给其他对象提供自己的实例
 */
public class Singleton2 {

    private static Singleton2 singleton ;

    private Singleton2(){
        if(singleton==null){
            singleton =new Singleton2();
        }
    }

    public static Singleton2 getInstance(){
        return new Singleton2();
    }

}
