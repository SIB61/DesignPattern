package chainOfResponsibilityPattern;

public class Main {

    public static void main(String[] args) {
        Logger logger1 = new ErrorLogger();
        Logger logger2 = new WarningLogger();
        Logger logger3 = new DebugLogger();
        logger1.setNextLogger(logger2);
        logger2.setNextLogger(logger3);
        logger3.setNextLogger(logger1);

        logger1.log(Log.d,"this is for debugging");
        logger1.log(Log.e,"this is an error");
        logger1.log(Log.w,"this is a warning");

        logger3.log(Log.e,"this is an error");
    }
}
