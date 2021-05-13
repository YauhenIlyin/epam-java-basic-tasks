package by.ilyineugen.shape.entity;

public abstract class Shape {
    private long id;

    public abstract PlanimetricPoint[] getPointArray();

    public Shape(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }
}
