/*public class helloapp {
public static void main (String args[]) {
System.out.println("hello world");
}
}

public class helloapp {
    public static void main(String[] args) {
        if (args.length > 0) {
            String name = args[0];
            System.out.println("Hello, " + name + "!");
        } else {
            System.out.println("Hello, World!");
        }
    }
}
*/
public class helloapp {
    public static void main(String[] args) {
        String name;

        // Check if argument is passed
        if (args.length > 0) {
            name = args[0];
        } else {
            name = "World";
        }

        // Display greeting
        System.out.println("Hello " + name);
    }
}