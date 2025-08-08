public class Line{
    private Point startPoint;
    private Point endPoint;

    Line(Point p1 , Point p2){
        this.startPoint = p1;
        this.endPoint = p2;
    }
    public Point getStartPoint(){
        return startPoint;
    }
    public Point getEndPoint(){
        return endPoint;
    }


}
