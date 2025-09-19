package Lab1;

public class mainApp1 {
    public static void main(String[] args) {
        int b = 2;
        int e = 5;
        System.out.println(b + " raised to the power of " + e + " is " + myLibrary.power(b, e));
        System.out.println(e + "! is " + myLibrary.factorial(e));
        System.out.println("Program End");
    }
}