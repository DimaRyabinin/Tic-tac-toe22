import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        Player game = new Player();
        game.startGame();
    }
}

class Player {
    Job player = new Job();
    public void startGame() throws IOException {
            player.inger();
    }
}

class Job {
    public void inger() throws IOException {
        String[] numbers1 = new String[9];
        numbers1[0] = "-";
        numbers1[1] = "-";
        numbers1[2] = "-";
        numbers1[3] = "-";
        numbers1[4] = "-";
        numbers1[5] = "-";
        numbers1[6] = "-";
        numbers1[7] = "-";
        numbers1[8] = "-";
        System.out.println("Стандартная игра 'Крестики - нолики'.");
        System.out.println("-|-|-");
        System.out.println("-|-|-");
        System.out.println("-|-|-");
        while (true) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введите 'X' или 'O'.");
            String number = reader.readLine();

            System.out.println("Введите координату на оси абцисс.");
            Integer x = Integer.valueOf((reader.readLine()));

            System.out.println("Введите координату на оси ординат.");
            Integer y = Integer.valueOf((reader.readLine()));

            if (x == 1 & y == 1) {
                numbers1[6] = number;
                System.out.println(numbers1[0] + "|" + numbers1[1] + "|" + numbers1[2]);
                System.out.println(numbers1[3] + "|" + numbers1[4] + "|" + numbers1[5]);
                System.out.println(numbers1[6] + "|" + numbers1[7] + "|" + numbers1[8]);
            }
            if (x == 1 & y == 2) {
                numbers1[3] = number;
                System.out.println(numbers1[0] + "|" + numbers1[1] + "|" + numbers1[2]);
                System.out.println(numbers1[3] + "|" + numbers1[4] + "|" + numbers1[5]);
                System.out.println(numbers1[6] + "|" + numbers1[7] + "|" + numbers1[8]);
            }
            if (x == 1 & y == 3) {
                numbers1[0] = number;
                System.out.println(numbers1[0] + "|" + numbers1[1] + "|" + numbers1[2]);
                System.out.println(numbers1[3] + "|" + numbers1[4] + "|" + numbers1[5]);
                System.out.println(numbers1[6] + "|" + numbers1[7] + "|" + numbers1[8]);
            }
            if (x == 2 & y == 1) {
                numbers1[7] = number;
                System.out.println(numbers1[0] + "|" + numbers1[1] + "|" + numbers1[2]);
                System.out.println(numbers1[3] + "|" + numbers1[4] + "|" + numbers1[5]);
                System.out.println(numbers1[6] + "|" + numbers1[7] + "|" + numbers1[8]);
            }
            if (x == 3 & y == 1) {
                numbers1[8] = number;
                System.out.println(numbers1[0] + "|" + numbers1[1] + "|" + numbers1[2]);
                System.out.println(numbers1[3] + "|" + numbers1[4] + "|" + numbers1[5]);
                System.out.println(numbers1[6] + "|" + numbers1[7] + "|" + numbers1[8]);
            }
            if (x == 2 & y == 2) {
                numbers1[4] = number;
                System.out.println(numbers1[0] + "|" + numbers1[1] + "|" + numbers1[2]);
                System.out.println(numbers1[3] + "|" + numbers1[4] + "|" + numbers1[5]);
                System.out.println(numbers1[6] + "|" + numbers1[7] + "|" + numbers1[8]);
            }
            if (x == 3 & y == 2) {
                numbers1[5] = number;
                System.out.println(numbers1[0] + "|" + numbers1[1] + "|" + numbers1[2]);
                System.out.println(numbers1[3] + "|" + numbers1[4] + "|" + numbers1[5]);
                System.out.println(numbers1[6] + "|" + numbers1[7] + "|" + numbers1[8]);
            }
            if (x == 3 & y == 3) {
                numbers1[2] = number;
                System.out.println(numbers1[0] + "|" + numbers1[1] + "|" + numbers1[2]);
                System.out.println(numbers1[3] + "|" + numbers1[4] + "|" + numbers1[5]);
                System.out.println(numbers1[6] + "|" + numbers1[7] + "|" + numbers1[8]);
            }
        }
    }
}