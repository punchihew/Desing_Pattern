/**
 * @version: v0.0.1
 * @author: Navishka
 * @date: 5/9/2024
 */
public class StrategyDemo {

    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println(context.executeStrategy(10,30));

        context = new Context(new OperationSubcriber());
        System.out.println(context.executeStrategy(10,30));
    }
}
