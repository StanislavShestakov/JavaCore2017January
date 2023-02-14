package com.company.Games.Tag.XO;

/**
 * Created by Stas on 21.03.2017.
 */
public class Game {
    private static int limit = 3;

    public int[][] getPole() {
        return mas;
    }

    private int mas[][] = new int[limit][limit];

    boolean switchXO = true;

    public void clear(){
        switchXO = true;
        for (int i = 0; i < limit ; i++) {
            for (int j = 0; j < limit; j++) {
                mas[i][j] = 0;
            }
        }
    }


    public void printGame() {
        //  mas[1][2] = 2;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                //
                if (mas[i][j] == 0) {
                    System.out.print((char) 9856);
                }
                if (mas[i][j] == 1) {
                    System.out.print('X');
                }
                if (mas[i][j] == 2) {
                    System.out.print('O');
                }

            }
            System.out.println();
        }
    }

    public boolean turn(int x, int y, boolean symbol) {
        if (x >= limit || y >= limit) {
            //   System.out.println("Походить нельзя");
            return false;
        }
        if (mas[x][y] != 0) {
            //   System.out.println("Походить нельзя");
            return false;
        }
        if (symbol) {
            mas[x][y] = 1;
        } else {
            mas[x][y] = 2;
        }

        return true;

    }
    public int GUITurn(int x, int y){
        //0 - ходить нельзя
        //1 - походил крестик
        //-1 - походил нолик
        if(turn(x,y, switchXO)){
            if(switchXO)
            {
                switchXO = false;
                return 1;
            }else{
                switchXO = true;
                return -1;
            }
        }
        return 0;

    }

    public boolean checkIsWin() {
        int winPos = 0;
        int flagXO = 0;

        // проверка по горизонтали
        for (int i = 0; i < limit; i++) {
            for (int j = 0; j < limit; j++) {
                if (mas[i][j] != 0) {
                    if (winPos == 0) {
                        flagXO = mas[i][j];
                        //     System.out.println(winPos + "........." + flagXO);
                        winPos++;
                    } else {
                        //     System.out.println(winPos  +  "........." + flagXO);
                        if (flagXO != mas[i][j]) {
                            break;
                        } else {
                            winPos++;
                        }
                    }
                }

            }
            if (winPos == limit) {
                //   System.out.println("победа произошла");
                clear();
                return true;
            }
            winPos = 0;
            flagXO = 0;

        }
        //проверка по вертикали
        for (int i = 0; i < limit; i++) {

            for (int j = 0; j < limit; j++) {
                if (mas[j][i] != 0) {
                    if (winPos == 0) {
                        flagXO = mas[j][i];
                        //     System.out.println(winPos + "........." + flagXO);
                        winPos++;
                    } else {
                        //     System.out.println(winPos  +  "........." + flagXO);
                        if (flagXO != mas[j][i]) {
                            break;
                        } else {
                            winPos++;
                        }
                    }
                }

            }
            if (winPos == limit) {
                //    System.out.println("победа произошла");
                clear();
                return true;
            }
            winPos = 0;
            flagXO = 0;

        }
        //проверка по нисходящей косой
        for (int i = 0; i < limit; i++) {
            if (mas[i][i] != 0) {
                if (winPos == 0) {
                    flagXO = mas[i][i];

                    winPos++;
                } else {
                    if (flagXO != mas[i][i]) {
                        break;
                    } else {
                        winPos++;
                    }
                }
            }

        }
        if (winPos == limit) {
            //    System.out.println("победа произошла");
            clear();
            return true;
        }
        winPos = 0;
        flagXO = 0;

        //проверка по восходящей
        for (int i = 0; i < limit; i++) {
            if (mas[i][limit - 1 - i] != 0) {
                if (winPos == 0) {
                    flagXO = mas[i][limit - 1 - i];
                    winPos++;
                } else {
                    if (flagXO != mas[i][limit - 1 - i]) {
                        break;
                    } else {
                        winPos++;
                    }
                }
            }
        }
        if (winPos == limit) {
            //   System.out.println("победа произошла");
            clear();
            return true;
        }
        winPos = 0;
        flagXO = 0;

        return false;
    }


}
