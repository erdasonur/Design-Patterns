public class DecoratorPattern {
    public static void main(String[] args){
        Shape rectangle = new Rectangle();
        Shape redRectangle = new RedShapeDecorator(new Circle());
        rectangle.draw();
        redRectangle.draw();
    }
}
