public class RedShapeDecorator extends ShapeDecorator{

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }
    @Override
    public void draw(){
        decoratedShape.draw();
        color(decoratedShape);
    }
    private void color(Shape shape){
        System.out.println("Color : Red");
    }
}