public class This {
    public static void main(String[] args) {
        
        Employee emp1 = new Employee("Trushil","Smarty Talks");
        System.out.println(emp1.getID());

        Employee emp2 = new Employee("Varun");
        System.out.println(emp2.getID());

        Employee emp3 = new Employee();
        System.out.println(emp3.getID());
    }
}

//this keyword is usedd to point to the object who is calling th method of the class
//this keyword can be used to access instance variables of the class of as to call the constructor
//of the class ex this(paramneters)

class Employee{
    public String name;
    public String letter;
    public int ID;

    Employee(String name , String letter){
        this.name=name;
        this.letter= letter;
        try{
            this.ID=letter.hashCode();
        }
        catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
    }

    Employee(String name){
        this(name,name);
    }

    Employee(){
        this(null);
    }

    public int getID(){
        return this.ID;
    }
}
