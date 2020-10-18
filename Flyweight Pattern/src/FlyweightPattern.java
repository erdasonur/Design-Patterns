public class FlyweightPattern {
    private static final String colors[] = { "Red", "Green", "Black" , "White", "Blue", "Pink", "Yellow"};
    public static void main(String[] args){
        for(int i = 0; i < 10; ++i){
            Circle circle = (Circle)ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandom());
            circle.setY(getRandom());
            circle.setRadius(100);
            circle.draw();
        }
    }
    private static String getRandomColor(){
        return colors[(int)(Math.random()*colors.length)];
    }
    private static int getRandom(){
        return (int)(Math.random()*100);
    }
}
