package footballscores;

import java.util.Scanner;

public class FootballMatch {
    public static void main(String[] args) {
        ScoreSource scoreSource = new ScoreSource();

        FootballFan fan1 = new FootballFan();
        FootballFan fan2 = new FootballFan();

        scoreSource.addListener(fan1);
        scoreSource.addListener(fan2);

        Scanner scanner = new Scanner(System.in);
        String input;
        
        while (true) {
            System.out.print("Enter Score ");
            input = scanner.nextLine();
            
            if (input.isEmpty()) {
                break;
            }
            
            scoreSource.setScoreLine(input);
        }

        scanner.close();
    }
}
