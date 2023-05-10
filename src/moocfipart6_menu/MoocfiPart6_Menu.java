
package moocfipart6_menu;


public class MoocfiPart6_Menu {

    public static void main(String[] args) {
    
    Menu menu = new Menu();
    menu.addMeal("Porkolt nokedlivel");
    menu.addMeal("Hortobagyi husospalacsinta");
    menu.addMeal("Toltott paprika");
    menu.addMeal("Rakott krumpli");
    
    menu.printMeals();
    
    menu.addMeal("Rakott krumpli 2");
    
    menu.clearMenu();
    
    }
}
