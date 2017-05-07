public class Salmon implements Edible, Swimmable {

  private int nutritionValue = 800;

  public String swim(){
   return "swimming";
  }

  public int getNutritionValue(){
    return this.nutritionValue;
  }

}