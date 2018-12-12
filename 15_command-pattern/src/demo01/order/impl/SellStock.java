package demo01.order.impl;


import demo01.order.Order;
import demo01.stock.Stock;

/**
 * @Description:
 * @Author: lay
 * @Date: Created in 10:16 2018/12/12
 * @Modified By:IntelliJ IDEA
 */
public class SellStock implements Order {
    private Stock stock;

    public SellStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.sell();
    }
}
