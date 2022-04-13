package com.company.codewars.kyu8;

public class AreaOrPerimeter {
    public static void main(String[] args) {

    }
    public static int areaOrPerimeter (int l, int w) {
        int result;
        if(l == w) {
            result = l * w;
        } else result = 2* l + 2 * w;
       return result;
    }
}
