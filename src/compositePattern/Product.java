package compositePattern;

public abstract class Product extends Box{
     int price;
     String title;
     public Product(String title,int price){
       this.price=price;
       this.title=title;
     }
}
