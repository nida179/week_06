public class SquareCommand implements Command{
    @Override
    public void execute(Turtle turtle){
        System.out.println("Drawing a square");
        turtle.moveTo(new Point(100,100));
        int sideLength = 100;
        for(int i=0;i<4;i++){
            turtle.forward(sideLength);
            turtle.turnLeft();
        }
        turtle.cre.repaint();
    }
    @Override
    public String getName(){
        return "Square";
    }
}
