/**
 * @Description:
 * @Author: lay
 * @Date: Created in 17:05 2018/12/5
 * @Modified By:IntelliJ IDEA
 */
public class NullCustomer extends Customer {
    public boolean isNull(){
        return true;
    }
    public BillingPlan getPlan(){
        return BillingPlan.basic();
    }
    public String getName(){
        return "occupant";
    }
    public PaymentHistory getHistory(){
        return PaymentHistory.newNull();
    }
}
