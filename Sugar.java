public class Sugar extends Cookie{
    String cookieShape;
    boolean decorated;

    Sugar(){
        cookieShape = "";
        decorated = false;
    }
    //Above is first contructor.

    Sugar(String theCookieShape){
        cookieShape = theCookieShape;
        decorated = false;
    }
    //Above is second constructor with parameters.

    String getShape(){
        return cookieShape;
    }
    //Above is accessor method.

    void setShape(String theCookieShape){
        cookieShape = theCookieShape;
    }
    //Above is mutator method.

    void cutOut(String theCookieShape, int theNumber){
        System.out.println(theNumber + " cookies were cut into " + theCookieShape);

        setNum(theNumber);
    }

    void decorate(){
        if (super.getBaked()){
            decorated = true;

            System.out.println("The cookies were decorated");
        }
        else{
            System.out.println("Make sure to bake the cookies first");
        }
    }
}