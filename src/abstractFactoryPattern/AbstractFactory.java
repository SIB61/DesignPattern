package abstractFactoryPattern;

public abstract class AbstractFactory {
    abstract Shape getShape(ShapeType shapeType);
}
