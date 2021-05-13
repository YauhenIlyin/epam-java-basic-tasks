package by.ilyineugene.xmlparser.evidence;

public enum CandyXmlTag {
    //ID("id"), // attribute?

    NAME("name"),
    ENERGY("energy"),
    TYPE("type"),
    INGREDIENTS("ingredients"),
    INGREDIENT("ingredient"),
    INGREDIENT_TYPE("ingredient-type"),
    VALUE("value"),
    PROTEINS("proteins"),
    FATS("fats"),
    CARBOHYDRATES("carbohydrates"),
    PRODUCTION("production");

    private String tagValue;

    CandyXmlTag(String tagValue) {
        this.tagValue = tagValue;
    }

    public String getTagValue() {
        return tagValue;
    }

}
