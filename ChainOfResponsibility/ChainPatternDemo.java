/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChainOfResponsibility;

/**
 *
 * @author felipe
 */
public class ChainPatternDemo {
    /**
     * Different types of error loggers
     * @return AbstractLogger
     */
    private static AbstractLogger getChainOfLoggers(){
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
        
        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        
        return errorLogger;
    }
    
    public static void main(String[]args){
        AbstractLogger loggerChain = getChainOfLoggers();
        loggerChain.logMessage(AbstractLogger.INFO, "This is an information");
        
        loggerChain.logMessage(AbstractLogger.DEBUG, "This is an debug information");
        loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information");
        
    }
    
    
    
}
