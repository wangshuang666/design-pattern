package proxy.jdk;

/**
 * 被代理类房东接口
 */
public interface LandlordService {
    /**
     * 收租
     */
    public void rentCollection(String tenantName,String intermediary);

}
