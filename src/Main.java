import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        Job player = new Job();
        player.inger();
    }
}

class Job {
    public void inger() throws IOException {
        String[] numbers1 = new String[9];
        for (int x = 0; x < 9; x++) {
            numbers1[x] = "-";
        }
        System.out.println("Стандартная игра 'Крестики - нолики'.");
        System.out.println("-|-|-");
        System.out.println("-|-|-");
        System.out.println("-|-|-");
        boolean key = true;

          while (key == true) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введите 'X' или 'O'.");
            String number = reader.readLine();

            System.out.println("Введите координату на оси абцисс.");
            Integer x = Integer.valueOf((reader.readLine()));

            System.out.println("Введите координату на оси ординат.");
            Integer y = Integer.valueOf((reader.readLine()));
              if (x == 2 & y == 3) {
                  numbers1[1] = number;
                  System.out.println(numbers1[0] + "|" + numbers1[1] + "|" + numbers1[2]);
                  System.out.println(numbers1[3] + "|" + numbers1[4] + "|" + numbers1[5]);
                  System.out.println(numbers1[6] + "|" + numbers1[7] + "|" + numbers1[8]);
              }
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
                if ((numbers1[6].equals("X") & numbers1[3].equals("X") & numbers1[0].equals("X")) ||
                      (numbers1[7].equals("X") & numbers1[4].equals("X") & numbers1[1].equals("X")) ||
                      (numbers1[8].equals("X") & numbers1[5].equals("X") & numbers1[2].equals("X")) ||
                      (numbers1[0].equals("X") & numbers1[1].equals("X") & numbers1[2].equals("X")) ||
                      (numbers1[3].equals("X") & numbers1[4].equals("X") & numbers1[5].equals("X")) ||
                      (numbers1[6].equals("X") & numbers1[7].equals("X") & numbers1[8].equals("X")) ||
                      (numbers1[0].equals("X") & numbers1[4].equals("X") & numbers1[8].equals("X")) ||
                      (numbers1[6].equals("X") & numbers1[4].equals("X") & numbers1[2].equals("X"))) {
                  System.out.println("Победил игрок, играющий крестиками.");
                  key = false;
                 }
                 if ((numbers1[6].equals("O") & numbers1[3].equals("O") & numbers1[0].equals("O")) ||
                      (numbers1[7].equals("O") & numbers1[4].equals("O") & numbers1[1].equals("O")) ||
                      (numbers1[8].equals("O") & numbers1[5].equals("O") & numbers1[2].equals("O")) ||
                      (numbers1[0].equals("O") & numbers1[1].equals("O") & numbers1[2].equals("O")) ||
                      (numbers1[3].equals("O") & numbers1[4].equals("O") & numbers1[5].equals("O")) ||
                      (numbers1[6].equals("O") & numbers1[7].equals("O") & numbers1[8].equals("O")) ||
                      (numbers1[0].equals("O") & numbers1[4].equals("O") & numbers1[8].equals("O")) ||
                      (numbers1[6].equals("O") & numbers1[4].equals("O") & numbers1[2].equals("O"))) {
                  System.out.println("Победил игрок, играющий ноликами.");
                  key = false;
                 }
        }
    }
}