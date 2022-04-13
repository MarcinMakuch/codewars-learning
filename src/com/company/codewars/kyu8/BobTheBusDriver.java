package com.company.codewars.kyu8;

public class BobTheBusDriver {
    public static void main(String[] args) {

    }

    public static int enough(int cap, int on, int wait) {
        int result = 0;
        if (cap - on - wait == 0){
            return result;
        }
        if(cap - on - wait < 0) {
            result = (cap - on - wait) * (-1);
        }
        return result;   // your code here
    }
}
