/**
 * @Description:
 * @Author: lay
 * @Date: Created in 16:55 2018/12/5
 * @Modified By:IntelliJ IDEA
 */
public class Site {
    private Customer customer;

    Customer getCustomer(){
        return customer==null?customer.newNull():customer;
    }

}
