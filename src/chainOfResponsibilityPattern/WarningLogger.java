package chainOfResponsibilityPattern;

public class WarningLogger extends Logger{
    @Override
    void log(Log l,String message) {
        if(l==Log.w){
            System.out.println("Warning: "+message);
        }
        else{
            if(getNextLogger()!=null){
                getNextLogger().log(l,message);
            }
        }

    }
}
