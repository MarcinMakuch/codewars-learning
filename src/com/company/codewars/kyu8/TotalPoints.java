package com.company.codewars.kyu8;

public class TotalPoints {
    public static void main(String[] args) {
        String[] scores = {"1:0", "2:0", "3:0", "4:0", "2:1", "3:1", "4:1", "3:2", "4:2", "4:3"};
/*        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
                if(scores[i].charAt(0) > scores[i].charAt(2) ) {
                    sum += 3;
                }
                if(scores[i].charAt(0) == scores[i].charAt(2) ) {
                    sum += 1;
                }
        }
        System.out.println(sum);*/

        System.out.println(points(scores));

    }

    public static int points(String[] games) {
        int sum = 0;
        for (int i = 0; i < games.length; i++) {
            if(games[i].charAt(0) > games[i].charAt(2) ) {
                sum += 3;
            }
            if(games[i].charAt(0) == games[i].charAt(2) ) {
                sum += 1;
            }
        }
        return sum;
    }
}

        /*if x>y - 3 points
          if x<y - 0 point
          if x=y - 1 point*/
