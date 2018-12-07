package demo01.logger.impl;

import demo01.logger.AbstractLogger;

/**
 * @Description:
 * @Author: lay
 * @Date: Created in 19:59 2018/12/7
 * @Modified By:IntelliJ IDEA
 */
public class ConsoleLogger extends AbstractLogger {
    public ConsoleLogger(int level) {
        this.level=level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
