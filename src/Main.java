//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TurtleThread turtle1 = new TurtleThread(0, 0.5, "brown");
        TurtleThread turtle2 = new TurtleThread(150, 0.5, "pink");
        TurtleThread turtle3 = new TurtleThread(-150, 0.5, "yellow");

        turtle1.start();
        turtle2.start();
        turtle3.start();
    }
}