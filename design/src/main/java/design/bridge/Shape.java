package design.bridge;

public abstract class Shape {
    protected DrawApi display;

    protected void drawShape() {
        display.draw();
    }
}
