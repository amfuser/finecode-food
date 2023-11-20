package co.finecode.food.recipe;

import co.finecode.food.recipe.builder.Recipe;
import co.finecode.food.recipe.ingredient.Ingredient;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void build(String args[]) {
        // Build appetizer
        List<Ingredient> breadStickIngredients = new ArrayList<>();
        StringBuilder breadStickInstructions = new StringBuilder();
        Recipe appetizer = new Recipe.RecipeBuilder().appetizer("breadsticks", breadStickIngredients,
                breadStickInstructions).build();

        List<Ingredient> mainCourseIngredients = new ArrayList<>();
        StringBuilder mainCourseInstructions = new StringBuilder();
        Recipe mainCourse = new Recipe.RecipeBuilder().mainCourse("lasagna", mainCourseIngredients,
                mainCourseInstructions).build();

        List<Ingredient> dessertIngredients = new ArrayList<>();
        StringBuilder dessertInstructions = new StringBuilder();
        Recipe dessert = new Recipe.RecipeBuilder().dessert("apple pie", mainCourseIngredients,
                mainCourseInstructions).build();
    }
}
