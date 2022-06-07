import java.util.Scanner;

// public class Main {
public class BAEKJOON_9498 {
    
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        int score;
        char result = 'F';

        score = scanner.nextInt();

        if (score >= 60 && score < 70) {
            result = 'D';
        } else if (score >= 70 && score < 80) {
            result = 'C';
        } else if (score >= 80 && score < 90) {
            result = 'B';
        } else if (score >= 90 && score <= 100) {
            result = 'A';
        }

        System.out.println(result);
        scanner.close();

    }
}
