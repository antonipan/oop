package level_7;

public class Point2d {
    private int x, y;

    public int getX () {
        return x;
    }
    public int getY () {
        return y;
    }

    public void setX (int value) {
        this.x = value;
    }

    public void setY (int value) {
        this.y = value;
    }


    public Point2d(int valueX, int valueY) {
        x = valueX;
        y = valueY;
    }
    public Point2d (int value) {
        this (value, value);
    }
    public Point2d () {
        this(0);
    }

//    public Point2d () {
//        x = 0;
//        y = 0;
//    }
//    public Point2d(int value) {
//        x = value;
//        y = value;
//    }

//    private String getInfo () {
//        return String.format("x: %d and y: %d", x, y);
//    }

    @Override
    public String toString() {
        return String.format("x: %d and y: %d", x, y);
    }
}
