package Intermediate_A2_Soup;

public class WeekdayMenu extends Menu {

    public WeekdayMenu(Soup soup, String mainDish, String desert){
        super(soup, mainDish, desert);
    }
    public String getSoupOfTheDay(){
        return "The soup of the day is: " + this.getSoup();
    }
    public void printMenu(){
        System.out.println("The menu of the day: \n" + this.getSoup() + "\n" + this.getMainDish() + "\n" + this.getDesert());
    }
}
