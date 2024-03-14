//https://github.com/lukaszkurantdev/programowanie_obiektowe

//       Style style = new Style("purple", "pink", 10.0);
//       Point vec21 = new Point(1, 100);
//       Point vec22 = new Point(1, 1);
//       Point vec23 = new Point(100, 100);
//       Point vec24 = new Point(100, 200);
////
//       Polygon polygon = new Polygon(4, style);
//       polygon.setPoint(0, vec21);
//       polygon.setPoint(1, vec22);
//       polygon.setPoint(2, vec23);
//        polygon.setPoint(3, vec24);


//        public class Main {
//            public static void main(String[] args) {
//                Vec2 point1 = new Vec2(0, 100);
//                Vec2 point2 = new Vec2(100, 102);
//                Vec2 point3 = new Vec2(50, 50);
//
//                Polygon polygon = new Polygon(3, new Style(null, null , null));
//                polygon.setPoint(0, point1);
//                polygon.setPoint(1, point2);
//                polygon.setPoint(2, point3);
//
//                Shape filledPolygon = new SolidFilledPolygon(polygon, "purple");
//
//                SvgScene svgScene = new SvgScene();
//                svgScene.addShape(filledPolygon);
//                svgScene.saveHtml("./test.html");
//            }
//        }


public class Main {
    public static void main(String[] args) {
        Vec2 point1 = new Vec2(0, 100);
        Vec2 point2 = new Vec2(100, 102);
        Vec2 point3 = new Vec2(50, 50);

        Polygon polygon = new Polygon(
                3,
                new Style(null, null, null)
        );
        polygon.setPoint(0, point1);
        polygon.setPoint(1, point2);
        polygon.setPoint(2, point3);

        Shape filledPolygon = new SolidFilledShapeDecorator(polygon, "blue");

        SvgScene svgScene = new SvgScene();
        svgScene.addShape(filledPolygon);
        svgScene.saveHtml("./test.html");
    }
}