
public class Point {
    private int x;
    private int y;

    Point(int x , int y){
        this.x = x;
        this.y = y;
    }
    Point(Point other){
        this.x = other.x;
        this.y = other.y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    Point add(Point z){
        int newX = this.x + z.x;
        int newY = this.x + z.y;
        return new Point(newX , newY);
    }
    public double distanceTo(Point other){
        int dx = this.x - other.x;
        int dy = this.x - other.x;
        return Math.sqrt(dx*dx+dy*dy);
    }
    public String toString(){
        return "the value of x is: "+x+ "\n the vaue of y is: "+y;
    }


}
