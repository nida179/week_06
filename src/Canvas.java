import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Canvas extends JPanel {

    static class Line{
        Point start , end;
        Line(Point s , Point e){
            this.start = s;
            this.end = e;
        }
    }
    private List<Line> cvs_lines = new ArrayList<>();

    public void addLine(Point p1 , Point p2){
        cvs_lines.add(new Line(p1,p2));
        System.out.println("Line from ("+p1.getX() + " , "+ p1.getY()+") to ("+p2.getX()+", "+p2.getY()+")");
        repaint();
    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        for(Line line : cvs_lines){
            g.drawLine(line.start.getX(), line.start.getY(), line.end.getX(),line.end.getY());
        }
    }
}
