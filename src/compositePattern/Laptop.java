package compositePattern;

public class Laptop extends Product{
    public Laptop(String title, int price) {
        super(title, price);
    }

    @Override
    int calculatePrice() {
        return price;
    }

    @Override
    int calculateItems() {
        return 1;
    }
}
