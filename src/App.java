import javax.swing.*;
import java.util.Scanner;

public class App {
    private Turtle turtle;
    private Canvas canvas;
    private Command[] commands;
    private JFrame frame;

    public App(){
       this.canvas = new Canvas();
        this.turtle = new Turtle(new Point(100,100),0);
        this.turtle.setCanvas(canvas);
        this.commands=new Command[]{
                new SquareCommand(),
                new ZigZag()
        };
        this.frame = new JFrame("Drawing Program (Command Pattern) ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.add(canvas);
        frame.setVisible(true);

    }

    public void run(){



        Scanner scanner = new Scanner(System.in);
        System.out.println("Available Drawing Commands: ");
        for(int i = 0; i< commands.length;i++){
            System.out.println((i+1)+". "+ commands[i].getName());
        }
        System.out.println("Choose a Command(1 or 2)");
        try{
            int choice = scanner.nextInt();
            if(choice >=1 && choice<=commands.length){
                commands[choice-1].execute(turtle);
            } else {
                System.out.println("Invalid Choice");
            }
        } catch (Exception e){
            System.out.println("Please enter a number.");
        } finally {
            scanner.close();
        }
    }
}
