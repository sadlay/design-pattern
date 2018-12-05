/**
 * @Description:
 * @Author: lay
 * @Date: Created in 16:55 2018/12/5
 * @Modified By:IntelliJ IDEA
 */
public class Customer {
    private String name;
    private BillingPlan plan;
    private PaymentHistory history;

    public BillingPlan getPlan(){
        return plan;
    }
    public String getName(){
        return name;
    }
    public PaymentHistory getHistory(){
        return history;
    }

    public boolean isNull(){
        return false;
    }

    static Customer newNull(){
        return new NullCustomer();
    }

}
