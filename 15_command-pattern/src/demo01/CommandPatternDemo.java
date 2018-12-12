package demo01;

import demo01.broker.Broker;
import demo01.order.impl.BuyStock;
import demo01.order.impl.SellStock;
import demo01.stock.Stock;

/**
 * @Description:
 * @Author: lay
 * @Date: Created in 10:19 2018/12/12
 * @Modified By:IntelliJ IDEA
 */
public class CommandPatternDemo {
    public static void main(String[] args){
        Stock stock=new Stock();

        BuyStock buyStock=new BuyStock(stock);
        SellStock sellStock=new SellStock(stock);

        Broker broker=new Broker();
        broker.takerOrder(buyStock);
        broker.takerOrder(sellStock);

        broker.placeOders();
    }
}
