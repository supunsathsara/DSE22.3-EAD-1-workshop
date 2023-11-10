package Shape;

public class Circle {
    float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    public void displayArea(){
        float area = (float) (Math.PI * radius * radius);
        System.out.println(area);

    }

}
