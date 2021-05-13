package by.ilyineugene.xmlparser.entity;

import by.ilyineugene.xmlparser.evidence.CandyType;
import by.ilyineugene.xmlparser.evidence.Filling;

public class Type {
    private CandyType candyType;
    private Filling filling;

    public Type(CandyType candyType, Filling filling) {
        this.candyType = candyType;
        this.filling = filling;
    }

    public Type(CandyType candyType) {
        this.candyType = candyType;
    }

    public CandyType getCandyType() {
        return candyType;
    }

    public void setCandyType(CandyType candyType) {
        this.candyType = candyType;
    }

    public Filling getFilling() {
        return filling;
    }

    public void setFilling(Filling filling) {
        this.filling = filling;
    }

}
