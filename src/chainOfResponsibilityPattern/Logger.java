package chainOfResponsibilityPattern;

public abstract class Logger {
   private Logger nextLogger;

   public Logger getNextLogger() {
      return nextLogger;
   }

   public void setNextLogger(Logger nextLogger) {
      this.nextLogger = nextLogger;
   }

   abstract void log(Log l,String message);
}
