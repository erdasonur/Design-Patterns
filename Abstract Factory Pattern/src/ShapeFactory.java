public class ShapeFactory extends AbstractFactory{
    @Override
    Shape getShape(String shapeType) {
        if(shapeType.equals("Rectangle")){
            return new Rectangle();
        }
        else if(shapeType.equals("Square")){
            return new Square();
        }
        else
            return null;
    }
}
