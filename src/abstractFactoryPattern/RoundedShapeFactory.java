package abstractFactoryPattern;

public class RoundedShapeFactory extends AbstractFactory{
    @Override
    Shape getShape(ShapeType shapeType) {
        if(shapeType==ShapeType.SQUARE)
            return  new RoundedSquare();
        else if (shapeType==ShapeType.RECTANGLE)
            return new RoundedRectangle();
        return null;
    }
}
