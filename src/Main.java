class Point{
    int x;
    int y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Point punkt = new Point(3,2);
        System.out.println(punkt.x);
        System.out.println(punkt.y);
    }

}