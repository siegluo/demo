package design.decorator.demo;

public abstract class Decorator extends Component {
    protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    protected void option() {
        component.option();
    }
}
