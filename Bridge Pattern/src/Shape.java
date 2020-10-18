public abstract class Shape {
    protected drawAPI drawAPI;

    protected Shape(drawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}
