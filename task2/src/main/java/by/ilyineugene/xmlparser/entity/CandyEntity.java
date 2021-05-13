package by.ilyineugene.xmlparser.entity;

import java.util.List;

public class CandyEntity {
    private String id;
    private String name;
    private int energy;
    private Type type;
    private List<Ingredient> ingredients;
    private Value value;
    private String production;


    public CandyEntity(String id, String name, int energy, Type type, List<Ingredient> ingredients, Value value, String production) {
        this.id = id;
        this.name = name;
        this.energy = energy;
        this.type = type;
        this.ingredients = ingredients;
        this.value = value;
        this.production = production;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }
}
