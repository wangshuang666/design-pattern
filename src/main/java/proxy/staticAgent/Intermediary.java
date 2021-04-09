package proxy.staticAgent;

/**
 * 中介
 */
public class Intermediary implements LandlordService {
   private LandlordService landlordService;

   public Intermediary(LandlordService landlordService){
       this.landlordService=landlordService;
   }

    @Override
    public void rentCollection(String tenantName, String intermediary) {
            System.out.println("befor");
            landlordService.rentCollection(tenantName,intermediary);
            System.out.println("after");

    }
}
