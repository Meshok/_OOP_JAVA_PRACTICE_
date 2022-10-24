package Classes;

import java.util.*;

public class Game {
    private Queue<Integer> firstPlayer = new ArrayDeque<Integer>();
    private Queue<Integer> secondPlayer = new ArrayDeque<Integer>();

    public Game() {
        setHand(firstPlayer);
        setHand(secondPlayer);

        for (int i = 1; i <= 106; i++) {
            int firstCard = firstPlayer.poll();
            int secondCard = secondPlayer.poll();
            if (firstWin(firstCard, secondCard)) {
                firstPlayer.add(firstCard);
                firstPlayer.add(secondCard);
            } else {
                secondPlayer.add(secondCard);
                secondPlayer.add(firstCard);
            }

            if (secondPlayer.isEmpty()) {
                System.out.println("First Player wins! Time: " + i);
                return;
            } else if (firstPlayer.isEmpty()) {
                System.out.println("Second Player wins! Time: " + i);
                return;
            }
        }

        System.out.println("Botva");
    }

    private void setHand(Queue<Integer> queue) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            while (!scanner.hasNextInt()) {
                scanner.next();
            }
            queue.add(scanner.nextInt());
        }
    }

    private boolean firstWin(int firstCard, int secondCard) {
        return (firstCard == 0 && secondCard == 9) || (firstCard > secondCard && (firstCard != 9 || secondCard != 0));
    }
}
