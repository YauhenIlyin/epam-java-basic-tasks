package by.ilyineugen.shape.entity;

import java.util.Objects;

public class PlanimetricPoint {
    private long id;
    private double coordinateX;
    private double coordinateY;

    public PlanimetricPoint(double coordinateX, double coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public double getX() {
        return coordinateX;
    }

    public double getY() {
        return coordinateY;
    }

    public void setX(double coordinateX) {
        this.coordinateX = coordinateX;
    }

    public void setY(double coordinateY) {
        this.coordinateY = coordinateY;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlanimetricPoint that = (PlanimetricPoint) o;
        return Double.compare(that.coordinateX, coordinateX) == 0 && Double.compare(that.coordinateY, coordinateY) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(coordinateX, coordinateY);
    }
}
