/**
 * @version: v0.0.1
 * @author: Navishka
 * @date: 5/9/2024
 */
public abstract class ShapeDecoroter  implements Shape{

  protected Shape decoratorShape;

  public ShapeDecoroter(Shape decoratorShape){
      this.decoratorShape = decoratorShape;
  }

  @Override
  public void draw(){
      decoratorShape.draw();
  }
}
