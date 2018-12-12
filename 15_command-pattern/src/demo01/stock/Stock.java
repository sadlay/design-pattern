package demo01.stock;

/**
 * @Description:
 * @Author: lay
 * @Date: Created in 10:12 2018/12/12
 * @Modified By:IntelliJ IDEA
 */
public class Stock {
    private String stockName="ABC";
    private int quantity=10;

    public void buy(){
        System.out.println("Stock [ Name: "+stockName+", Quantity: " + quantity +" ] bought");
    }
    public void sell(){
        System.out.println("Stock [ Name: "+stockName+", Quantity: " + quantity +" ] sold");
    }
}
