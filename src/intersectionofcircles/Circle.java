package intersectionofcircles;

public class Circle {
    private Point center;
    private Integer radius;

    public Circle(Point center, Integer radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public Integer getRadius() {
        return radius;
    }

    public void setRadius(Integer radius) {
        this.radius = radius;
    }

    public boolean intersect(Circle c){
        int deltaX = this.center.getX() - c.center.getX();
        int deltaY = this.center.getY() - c.center.getY();
        double distance = Math.sqrt(deltaX * deltaX + deltaY * deltaY);

       return distance <= this.radius + c.radius;
    }
}