package main.java.ru.geekbrains.architect.lesson1.modelElements;

public class Flash {
    private Point3D location;
    private Angle3D angle;
    private Color color;
    private float power;


    public Flash(Point3D location, Angle3D angle, Color color, float power) {
        this.location = location;
        this.angle = angle;
        this.color = color;
        this.power = power;
    }

    public Flash() {
        location = new Point3D(0, 0, 0);
        angle = new Angle3D(1, 2, 3);
        color = new Color(255, 255, 255);
        power = 100f;
    }

    private void rotate(Angle3D angle) {

    }

    private void move(Point3D point3D) {

    }


}
