/**
 * @Description:
 * @Author: lay
 * @Date: Created in 16:59 2018/12/5
 * @Modified By:IntelliJ IDEA
 */
public class main {
    public static void doSomethingbefore(){
        Site site=new Site();
        Customer customer=site.getCustomer();
        BillingPlan plan;
        if(customer==null){
            plan=BillingPlan.basic();
        }else{
            plan=customer.getPlan();
        }

        String customerName;
        if(customer==null){
            customerName="occupant";
        }else{
            customerName=customer.getName();
        }

        int weeksDelingquent;
        if(customer==null||customer.getHistory()==null){
            weeksDelingquent=0;
        }else{
            weeksDelingquent=customer.getHistory().getWeeksDelinquentInLastYear();
        }
        System.out.println(customerName);
        System.out.println(weeksDelingquent);
    }

    public static void doSomethingAfter(){
        Site site=new Site();
        Customer customer=site.getCustomer();
        BillingPlan billingPlan=customer.getPlan();
        String customerName=customer.getName();
        int weeksDelinquentInLastYear = customer.getHistory().getWeeksDelinquentInLastYear();
        System.out.println(customerName);
        System.out.println(weeksDelinquentInLastYear);
    }


    public static void main(String[] args){
        //doSomethingbefore();
        doSomethingAfter();
    }
}
