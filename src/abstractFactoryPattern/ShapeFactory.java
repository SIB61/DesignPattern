package abstractFactoryPattern;

public class ShapeFactory extends AbstractFactory{
    @Override
    Shape getShape(ShapeType shapeType) {
        if(shapeType==ShapeType.SQUARE)
            return  new Square();
        else if (shapeType==ShapeType.RECTANGLE)
            return new Rectangle();
        return null;
    }
}
