package proxy.staticAgent;


/**
 * 具体被代理类A房东
 */
public class ALandlordServiceImpl implements LandlordService{
    public void rentCollection(String tenantName,String intermediary) {
        System.out.println(intermediary+"缴纳"+tenantName+"租客的房租"+"给A房东");
    }
}
