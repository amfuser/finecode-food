package co.finecode.food.recipe.ingredient;

import co.finecode.food.recipe.constant.IngredientType;
import co.finecode.food.recipe.constant.Measurement;

public class Ingredient {
    public Measurement getMeasurement() {
        return measurement;
    }

    public void setMeasurement(Measurement measurement) {
        this.measurement = measurement;
    }

    public IngredientType getType() {
        return type;
    }

    public void setType(IngredientType type) {
        this.type = type;
    }

    private Measurement measurement;
    private IngredientType type;

}
