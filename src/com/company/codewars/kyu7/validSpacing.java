package com.company.codewars.kyu7;
import org.apache.commons.lang3.StringUtils;

public class validSpacing {
    public static void main(String[] args) {

        String word = "c o d e w a r s";

        System.out.println(validSpacing(word));

    }
    public static boolean validSpacing(String s) {
        int count = StringUtils.countMatches(s, " ");
        char space = ' ';
        for (int i  = 0; i < s.length()-2; i++) {
            if (s.charAt(i) == space && s.charAt(i+1) == space) {
                return false;
            }
        }
        if(s.startsWith(" ") || s.endsWith(" ")) {
           return false;
        } else if (s.length() == 1 && count == 1){
            return false;
        } else
        return true;
    }
}
