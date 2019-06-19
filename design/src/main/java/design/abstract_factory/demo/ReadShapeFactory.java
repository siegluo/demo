package design.abstract_factory.demo;

public class ReadShapeFactory extends AbstraShapeFactory {
    @Override
    protected Circle createCircle() {
        return null;
    }

    @Override
    protected Square createSquare() {
        return null;
    }
}
