import javax.swing.text.Position;

public class Pen {
    protected Point pos;
    protected Canvas cre;

    Pen(Canvas canvas){
        this.cre = canvas;
        this.pos = new Point(150,150);
    }
    public void moveTo(Point to){
        cre.addLine(this.pos,to);
        this.pos = new Point(to);
    }
    public void lineTo(Point to){
        cre.addLine(this.pos,to);
        this.pos = new Point(to);
    }
    public Point getPosition(){
        return new Point(pos);
    }
    public void display(){
        cre.repaint();
    }
}
