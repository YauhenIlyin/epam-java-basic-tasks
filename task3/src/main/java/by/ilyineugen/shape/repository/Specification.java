package by.ilyineugen.shape.repository;

import by.ilyineugen.shape.entity.EntityQuadrangle;
import by.ilyineugen.shape.entity.Shape;
import by.ilyineugen.shape.exception.ShapeException;

public interface Specification <T extends Shape> {

    public boolean specify(T t);

}
