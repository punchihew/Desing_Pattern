/**
 * @version: v0.0.1
 * @author: Navishka
 * @date: 5/9/2024
 */
public class HexaObserver extends Observer{

    public HexaObserver( Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hexa :" + subject.getState());
    }
}
