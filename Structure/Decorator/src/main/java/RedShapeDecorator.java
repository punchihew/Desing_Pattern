/**
 * @version: v0.0.1
 * @author: Navishka
 * @date: 5/9/2024
 */
public class RedShapeDecorator extends ShapeDecoroter{

    public RedShapeDecorator(Shape decoratorShape) {
        super(decoratorShape);
    }


    public void draw(){
        decoratorShape.draw();
    }
}
