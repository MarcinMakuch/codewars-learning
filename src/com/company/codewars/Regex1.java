package com.company.codewars;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex1 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("([0-9]{1,3}\\.){3}[0-9]{1,3}");
        Matcher matcher = pattern.matcher("255.255.255.255");
        System.out.println(matcher.matches());
    }
}
