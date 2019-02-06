public class Rectangle {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    public double getArea() {
        return
                this.getLength() * this.getWidth();

    }
    public double getDiagonal() {
        Math.sqrt(9);
        return  Math.sqrt(getWidth() * getWidth() + (getLength() * getLength()));


    }
    public String isSquare() {
        if(length == width) {
            return "Yes, this is a square.";
        }else {
            return "No, not a square";
        }
    }
}
