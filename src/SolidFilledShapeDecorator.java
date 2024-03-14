public class SolidFilledShapeDecorator extends ShapeDecorator {
    private String color;

    public SolidFilledShapeDecorator(Shape decoratedShape, String color) {
        super(decoratedShape);
        this.color = color;
    }
}
