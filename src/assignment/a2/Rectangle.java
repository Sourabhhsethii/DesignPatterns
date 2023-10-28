package assignment.a2;

public class Rectangle {
    // write the code of rectangle class here
    private Point topLeft;
    private int height;
    private int width;

    public Rectangle(Point topLeft, int height) {
        this.topLeft = topLeft;
        this.height = height;
    }

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public Rectangle() {
    }

    public int getArea(){
        return height * width;
    }
    public int getPerimeter(){
        return 2 *(height + width);
    }

    public Point getBottomRight(){
        Point p = new Point(2,2);
        return p;
    }
}

