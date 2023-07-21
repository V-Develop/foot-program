import java.util.Scanner;

public class Foot {

    private String footShape;
    private Rectangle rectangle;
    private Ellipse ellipse;

    public void getFootShapeTypeFromUser(String footShapeType) {
        switch (footShapeType) {
            case "Ellipse":
                footShape = "Ellipse";
                break;
            case "Rectangle":
                footShape = "Rectangle";
                break;
        }
    }

    public String draw() {
        if (footShape.equals("Ellipse")) {
            ellipse = new Ellipse();
            return ellipse.drawAsEllipse();
        } else {
            rectangle = new Rectangle();
            return rectangle.drawAsRectangle();
        }
    }

    public static void main(String[] args) {
        Foot app = new Foot();
        Scanner inp = new Scanner(System.in);
        System.out.println("What to draw? 1. Ellipse, 2. Rectangle 2");
        int type = inp.nextInt();
        switch (type) {
            case 1:
                app.getFootShapeTypeFromUser("Ellipse");
                break;
            case 2:
                app.getFootShapeTypeFromUser("Rectangle");
                break;

        }
        System.out.println(app.draw());
    }
}
