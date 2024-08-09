package main.java.ru.geekbrains.architect.lesson1.modelElements;

public class Camera {
    private Point3D location;
    private Angle3D angle;

    public Camera(Point3D location, Angle3D angle) {
        this.location = location;
        this.angle = angle;
    }

    public void rotate(Angle3D angle) {

    }

    public void move(Point3D point) {

    }
}
