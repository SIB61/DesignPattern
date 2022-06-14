package singletonPattern;

public class DbRepository {
    int count = 0;
    private DbRepository(){}
    private static DbRepository instance;
    public static DbRepository getInstance(){
        if(instance==null) instance = new DbRepository();
        return instance;
    }
    public void createAccount(){
        System.out.println("user "+count+ " created");
        count++;
    }
}
