package demo01;

import demo01.logger.AbstractLogger;
import demo01.logger.impl.ConsoleLogger;
import demo01.logger.impl.ErrorLogger;
import demo01.logger.impl.FileLogger;

/**
 * @Description:
 * @Author: lay
 * @Date: Created in 20:06 2018/12/7
 * @Modified By:IntelliJ IDEA
 */
public class ChainPatternDemo {
    private static AbstractLogger getChainOfLoggers(){
        AbstractLogger errorLogger=new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger=new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger=new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        return  errorLogger;
    }
    public static void main(String[] args){
        AbstractLogger loggerChain=getChainOfLoggers();
        loggerChain.logMessage(AbstractLogger.INFO,
                "This is an information.");

        loggerChain.logMessage(AbstractLogger.DEBUG,
                "This is an debug level information.");

        loggerChain.logMessage(AbstractLogger.ERROR,
                "This is an error information.");
    }
}
