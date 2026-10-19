package bai1.ex1_9;

public class Ball {
    float x;
    float y;
    int radius;
    float xDelta;
    float yDelta;

    public Ball(float x,float y,int r,float xD,float yD){
        this.x = x;
        this.y = y;
        this.radius = r;
        this.xDelta = xD;
        this.yDelta = yD;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float getxDelta() {
        return xDelta;
    }

    public void setxDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public float getyDelta() {
        return yDelta;
    }

    public void setyDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    public void move(){
        this.x += xDelta;
        this.y += yDelta;
    }

    public void reflectHorizontal(){
        xDelta = -xDelta;
    }

    public void reflectVertical(){
        yDelta= - yDelta;
    }

    @Override
    public String toString() {
        return "Ball[" +
                "x=" + x +
                ", y=" + y +
                ", radius=" + radius +
                ", xDelta=" + xDelta +
                ", yDelta=" + yDelta +
                ']';
    }
}
