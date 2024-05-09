/**
 * @version: v0.0.1
 * @author: Navishka
 * @date: 5/9/2024
 */
public class OperationSubcriber implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1-num2;
    }
}
