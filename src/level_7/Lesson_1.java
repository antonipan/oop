package level_7;

public class Lesson_1 {
    static double distance(Point2d a, Point2d b) {
        return Math.sqrt(Math.pow(b.getX() - a.getX(), 2) + Math.pow(b.getY()- a.getY(), 2));
    }

    public static void main(String[] args) {

//        int ax = 0;
//        int ay = 0;
//        int bx = 0;
//        int by = 4;
//        System.out.println(distance(ax, ay, bx, by));
//        // Создать точку
//        // Печать точки


        Point2d a = new Point2d(1);
        a.setX(12);
        a.setY(100);
        Point2d b = new Point2d(4);
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(distance(a, b));
    }

}
