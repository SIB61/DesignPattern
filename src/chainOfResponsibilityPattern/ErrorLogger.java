package chainOfResponsibilityPattern;

public class ErrorLogger extends Logger{
    @Override
    void log(Log l,String message) {
        if(l==Log.e){
            System.out.println("Error: "+message);
        }
        else{
            if(getNextLogger()!=null){
                getNextLogger().log(l,message);
            }
        }

    }
}
