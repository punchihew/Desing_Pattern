/**
 * @version: v0.0.1
 * @author: Navishka
 * @date: 5/9/2024
 */
public class BinaryObserver extends Observer{

    public  BinaryObserver( Subject subject){
         this.subject = subject;
         this.subject.attach(this);
    }
    @Override
    public void update() {

        System.out.println("BINARY :" + subject.getState());
    }
}
