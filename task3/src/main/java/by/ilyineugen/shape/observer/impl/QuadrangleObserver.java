package by.ilyineugen.shape.observer.impl;

import by.ilyineugen.shape.entity.EntityQuadrangle;
import by.ilyineugen.shape.exception.ShapeException;
import by.ilyineugen.shape.observer.Observer;
import by.ilyineugen.shape.repository.ShapeWarehouse;
import by.ilyineugen.shape.service.PlanimetricQuadrangleOperation;

public class QuadrangleObserver implements Observer {

    public void parameterChanged(QuadrangleEvent event) throws ShapeException {
        EntityQuadrangle entityQuadrangle = event.getSource();
        double perimeter = PlanimetricQuadrangleOperation.getPerimeter(entityQuadrangle);
        double area = PlanimetricQuadrangleOperation.getArea(entityQuadrangle);
        ShapeWarehouse shapeWarehouse = ShapeWarehouse.getInstance();
        shapeWarehouse.setShapeParameterById(entityQuadrangle.getId(), perimeter, area);
    }
}
