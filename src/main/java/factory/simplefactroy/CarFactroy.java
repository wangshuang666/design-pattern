package factory.simplefactroy;

public class CarFactroy {
    public static Car getBean(CarEnum carEnum) {
        switch (carEnum) {
            case BENTIAN:
                return new BenTian();
            case DAZHONG:
                return new DaZhong();
            default:
                return null;
        }

    }
}
