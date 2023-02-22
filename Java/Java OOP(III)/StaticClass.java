public class StaticClass {
    public static void main(String[] args) {
        Country myCountry = new Country();
        Country.State myState  = myCountry.new State();

        myState.getDetails();

        Country.Colony colony112 = new Country.Colony();
        colony112.displayInfo();

    }
}

/*object of a static  cannot access non-static methods from static classes. */
class Country{
    String name;
    static class Colony{
        int ColonyArea=155;

        void displayInfo(){
            System.out.println("Colony area is :"+ColonyArea);
        }
    }

    class State{
        void getDetails(){
            System.out.println("Sorry Currently Unavailable");
        }
    }

    void getCountry(){
        System.out.println("I am a country");
    }
}
