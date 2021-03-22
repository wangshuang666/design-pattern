package proxy.cglib;

/**
 * 被代理类房东C
 */
public class CLandlordService {
    public void rentCollection(String tenantName,String intermediary) {
        System.out.println(intermediary+"缴纳"+tenantName+"租客的房租"+"给C房东");
    }
}
