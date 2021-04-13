/*
IS 4010: Lab 10
Partners: Alec Rezelj, Kiley Hardcorn
Date: April 13, 2021
*/

public class Cookie{
    public int number;
    public int bakeTemp;
    public int bakeTime;
    public boolean baked;

    Cookie(){
        number = 0;
        bakeTemp = 0;
        bakeTime = 0;
        baked = false;
    }
    //Above is setting all instance variables to zero/false.

    Cookie(int theNumber, int theBakeTemp, int theBakeTime){
        number = theNumber;
        bakeTemp = theBakeTemp;
        bakeTime = theBakeTime;
        baked = false;
    }
    //Above is setting variables to parameters.

    boolean getBaked(){
        return baked;
    }
    //Above is accessor method for isReady.

    void setNum(int theNumber){
        number = theNumber;
    }
    //Above is mutator method for number. 
    
    void bakeCookie(int theBakeTemp, int theBakeTime){

        /*
        Prof. Webb -- 
            In your intructions you have that this method should print how many cookies were baked.
            However, in your picture this method prints without the number.
            I went ahead and made the method print how it does in the picture.
            If we wanted to print the number of cookies too in this method it would be as follows:
                System.out.println(number + " cookies were baked at " + theBakeTemp + " degrees F for " + theBakeTime + " minutes");
                baked = true;
            Let me know if you have any questions.
        Alec
        */

        System.out.println("The cookies were baked at " + theBakeTemp + " degrees F for " + theBakeTime + " minutes");
        baked = true;
    }
    //Above is the method to bake the cookies.
}