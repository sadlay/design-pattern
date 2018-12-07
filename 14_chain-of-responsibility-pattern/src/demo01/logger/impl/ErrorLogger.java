package demo01.logger.impl;

import demo01.logger.AbstractLogger;

/**
 * @Description:
 * @Author: lay
 * @Date: Created in 20:00 2018/12/7
 * @Modified By:IntelliJ IDEA
 */
public class ErrorLogger extends AbstractLogger {
    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
