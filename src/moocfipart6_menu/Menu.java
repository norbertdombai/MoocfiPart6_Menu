package moocfipart6_menu;

import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;
    
    public Menu(){
    this.meals = new ArrayList<>();
    
    }
    /*ADDING A MEAL*/
    public void addMeal(String meal){
    this.meals.add(meal);
    }
    
    /*PRINTING THE MEALS*/
    public void printMeals(){
    for(String meal: this.meals)
        {
            System.out.println(meal);
        }
    }
    
    /*CLEARING THE FOOD LIST*/
    public void clearMenu(){
    this.meals.remove(meals);
    }
    
    
}
