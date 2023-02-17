public class Inheritance {
    public static void main(String[] args) {
        Mercedes myMercedes = new Mercedes(83801154); 
        myMercedes.start(); //Mercedes child class has got attributes from parent class start and stop
        myMercedes.stop();       
    }    
}

class Car{
    String name;
    int value;
    Car(){};

    Car(String name){
        this.name=name;
    }

    Car(String name , int value){
        this.value=value;
    }

    public void start(){
        System.out.println("Car engine has been started");
    }

    public void stop(){
        System.out.println("Engine as been turnd off");
    }
}

class Mercedes extends Car{
    int M_memberID;
    Mercedes(int m_ID){
        this.M_memberID=m_ID;
    }

    Mercedes(){};
}

//There are other types of inheritances too
//extends keyword is used to ingerit a parent class
//1. Single Inheritance
//2.Multilevel inheritance
//3,Heirarchical Inheritance
//4. Multiple inheritance (can be achieved using interfaces)
