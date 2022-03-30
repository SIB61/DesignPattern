package adapterPattern;

public class Main {
    public static void main(String[] args) {
         Adaptee adaptee = new Adaptee();
         Adapter adapter = new Adapter(adaptee);
         adapter.addNewNote();
         adapter.removeNote();
    }
}
