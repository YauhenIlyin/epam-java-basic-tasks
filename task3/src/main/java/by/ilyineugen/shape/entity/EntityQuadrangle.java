package by.ilyineugen.shape.entity;

import by.ilyineugen.shape.exception.ShapeException;
import by.ilyineugen.shape.observer.Observable;
import by.ilyineugen.shape.observer.impl.QuadrangleEvent;
import by.ilyineugen.shape.observer.impl.QuadrangleObserver;
import by.ilyineugen.shape.util.IdGenerator;

import java.util.Arrays;
import java.util.Objects;

public class EntityQuadrangle extends Shape implements Observable {

    private long entityQuadrangleId;
    private PlanimetricPoint[] pointArray;
    private QuadrangleObserver quadrangleObserver;

    public EntityQuadrangle(PlanimetricPoint pointA, PlanimetricPoint pointB, PlanimetricPoint pointC, PlanimetricPoint pointD) {
        super(IdGenerator.generateAndGetId());
        this.pointArray = new PlanimetricPoint[]{pointA, pointB, pointC, pointD};
    }

    public EntityQuadrangle(PlanimetricPoint[] pointArray) {
        super(IdGenerator.generateAndGetId());
        this.pointArray = pointArray;
    }

    public PlanimetricPoint[] getPointArray() {
        return this.pointArray;
    }

    public void setPointArray(PlanimetricPoint[] array) {
        this.pointArray = array;
    }

    public PlanimetricPoint getPointByIndex(int index) {
        return pointArray[index];
    }

    public void setPointByIndex(PlanimetricPoint point, int index) {
        this.pointArray[index] = point;
    }

    @Override
    public String toString() {
        return "EntityQuadrangle{" +
                "coordinatesArray=" + Arrays.toString(pointArray) +
                ", id=" + entityQuadrangleId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EntityQuadrangle that = (EntityQuadrangle) o;
        return entityQuadrangleId == that.entityQuadrangleId && Arrays.equals(pointArray, that.pointArray);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(entityQuadrangleId);
        result = 31 * result + Arrays.hashCode(pointArray);
        return result;
    }

    @Override
    public void attach(QuadrangleObserver observer) {
        if (observer != null) {
            this.quadrangleObserver = observer;
        }
    }

    @Override
    public void detach(QuadrangleObserver observer) {
        this.quadrangleObserver = null;
    }

    @Override
    public void notifyObservers() throws ShapeException {
        QuadrangleEvent event = new QuadrangleEvent(this);
        if (quadrangleObserver != null) {
            quadrangleObserver.parameterChanged(event);
        }
    }
}
