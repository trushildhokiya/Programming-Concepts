public class AnonymousClass {
    public static void main(String[] args) {
        Tigers tiger = new Tigers();
        tiger.createTiger();
    }
}

class Cats{
    void meow(){
        System.out.println("Meow meow ...");
    }
}


class Tigers{

    //creating annonymous class
    void createTiger(){
        Cats cat1 = new Cats(){
            void meow(){
                System.out.println("Roars .. Roars... ");
            }
        };
        cat1.meow();
    }
}