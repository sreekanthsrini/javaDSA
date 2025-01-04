package string;

public class prettyprinting {
    public static void main(String[] args) {
        
        float a = 3.14325f;
        System.out.printf("The float using pretty printing: %.2f%n", a); // Use %n for newline
        
        String b = "vanakam";
        System.out.printf("The string can be concatenated: %.4s%n", b); // Added %n for newline

        System.out.println("The placeholder can be used like:");
        System.out.printf("Hi, I am %s and I am a %s%n", "Sreekanth", "software developer at Microsoft"); // Added %n for newline
        System.out.printf("Hi, I am %s and I am %d in class%n", "Sreekanth", 1); // Corrected newline and fixed formatting
    }
}
