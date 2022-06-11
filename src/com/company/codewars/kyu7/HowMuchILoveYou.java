package com.company.codewars.kyu7;

public class HowMuchILoveYou {
    public static void main(String[] args) {

        System.out.println(howMuchILoveYou(33));

    }

    public static String howMuchILoveYou(int nb_petals) {
        String [] petals = {"I love you", "a little", "a lot", "passionately", "madly", "not at all"};
        String answer = "";
        int result = nb_petals % 6;
        if(result == 0){
            answer = petals[5];
        } else {
            answer = petals[result-1];
        }
        return answer;
    }
}







