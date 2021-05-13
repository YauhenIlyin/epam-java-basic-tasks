package by.ilyineugen.shape.repository;

import by.ilyineugen.shape.entity.EntityQuadrangle;
import by.ilyineugen.shape.entity.Shape;
import by.ilyineugen.shape.exception.ShapeException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ShapeRepository {

    private static ShapeRepository instance;
    private List<Shape> listOfShapes;

    private ShapeRepository() {
        listOfShapes = new ArrayList<Shape>();
    }

    public static ShapeRepository getInstance() {
        if (instance == null) {
            instance = new ShapeRepository();
        }
        return instance;
    }

    public boolean addAll(Collection<? extends Shape> collection) {
        return listOfShapes.addAll(collection);
    }

    public boolean removeAll(Collection<?> collection) {
        return listOfShapes.removeAll(collection);
    }

    public Shape getByIndex(int index) {
        return listOfShapes.get(index);
    }

    public Shape setByIndex(int index, Shape shape) {
        return listOfShapes.set(index, shape);
    }

    public List<Shape> queryWithFilterBySpecification(Specification specification) {
        List<Shape> list = listOfShapes.stream().filter(shapeContainer -> specification.specify(shapeContainer)).collect(Collectors.toList());
        return list;
    }

    /*
    public List<Shape> query(Predicate<Shape> specification) {
        List<Shape> list = listOfShapes.stream().filter(shapeContainer -> specification.test(shapeContainer)).collect(Collectors.toList());
    }
    */
}
