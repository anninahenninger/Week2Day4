package Intermediate_A2_Soup;

public class WeekendMenu extends Menu {
    private String appetizer;

    public WeekendMenu(Soup soup, String mainDish, String desert, String appetizer){
        super(soup, mainDish, desert);
        this.appetizer = appetizer;
    }
    public String getSoupOfTheDay(){
        return "The soup of the day is: " + this.getSoup();
    }
    public void printMenu(){
        System.out.println("The menu of the day: \n" + this.appetizer + "\n" + this.getSoup() + "\n" + this.getMainDish() + "\n" + this.getDesert());
    }
}
