package abstractFactoryPattern;

public class Main {
    public static void main(String[] args) {
        AbstractFactory factory = FactoryProducer.getFactory(false);
        Shape square = factory.getShape(ShapeType.SQUARE);
        Shape rectangle = factory.getShape(ShapeType.RECTANGLE);

        AbstractFactory factory1 = FactoryProducer.getFactory(true);
        Shape square1 = factory1.getShape(ShapeType.SQUARE);
        Shape rectangle1 = factory1.getShape(ShapeType.RECTANGLE);


        square.draw();
        rectangle.draw();

        square1.draw();
        rectangle1.draw();

    }
}
