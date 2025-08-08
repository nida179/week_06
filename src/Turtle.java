public class Turtle extends Pen{
    private double angle;
    Turtle(Point startPos , double startAngle ){
        super(null);
        this.pos = startPos;
        this.angle=startAngle;
    }
    public void setCanvas(Canvas canvas){
        this.cre = canvas;
    }

    public void forward(int distance){
        double radAngle = Math.toRadians(this.angle);
        int newX = (int) (this.pos.getX()+distance * Math.cos(radAngle));
        int newY = (int) (this.pos.getY()+distance * Math.sin(radAngle));

        Point newPos = new Point(newX , newY);
        this.lineTo(newPos);
    }
    public void turnRight (){
        this.angle +=90;
    }
    public void turnLeft(){
        this.angle -=90;
    }
}
