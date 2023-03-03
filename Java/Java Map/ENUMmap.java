import java.util.EnumMap;

public class ENUMmap {

    enum Degree{
        BACHELORS , MASTERS , PHD
    };

    public static void main(String[] args) {
        
        //creating enumMaps
        EnumMap<Degree,String> data = new EnumMap<>(Degree.class);

        //adding element in data
        data.put(Degree.BACHELORS, "Max");
        data.put(Degree.MASTERS, "Henry");
        data.put(Degree.PHD, "Brew");

        System.out.println(data);

        //accessing elements 

        System.out.println("entries: "+data.entrySet());
        System.out.println("Keys: "+data.keySet());
        System.out.println("Values: "+data.values());

        //get()
        System.out.println(data.get(Degree.BACHELORS));

        //Remove elements 
        data.remove(Degree.BACHELORS);
        data.remove(Degree.PHD, "Breq");
        System.out.println(data);

        // replace() and replaceAll()
        data.replace(Degree.MASTERS, "Henry", "karl");
        System.out.println(data.entrySet());

        data.replaceAll((key,oldValue)->oldValue.toUpperCase());
        System.out.println(data.entrySet());
    }
}
