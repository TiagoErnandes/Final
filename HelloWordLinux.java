import java.util.Random;

public class HelloWordLinux {
    public static void main(String[] args) {
        Random rand = new Random();
        for (int i = 0; i < 20; i++) {
            System.out.println(rand.nextInt(10)+1);
        }
    }
}
