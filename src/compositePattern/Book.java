package compositePattern;

public class Book extends Product{
    public Book(String title, int price) {
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
