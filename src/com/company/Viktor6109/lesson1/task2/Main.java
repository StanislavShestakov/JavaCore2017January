package com.company.Viktor6109.lesson1.task2;

/**
 * Created by VK on 24.01.2017.
 */
public class Main {
    public static void main(String[] args) {
        int ageKolja = 10;
        int ageMisha = 15;
        int ageVasja = 20;
        int older = 0;
        int middle = 0;
        int jounger = 0;

        if (ageKolja > ageMisha && ageKolja > ageVasja) {
            older = ageKolja;
            if (ageMisha > ageVasja) {
                middle = ageMisha;
                jounger = ageVasja;
            } else {
                middle = ageVasja;
                jounger = ageMisha;
            }
        }
        if (ageVasja > ageMisha && ageVasja > ageKolja) {
            older = ageVasja;
            if (ageMisha > ageKolja) {
                middle = ageMisha;
                jounger = ageKolja;
            } else {
                middle = ageKolja;
                jounger = ageMisha;
            }
        }
        if (ageMisha > ageKolja && ageMisha > ageVasja) {
            older = ageMisha;
            if (ageKolja > ageVasja) {
                middle = ageKolja;
                jounger = ageVasja;
            } else {
                middle = ageVasja;
                jounger = ageKolja;
            }
        }
        System.out.println("Старший " + older);
        System.out.println("Средний " + middle);
        System.out.println("Младший " + jounger);
    }
}
