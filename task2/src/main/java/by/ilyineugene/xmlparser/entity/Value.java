package by.ilyineugene.xmlparser.entity;

public class Value {
    private int proteinsWeight;
    private int fatsWeight;
    private int carbohydratesWeight;

    public Value(int proteinsWeight, int fatsWeight, int carbohydratesWeight) {
        this.proteinsWeight = proteinsWeight;
        this.fatsWeight = fatsWeight;
        this.carbohydratesWeight = carbohydratesWeight;
    }

    public int getProteinsWeight() {
        return proteinsWeight;
    }

    public void setProteinsWeight(int proteinsWeight) {
        this.proteinsWeight = proteinsWeight;
    }

    public int getFatsWeight() {
        return fatsWeight;
    }

    public void setFatsWeight(int fatsWeight) {
        this.fatsWeight = fatsWeight;
    }

    public int getCarbohydratesWeight() {
        return carbohydratesWeight;
    }

    public void setCarbohydratesWeight(int carbohydratesWeight) {
        this.carbohydratesWeight = carbohydratesWeight;
    }
}
