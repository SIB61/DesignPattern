package flyWeightPattern;

public class Main {
    public static void main(String[] args) {
        for (int i = 0 ; i < 10 ; i ++){
            MetaInfo metaInfo = MetaInfoFactory.getMetaInfo("akash","bindu prokashoni");
            Book book = new Book("hello world in python",300,metaInfo);
            System.out.println("book created");
        }
    }
}
