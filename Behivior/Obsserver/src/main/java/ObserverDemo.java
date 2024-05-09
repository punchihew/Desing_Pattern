/**
 * @version: v0.0.1
 * @author: Navishka
 * @date: 5/9/2024
 */
public class ObserverDemo {
    public static void main(String[] args) {
        Subject subject  = new Subject();
        new BinaryObserver(subject);
        new HexaObserver(subject);

        System.out.println("State : 10");
        subject.setState(10);
        System.out.println("State : 10");
        subject.setState(10);
    }
}
