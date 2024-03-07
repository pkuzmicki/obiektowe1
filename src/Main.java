//https://github.com/lukaszkurantdev/programowanie_obiektowe
public class Main {
    public static void main(String[] args) {
       Style style = new Style("purple", "pink", 10.0);
       Point point1 = new Point(1, 100);
       Point point2 = new Point(1, 1);
       Point point3 = new Point(100, 100);
       Point point4 = new Point(100, 200);

       Polygon polygon = new Polygon(4, style);
       polygon.setPoint(0, point1);
       polygon.setPoint(1, point2);
       polygon.setPoint(2, point3);
        polygon.setPoint(3, point4);

        SvgScene svgScene = new SvgScene();
        svgScene.addPolygon(polygon);
        svgScene.saveHtml("./test.html");



    }

}

