public class Chicken implements Edible {

  private int nutritionValue = 1400;

  public String cluck(){
    return "Bok bok bok";
  }

  public int getNutritionValue(){
    return this.nutritionValue;
  }
}