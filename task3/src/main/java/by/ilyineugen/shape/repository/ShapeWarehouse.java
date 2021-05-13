package by.ilyineugen.shape.repository;

import by.ilyineugen.shape.entity.EntityQuadrangle;
import by.ilyineugen.shape.exception.ShapeException;
import by.ilyineugen.shape.service.PlanimetricQuadrangleOperation;
import by.ilyineugen.shape.validator.RegularQuadrangleValidator;

import java.util.HashMap;
import java.util.Map;

public class ShapeWarehouse {

    private static ShapeWarehouse instance;
    private Map<Long, ShapeWarehouseParameter> shapeParameterMap;

    private ShapeWarehouse() {
        shapeParameterMap = new HashMap<Long, ShapeWarehouseParameter>();
    }

    public static ShapeWarehouse getInstance() {
        if (instance == null) {
            instance = new ShapeWarehouse();
        }
        return instance;
    }

    public void addShapeParameters(EntityQuadrangle entityQuadrangle) throws ShapeException {
        if (!RegularQuadrangleValidator.isValid(entityQuadrangle)) {
            throw new ShapeException("321312");
        }
        double area = PlanimetricQuadrangleOperation.getArea(entityQuadrangle);
        double perimeter = PlanimetricQuadrangleOperation.getPerimeter(entityQuadrangle);
        ShapeWarehouseParameter parameter = new ShapeWarehouseParameter(perimeter, area);
        shapeParameterMap.put(entityQuadrangle.getId(), parameter);
    }

    public boolean addShapeParameter(long shapeId, double perimeter, double area) throws ShapeException {
        if (shapeParameterMap.containsKey(shapeId)) {
            return false;
        }
        ShapeWarehouseParameter parameter = new ShapeWarehouseParameter(perimeter, area);
        shapeParameterMap.put(shapeId, parameter);
        return true;
    }

    public ShapeWarehouseParameter getShapeParametersById(long shapeId) throws ShapeException {
        if (!shapeParameterMap.containsKey(shapeId)) {
            throw new ShapeException("dsad");
        }
        return shapeParameterMap.get(shapeId);
    }

    public double getPerimeterById(long shapeId) throws ShapeException {
        if (!shapeParameterMap.containsKey(shapeId)) {
            throw new ShapeException("fds");
        }
        return shapeParameterMap.get(shapeId).getPerimeter();
    }

    public double getAreaById(long shapeId) throws ShapeException {
        if (!shapeParameterMap.containsKey(shapeId)) {
            throw new ShapeException("fds");
        }
        return shapeParameterMap.get(shapeId).getArea();
    }

    public boolean setShapeParameterById(long shapeId, ShapeWarehouseParameter parameter) throws ShapeException {
        if (parameter == null) {
            throw new ShapeException("fsd");
        }
        if (shapeParameterMap.containsKey(shapeId)) {
            ShapeWarehouseParameter container = shapeParameterMap.get(shapeId);
            container.setPerimeter(parameter.getPerimeter());
            container.setArea(parameter.getArea());
            return true;
        } else {
            return false;
        }
    }

    public boolean setShapeParameterById(long shapeId, double perimeter, double area) {
        if (shapeParameterMap.containsKey(shapeId)) {
            ShapeWarehouseParameter container = shapeParameterMap.get(shapeId);
            container.setPerimeter(perimeter);
            container.setArea(area);
            return true;
        } else {
            return false;
        }
    }

    public boolean isContainsParameterOfShapeById(long shapeId) {
        return shapeParameterMap.containsKey(shapeId);
    }

}
