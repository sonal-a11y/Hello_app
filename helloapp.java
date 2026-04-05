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

public class helloapp {
    public static void main(String[] args) {

        // If no arguments → default
        if (args.length == 0) {
            System.out.println("Hello World");
        } else {
            // Loop through all names
            for (int i = 0; i < args.length; i++) {
                System.out.println("Hello " + args[i]);
            }
        }
    }
}
*/
public class helloapp {
    public static void main(String[] args) {

        // Check if no arguments are passed
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // Enhanced for loop (for-each)
            for (String name : args) {
                System.out.println("Hello, " + name + "!");
            }
        }
    }
}