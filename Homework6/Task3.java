import java.util.Scanner;

public class Task3 {
        public static void main(String[] args) {
            Scanner console = new Scanner(System.in);
            String line = console.nextLine();
            String[] parts = line.split(" ");
            for (int idx = parts.length - 1; idx >= 0; idx--) {
                System.out.println(parts[idx]);
        }
    }
}
