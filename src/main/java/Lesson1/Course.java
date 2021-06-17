package Lesson1;

import java.util.Arrays;

public class Course {
    private final String[] trials = new String[]{"1_Море", "2_Лес", "3_Горы", "4_Пустыня"};
    int count;

    public void doIt(String team, int stage, String player){
        int stageArray = stage - 1;

        for (int i = 0; i <= stageArray; i++) {
            if (stageArray > 3 || stageArray < 0) {
                System.out.println("Такого уровня препятсвий нет, выберите..." + Arrays.toString(trials));
            } else {
                System.out.println("Команда " + team + " игрок " + player + " прошел уровень  " + trials[i]);
                count++;
            }
        }

        if (count == 16) {
            System.out.println("Поздравляем команду: " + team + " прошедшую все испытания");
        }

    }

}
