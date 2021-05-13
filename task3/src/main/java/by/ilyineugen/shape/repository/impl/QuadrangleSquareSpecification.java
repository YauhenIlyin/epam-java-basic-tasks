package by.ilyineugen.shape.repository.impl;

import by.ilyineugen.shape.entity.EntityQuadrangle;
import by.ilyineugen.shape.entity.Shape;
import by.ilyineugen.shape.exception.ShapeException;
import by.ilyineugen.shape.repository.Specification;
import by.ilyineugen.shape.service.PlanimetricLineOperation;
import by.ilyineugen.shape.service.PlanimetricQuadrangleOperation;
import by.ilyineugen.shape.validator.RegularQuadrangleValidator;

public class QuadrangleSquareSpecification<T extends Shape> implements Specification {

    @Override
    public boolean specify(Shape entityQuadrangle) {
        if (entityQuadrangle.getClass() != EntityQuadrangle.class || RegularQuadrangleValidator.isValid((EntityQuadrangle) entityQuadrangle)) {
            return false;
        }
        EntityQuadrangle container = (EntityQuadrangle) entityQuadrangle;
        double firstSide = 0.;
        double secondSide = 1.;
        try {
            firstSide = PlanimetricLineOperation.lengthOfSection(container.getPointByIndex(0), container.getPointByIndex(1));
            secondSide = PlanimetricLineOperation.lengthOfSection(container.getPointByIndex(1), container.getPointByIndex(2));
        } catch (ShapeException e) {
            ///////////////////////////////////
        }
        return firstSide == secondSide;
    }
}

