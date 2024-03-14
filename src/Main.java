//https://github.com/lukaszkurantdev/programowanie_obiektowe
public class Main {
    public static void main(String[] args) {
       Style style = new Style("purple", "pink", 10.0);
       Vec2 vec21 = new Vec2(1, 100);
       Vec2 vec22 = new Vec2(1, 1);
       Vec2 vec23 = new Vec2(100, 100);
       Vec2 vec24 = new Vec2(100, 200);

       Polygon polygon = new Polygon(4, style);
       polygon.setPoint(0, vec21);
       polygon.setPoint(1, vec22);
       polygon.setPoint(2, vec23);
        polygon.setPoint(3, vec24);

        SvgScene svgScene = new SvgScene();
        svgScene.addPolygon(polygon);
        svgScene.saveHtml("./test.html");



    }

}

