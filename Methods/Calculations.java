public class Calculations {
    public static void main(String[] args) {
        printHi();
        int x = 5, y = 3;
        
        add(x); // calls the function without using the returned value
        print("x is " + x + " y is " + y);

        int z = add(x, y); 
        print("x is " + x + " y is " + y + " z is " + z);

        subtract(x - 2, z);
        print("x is " + x + " y is " + y + " z is " + z);
    }

    public static void printHi() {
        System.out.println("Hi");
    }

    // prints the string that is passed through
    public static void print(String s) {
        System.out.println(s);
    }

    // adds 3 to the number entered
    public static int add(int a) {
        // this num variable cannot be used outside of this method
        int num = 3;
        // the variable passed through does not need to match the parameters
        return add(a, num);
    }

    // adds the two numbers passed through
    // has the same name as this is overloading a method
    public static int add(int a, int b) {
        // prints out the status of all numbers and the result
        print("Method variables \na: " + a + " \nb: " + b + "\nresult: " + (a + b));
        return a + b;
    }

    // subtracts b from a
    public static int subtract(int a, int b) {
        print("Method variables \na: " + a + " \nb: " + b + "\nresult: " + (a - b));
        return a - b;
    }
}