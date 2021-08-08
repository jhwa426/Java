import java.awt.Color;

public class ColoredSphereTest {

    public static void main(String[] args) {
		Sphere b = new Sphere();
		System.out.println(b);
        ColoredSphere ball = new ColoredSphere(Color.white, 5);
        System.out.println(ball);
        System.out.println("The ball color is " + ball.getColor());
	}
}

class ColoredSphere extends Sphere {
    private Color color;
    public ColoredSphere(Color c) {
        this(c,0);
    }
    public ColoredSphere(Color c, double r) {
        super(r);
        color = c;
    }
    public void setColor(Color c) {
        color = c;
    }
    public Color getColor() {
        return color;
    }
    public String toString() {
        return super.toString() + ", Colour=" + color;
    }
    public void method1() {
        System.out.println(super.radius);
    }
}

class Sphere {
    protected double radius;
    public Sphere() {
        setRadius(1.0);
    }
    public Sphere(double r) {
        setRadius(r);
    }
    public void setRadius(double newRadius) {
        if (newRadius >= 0) {
            radius = newRadius;
        }
    }
    public double getRadius() {
        return radius;
    }
    public double getDiameter() {
        return 2.0 * radius;
    }
    public double getCircumference() {
        return Math.PI * getDiameter();
    }
    public double getArea() {
        return 4.0 * Math.PI * radius * radius;
    }
    public double getVolume() {
        return (4.0 * Math.PI * radius * radius * radius)/3;
    }

    public String toString() {
        return String.format("r=%.2f", radius);
    }

/*	public boolean equals(Object obj) {
		return (obj instanceof Sphere) &&
		    (radius == ((Sphere)obj).radius);
    }
   */
}