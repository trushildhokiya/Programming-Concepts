import java.util.EnumSet;
import java.util.Iterator;


public class Enumset {
    public static void main(String[] args) {
        
        //creating enum
        enum Degree{
            SCHOOL,HIGHSCHOOL,BACHELORS, MASTERS,PHD
        };

        //creating some enum sets
        
        //1. using allOf()

        EnumSet<Degree> data1 = EnumSet.allOf(Degree.class);
        System.out.println(data1);

        //2.noneOf()

        EnumSet<Degree> data2 = EnumSet.noneOf(Degree.class);
        System.out.println(data2);

        //range(range1 to range2)

        EnumSet<Degree> data3 = EnumSet.range(Degree.BACHELORS, Degree.PHD);
        System.out.println(data3);

        //of()
        EnumSet<Degree> data4 = EnumSet.of(Degree.SCHOOL , Degree.PHD);
        System.out.println(data4);

        //adding elements
        data4.add(Degree.MASTERS);
        System.out.println(data4);

        //accessing elements

        Iterator<Degree> iterator = data1.iterator();
        while( iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println();

        //deleting elements
        data1.remove(Degree.PHD);
        System.out.println(data1);
        /*can also use removeall() to remove all items from set */
    }    
}
