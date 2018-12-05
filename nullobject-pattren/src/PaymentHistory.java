/**
 * @Description:
 * @Author: lay
 * @Date: Created in 16:56 2018/12/5
 * @Modified By:IntelliJ IDEA
 */
public class PaymentHistory {
    private int weeksDelinquentInLastYear;
    public int getWeeksDelinquentInLastYear(){
        return weeksDelinquentInLastYear;
    }
    public static  NullPaymentHistory newNull(){
        return new NullPaymentHistory();
    }

}
