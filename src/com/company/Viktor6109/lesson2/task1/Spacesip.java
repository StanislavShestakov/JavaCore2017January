package com.company.Viktor6109.lesson2.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by VK on 25.01.2017.
 */
public class Spacesip {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int qtSpacesipt; //необходимое количество кораблей
        int qtContainer = 0; //необходимое количество контейнеров
        int qtContainerSpacesip = 11; //количество контейнеров в корабле
        int qtBoxContainer = 34; //количество ящиков в контейнере
        int countSpacesip = 0;
        int countBox = 1;

        for (; ; ) {
            System.out.println("Введите количество (число) ящиков которые необходимо перевезти");
            int qtBox = 0; //количество ящиков
            try {
                qtBox = Integer.parseInt(reader.readLine());
            } catch (Exception e) {
                System.out.println("Ошибка. Вы ввели не число");
                continue;
            }

            //определяем количество кораблей
            if (qtBox % qtBoxContainer * qtContainerSpacesip == 0) {
                qtSpacesipt = qtBox / qtBoxContainer / qtContainerSpacesip;
            } else {
                qtSpacesipt = qtBox / qtBoxContainer / qtContainerSpacesip + 1;
            }

            for (int i = 1; i <= qtSpacesipt; i++) {
                System.out.println("Корабль " + i + ":");
                countSpacesip += qtContainerSpacesip;

                for (int j = 1; j <= qtContainerSpacesip; j++) {
                    qtContainer = j + countSpacesip - qtContainerSpacesip;
                    if (countBox <= qtBox) {
                        System.out.println("Контейнер " + qtContainer + ":");

                        for (int k = 1; k <= qtBoxContainer; k++) {
                            if (countBox <= qtBox) {
                                System.out.println("Ящик " + k);
                                countBox++;
                            }
                        }
                    }
                }
            }
            System.out.println("Кораблей - " + qtSpacesipt);
            System.out.println("Контейнеров - " + qtContainer);
            break;
        }
    }
}
