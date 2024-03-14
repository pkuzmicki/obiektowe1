import java.util.Locale;

public class TransformationDecorator extends ShapeDecorator{
    private boolean translate = false;
    private Vec2 translateVector;

    public TransformationDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public String toSvg(String parameters) {
        String transform = "";

        if(translate == true) {
            transform += String.format(Locale.ENGLISH,
                    "translate(%f %f) ", translateVector.x, translateVector.y);
        }

        return super.toSvg(String.format(Locale.ENGLISH,
                "transform=\"%s\" %s", transform, parameters));
    }

    public static class Builder {
        private boolean translate = false;
        private Vec2 translateVector;
        Shape shape;

        public Builder setTranslateVector(Vec2 translateVector) {
            this.translateVector = translateVector;
            this.translate = true;
            return this;
        }

        public Builder setShape(Shape shape) {
            this.shape = shape;
            return this;
        }

        public TransformationDecorator build() {
            TransformationDecorator transformationDecorator = new TransformationDecorator(shape);
            transformationDecorator.translate = translate;
            transformationDecorator.translateVector = translateVector;
            return transformationDecorator;
        }

    }
}
