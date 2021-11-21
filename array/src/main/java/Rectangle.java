import org.w3c.dom.css.Rect;

public class Rectangle {

    int width;
    int height;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getArea()
    {
        return height*width;
    }

    public static void main(String[] a)
    {
        LSPDemo lspDemo = new LSPDemo();
        Rectangle rectangle= new Rectangle();


        Square sq= new Square();


        lspDemo.calculateArea(sq);
    }
}
class Square extends Rectangle{

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        super.setWidth(height);
    }
}

class LSPDemo
{
    public void calculateArea(Rectangle r)
    {
        r.setWidth(3);
        r.setHeight(2);
        System.out.println(r.getArea());
    }
}