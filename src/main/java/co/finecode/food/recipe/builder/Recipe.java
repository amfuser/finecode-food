package co.finecode.food.recipe.builder;

import co.finecode.food.recipe.ingredient.Ingredient;

import java.util.List;

public class Recipe {

    private String name;
    private List<Ingredient> ingredients;
    private StringBuilder instructions;

    private Recipe() {
    }

    public static class RecipeBuilder {
        private String name;
        private List<Ingredient> ingredients;
        private StringBuilder instructions;

        public RecipeBuilder mainCourse(String name, List<Ingredient> ingredients,
                                        StringBuilder instructions) {
            this.name = name;
            this.ingredients = ingredients;
            this.instructions = instructions;
            return this;
        }

        public RecipeBuilder dessert(String name, List<Ingredient> ingredients,
                                     StringBuilder instructions) {
            this.name = name;
            this.ingredients = ingredients;
            this.instructions = instructions;
            return this;
        }

        public RecipeBuilder appetizer(String name, List<Ingredient> ingredients,
                                       StringBuilder instructions) {
            this.name = name;
            this.ingredients = ingredients;
            this.instructions = instructions;
            return this;
        }

        public RecipeBuilder bread(String name, List<Ingredient> ingredients,
                                   StringBuilder instructions) {
            this.name = name;
            this.ingredients = ingredients;
            this.instructions = instructions;
            return this;
        }

        public RecipeBuilder salad(String name, List<Ingredient> ingredients,
                                   StringBuilder instructions) {
            this.name = name;
            this.ingredients = ingredients;
            this.instructions = instructions;
            return this;
        }

        public RecipeBuilder dutchOven(String name, List<Ingredient> ingredients,
                                       StringBuilder instructions) {
            this.name = name;
            this.ingredients = ingredients;
            this.instructions = instructions;
            return this;
        }


        public Recipe build() {
            Recipe recipe = new Recipe();
            recipe.name = this.name;
            recipe.ingredients = ingredients;
            recipe.instructions = instructions;

            return recipe;
        }
    }
}
