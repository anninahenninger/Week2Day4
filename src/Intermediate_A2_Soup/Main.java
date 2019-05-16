package Intermediate_A2_Soup;

/**
 * Soup of the Day in a Restaurant
 *
 * Many restaurants offer a soup-of-the-day. Good object-oriented customers will just order the soup-of-the-day and
 * have faith that what is delivered will satisfy their hunger. Having a soup-of-the-day simplifies ordering for
 * customers. They don't have to be experts on specific types of soups. The same request is made every time, but
 * depending on which day the request is made, a different type of soap is returned.
 *
 *     Create parent class Menu, that has two childs: WeekdayMenu and WeekendMenu. WeekdayMenu consist of MainDish,
 *     Desert and Soup . WeekendMenu consist of Appetizer, MainDish, Soup and Desert.
 *
 *     Create several WeekdayMenu and Weekend menu  objects, save them in variables of Menu class type. Classes
 *     WeekdayMenu  and Weekend implement getSoupOfTheDay() method that returns a soup.
 *
 *     Add method printMenu(). Call it on Menu objects
 *
 *
 * Exception handling:
 *
 * A soup can be constructed with a name. But it has also a portionVolume (in liters)
 *
 * Raise an NoSoupVolumeDefined exception if you try to access  getPortionVolume() if it is not defined.
 *
 * ADVANCED: Research internet on “primitive wrapper classes java”
 */
public class Main {
    public static void main(String[] args) {
        WeekdayMenu wd1 = new WeekdayMenu(new Soup("Griesnockerl", "0.3"), "Tafelspitz", "Kaiserschmarren");
        WeekdayMenu wd2 = new WeekdayMenu(new Soup("Kürbiscremesuppe", null), "Gefüllte Paprika", "Tiramisu");
        WeekdayMenu wd3 = new WeekdayMenu(new Soup("Spargelcremesuppe", null), "Schnitzel", "Palatschinken");
        WeekdayMenu wd4 = new WeekdayMenu(new Soup ("Frittatensuppe", "0.7"), "Schweinsbraten", "Creme brulee");
        WeekdayMenu wd5 = new WeekdayMenu(new Soup("Minestrone", "0.2"), "Voltini", "Panetone");
        WeekendMenu we6 = new WeekendMenu(new Soup("Leberknödelsuppe", null), "Käsefondue", "Apeflstrudel", "Tacos");
        WeekendMenu we7 = new WeekendMenu(new Soup("Schlickkrapferlsuppe", "0.1"), "Hirn mit Ei", "Waffeln", "Käsecracker");

        Menu m1 = wd1;
        Menu m2 = wd2;
        Menu m3 = wd3;
        Menu m4 = wd4;
        Menu m5 = wd5;
        Menu m6 = we6;
        Menu m7 = we7;

        System.out.println(((WeekdayMenu) m1).getSoupOfTheDay());

        ((WeekendMenu) m6).printMenu();

        try {
            System.out.println(m6.getPortionVolume());
        }
        catch (NoSoupVolumeDefined nsvd){
            System.out.println("There is no portion volume defined for the soup");
        }




    }
}
