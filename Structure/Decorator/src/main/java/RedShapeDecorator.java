/**
 * @version: v0.0.1
 * @author: Navishka
 * @date: 5/9/2024
 */
public class RedShapeDecorator extends ShapeDecoroter{

    public RedShapeDecorator(Shape decoratorShape) {
        super(decoratorShape);
    }

    @Override
    public void draw(){
        decoratorShape.draw();
    }

    private void setRedBorder(Shape decoratoeshape){
        System.out.println("Border Colour Change");
    }
}
