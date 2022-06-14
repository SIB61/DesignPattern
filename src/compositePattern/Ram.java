package compositePattern;

public class Ram extends Product{
    public Ram(String title, int price) {
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
