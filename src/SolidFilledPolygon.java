public class SolidFilledPolygon extends Polygon{
    private String color;

    public SolidFilledPolygon(int count, String color) {
        super(count, new Style(null, null, null));
        this.color = color;
    }
}
