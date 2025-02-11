class TurtleThread extends Thread {
    private Turtle turtle;
    private double x, y;


    public TurtleThread( double x, double y, String color) {
        this.x=x;
        this.y=y;
        this.turtle = new Turtle(x, y);
        this.turtle.penColor(color);
        turtle.speed(0.1);
    }

    @Override
    public void run() {
        drawBase();
        drawTurtle();
    }

    private void drawBase() {
        turtle.bgcolor("Black");
        turtle.width(3);
        turtle.hide();
    }


    private  void drawTurtle() {
        // วาดกระดองเต่า
        turtle.setPosition(x, y);
        drawCircle(50);
        // วาดหัวเต่า
        turtle.setPosition(x, y+30);
        drawCircle(15);

        // วาดขาเต่าหน้า
        drawLeg(x-50, y);
        drawLeg(x+50, y);
        //วาดขาเต่าหลัง
        drawLeg(x-50, -75);
        drawLeg(x+50, -75);

        // วาดหางเต่า

        turtle.setPosition(x, y-100);
        drawCircle(8);
    }

    private void drawLeg(double x, double y) {

        turtle.setPosition(x, y);
        turtle.down();
        drawCircle(12);


    }
    private void drawCircle(double radius) {
        turtle.down();
        for (int i = 0; i < 360; i++) {
            turtle.forward((2 * Math.PI * radius) / 360);
            turtle.right(1);
        }
        turtle.up();
    }
}
