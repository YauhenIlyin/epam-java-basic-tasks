package by.ilyineugene.xmlparser.entity;

import by.ilyineugene.xmlparser.evidence.IngredientType;

public class Ingredient {
    private IngredientType ingredientType;
    private int ingredientWeight;

    public Ingredient(IngredientType ingredientType, int ingredientWeight) {
        this.ingredientType = ingredientType;
        this.ingredientWeight = ingredientWeight;
    }

    public IngredientType getIngredientType() {
        return ingredientType;
    }

    public void setIngredientType(IngredientType ingredientType) {
        this.ingredientType = ingredientType;
    }

    public int getIngredientWeight() {
        return ingredientWeight;
    }

    public void setIngredientWeight(int ingredientWeight) {
        this.ingredientWeight = ingredientWeight;
    }
}
