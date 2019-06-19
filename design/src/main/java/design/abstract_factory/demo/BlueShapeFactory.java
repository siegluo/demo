package design.abstract_factory.demo;

public class BlueShapeFactory  extends AbstraShapeFactory {
    @Override
    protected Circle createCircle() {
        return null;
    }

    @Override
    protected Square createSquare() {
        return null;
    }
}
