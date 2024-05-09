package lk.ijse.factory.Factor;

/**
 * @version: v0.0.1
 * @author: Navishka
 * @date: 5/9/2024
 */
public class Factory_Two extends Factory{

    private String A;
    private String B;
    private String C;

    public Factory_Two(String A , String B , String C){

        this.A =  A;
        this.B =  B;
        this.C =  C;
    }
    @Override
    public String getA() {
        return this.A;
    }

    @Override
    public String getB() {
        return this.B;
    }

    @Override
    public String getC() {
        return C;
    }
}
