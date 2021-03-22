package factory.simplefactroy;

/**
 * 用于创建对象简单
 * 工厂方法模式并不是23种设计模式中的内容
 * 好处：1.用一个工厂就能创建其他很多对象，降低了程序耦合度
 * 2.调用这想要创建对象，只需要知道用那个工厂创建什么对象就可以了，不用知道怎么创建对象
 */
public class SimpleFactroyTest {
    public static void main(String[] args) {
        Car dazhong = CarFactroy.getBean(CarEnum.DAZHONG);
        System.out.println( dazhong.creatCar());
        Car bentian = CarFactroy.getBean(CarEnum.BENTIAN);
        System.out.println( bentian.creatCar());
    }
}
