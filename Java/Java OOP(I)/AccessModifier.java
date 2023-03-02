public class AccessModifier{
    public static void main(String[] args) {
        Cars myCar=new Cars();
        myCar.startCar();

        Human Alissa = new Human();
        Alissa.setMartialStatus(true);
        System.out.println(Alissa.getMartialStatus());
    }
}


//public is everywhere iniside the project

//example of protected modifier
//scope of protected modifier s inside the package
class Cars{
    protected void startCar(){
        System.out.println("Tr trrrr trrrrrrr ! Hurray engine has been started");
    }
}
//example of prive access Modifier
class Human{
    private boolean isMarried;

    //since isMarried variable is private it can be only accessed within Human class
    //to get value we use getter method: declared below
    public boolean getMartialStatus(){
        return this.isMarried;
    }


    //to set we use setter method : declared blow
    public void setMartialStatus(boolean isMarried){
        this.isMarried=isMarried;
    }
}