public class TransformationDecorator {
    private boolean translate = false;
    private Vec2 translateVector;

    public class Builder {
        private boolean translate = false;
        private Vec2 translateVector;
        Shape shape;

        public void setTranslateVector(Vec2 translateVector) {
            this.translateVector = translateVector;
            this.translate = true;
        }
    }
}
