public class Rectangle {

    float length;
    float width;

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float getlength(){
        return length;
    }

    public void setlength(float length) {
        this.length = length;
    }

    public float getwidth(){
        return width;
    }

    public void setwidth (float width) {
        this.width = width;
    }

    public float getPerimeter(){
        return (width * 2) + (length * 2);
    };

    public float getArea(){
        return length * width;
    }

    public double getDiagonal(){
        return Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));

    }

}
