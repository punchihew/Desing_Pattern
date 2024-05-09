/**
 * @version: v0.0.1
 * @author: Navishka
 * @date: 5/9/2024
 */
public class Context {

    private Strategy strategy;

    public Context (Strategy strategy){
       this.strategy = strategy;

    }

    public int executeStrategy(){

        return strategy.doOperation()
    }
}
