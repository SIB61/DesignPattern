package chainOfResponsibilityPattern;

public class DebugLogger extends Logger{
    @Override
    void log(Log l,String message) {
        if(l==Log.d){
            System.out.println("Debug: "+message);
        }
        else{
            if(getNextLogger()!=null){
                getNextLogger().log(l,message);
            }
        }

    }
}
