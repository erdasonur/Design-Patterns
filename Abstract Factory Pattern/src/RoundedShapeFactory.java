public class RoundedShapeFactory extends AbstractFactory{
    @Override
    Shape getShape(String shapeType) {
        if (shapeType.equals("Rectangle"))
            return new RoundedRectangle();
        else if(shapeType.equals("Square"))
            return new RoundedSquare();
        else
            return null;
    }
}
