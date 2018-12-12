package demo01.order.impl;

import demo01.order.Order;
import demo01.stock.Stock;

/**
 * @Description:
 * @Author: lay
 * @Date: Created in 10:15 2018/12/12
 * @Modified By:IntelliJ IDEA
 */
public class BuyStock implements Order {
    private Stock stock;

    public BuyStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.buy();
    }
}
