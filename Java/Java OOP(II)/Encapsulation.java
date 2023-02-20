public class Encapsulation {
    public static void main(String[] args) {
        Students student1 = new Students();
        student1.setDetails("Markus", "9876543210");
        student1.getData();        
    }
}
/*
 * Encapsulation is one of the key features of object-oriented programming. Encapsulation refers to the bundling of fields and methods inside a single class.
    can be achieved using private access modifier
 */
class Students{
    private String name;
    private String phoneNumber;

    public void setDetails(String name , String mobNo){
        this.name=name;
        this.phoneNumber=mobNo;
    }

    public void getData(){
        System.out.printf("{name:%s , Contact Number: %s}",name,phoneNumber);
    }
}
