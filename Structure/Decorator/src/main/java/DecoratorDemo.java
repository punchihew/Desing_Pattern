/**
 * @version: v0.0.1
 * @author: Navishka
 * @date: 5/9/2024
 */
public class DecoratorDemo {
    public static void main(String[] args) {

        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("Circle : Normal Border");
        circle.draw();
        System.out.println("\n Circle : Add Red Border");
        redCircle.draw();
    }
}
