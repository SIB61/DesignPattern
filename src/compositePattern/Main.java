package compositePattern;

public class Main {
    public static void main(String[] args) {
        CompositeBox box = new  CompositeBox();
        CompositeBox box2 = new CompositeBox();
        CompositeBox box3 = new CompositeBox();

        Product laptop = new Laptop("HP PROBOOK 450",50000);
        Product ram = new Ram("samsung 4gb",2400);
        Product book = new Ram("Harry potter",3000);



        CompositeBox BigBox = new CompositeBox();
        BigBox.add(box);
        BigBox.add(laptop);

        box.add(box2);
        box.add(ram);

        box2.add(box3);
        box2.add(book);

        box3.add(laptop);

        int totalItemsInBigBox = BigBox.calculateItems();
        int totalPriceOfBigBox = BigBox.calculatePrice();

        System.out.println(totalItemsInBigBox);
        System.out.println(totalPriceOfBigBox);


    }
}
