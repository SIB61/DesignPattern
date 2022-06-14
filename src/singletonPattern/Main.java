package singletonPattern;

public class Main {
    public static void main(String[] args) {
        DbRepository dbRepository = DbRepository.getInstance();
        dbRepository.createAccount();
        DbRepository dbRepository1 = DbRepository.getInstance();
        dbRepository1.createAccount();
    }
}
