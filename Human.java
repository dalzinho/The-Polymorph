public class Human implements Edible, Swimmable {

    private int nutritionValue = 110000;

    public String speak(){
      return "Help, I'm being eaten by a bear!";
    }

    public String swim(){
      return "The human frolicks in the water";
    }

    public int getNutritionValue(){
      return this.nutritionValue;
    }
}