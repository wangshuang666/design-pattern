package proxy.jdk;

/**
 * 具体被代理类B房东
 */
public class BLandlordServiceImpl implements LandlordService{
    @Override
    public void rentCollection(String tenantName,String intermediary) {
        System.out.println(intermediary+"缴纳"+tenantName+"租客的房租"+"给B房东");
    }
}
