package demo01.broker;

import demo01.order.Order;
import demo01.stock.Stock;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: lay
 * @Date: Created in 10:17 2018/12/12
 * @Modified By:IntelliJ IDEA
 */
public class Broker {
    private List<Order> orderList=new ArrayList<>();

    public void takerOrder(Order order) {
        orderList.add(order);
    }
    public void placeOders(){
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
