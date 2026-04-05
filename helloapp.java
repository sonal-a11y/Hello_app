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

public class helloapp {
    public static void main(String[] args) {

        // If no arguments → default message
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            String result = "";

            // Enhanced for loop to add names with comma
            for (String name : args) {
                result += name + ", ";
            }

            // Remove last ", " using substring
            result = result.substring(0, result.length() - 2);

            System.out.println("Hello, " + result + "!");
        }
    }
}
*/
public class helloapp {
    public static void main(String[] args) {

        // If no arguments → default message
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // Join all names with comma and space
            String names = String.join(", ", args);

            System.out.println("Hello, " + names + "!");
        }
    }
}