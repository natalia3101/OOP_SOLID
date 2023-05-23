package LSP;

public class Rectangle extends Shape{
    
    private int width;
    public void setWidth(int width) {
        this.width = width;
    }

    private int height;

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public int area() {
        return this.width * this.height;
    }
    
}
