package by.ilyineugen.shape.factory;

import by.ilyineugen.shape.entity.PlanimetricPoint;
import by.ilyineugen.shape.entity.Shape;
import by.ilyineugen.shape.exception.ShapeException;

public abstract class ShapeFactory {

    public abstract Shape createShape(double[] coordinateArr) throws ShapeException;

    public abstract Shape createShape(PlanimetricPoint[] pointArr) throws ShapeException;

    public abstract Shape createShape(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) throws ShapeException;
}
