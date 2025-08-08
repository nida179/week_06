public class ZigZag implements Command{
    @Override
    public void execute(Turtle turtle){
        System.out.println("Drawing a ZigZag");
        turtle.moveTo(new Point(100,100));
        int forwardLength = 20;
        turtle.forward(forwardLength);
        turtle.turnLeft();
        turtle.forward(forwardLength);
        turtle.turnRight();
        turtle.forward(forwardLength);
        turtle.turnLeft();
        turtle.forward(forwardLength);

        turtle.cre.repaint();
    }
    @Override
    public String getName(){
        return "ZigZag";
    }
}
