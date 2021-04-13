public class Main {
    public static void main(String[] args) {
        Sugar tree = new Sugar();
        //Above is creating a new Sugar object.

        tree.setShape("tree");
        tree.cutOut(tree.getShape(), 10);
        tree.bakeCookie(350, 12);
        tree.decorate();
        //Above is using methods to change parameters.

        Sugar aCookie = new Sugar();
        //Above is creating a new Sugar object.

        aCookie.decorate();
        //Above is attemping to decorate an unbaked cookie.
    }
}