public class Operators{
    public static void main(String[] args) {
        
        //operators in java
        //1. Arithmetic (add, subtract , multiply , divide and modulo)
        System.out.println(54/16);

        //2.Assignment Operator (assigns a value to a variable)
        //{=,+=,-= , *=}
        int a =10; // assign value 10 to variable a
        System.out.println(a*=2); // a=a *2

        //3. Relational operator (> , < , >= , <= , != , ==)
        int myNum = 10;
        int myNum2 = 78;
        System.out.println(myNum>=myNum2);

        //4. Logcal operators (&& , ||)
        boolean myBool= true;
        if(myBool==true && myNum==10){
            System.out.println("All conditions are met");
        }
        
        //4. Unary Operators (++, --)
        System.out.println(--myNum2);

        //5. Bitwise Operator (~ , >> , << ,& , ^)
        System.out.println(true^true); // XOR operation both same false else true

    }
}