/*public class helloapp {
public static void main (String args[]) {
System.out.println("hello world");
}
}
*/
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