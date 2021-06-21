package Lesson1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Course c =  new Course();
        Team team = new Team();
        startGame(c);
    }

    private static void startGame(Course c) {
        System.out.println("Введите название команды");
        Scanner sc = new Scanner(System.in);
        String scNameTeam = sc.nextLine();
        System.out.println("Выберите кол-во игроков 1 - 4, Чтобы команда выиграла должны участвовать все игроки!");
        int nPl = sc.nextInt() - 1;
        for (int i = 0; i <= nPl ; i++) {
            String pl = new Team().getPlayer(i);
            c.doIt(scNameTeam, 4,pl);

        }
    }
}
