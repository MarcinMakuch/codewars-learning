package com.company.codewars.kyu8;

public class BuildString {
    public static void main(String[] args) {

        System.out.println(buildString());

    }
    public static String buildString(String... args) {
        StringBuilder sb = new StringBuilder();
        String iLike = "I like ";
        for (int i = 0; i < args.length; i++) {
            if(args.length == 0){
                return iLike;
            }
            else if(i == args.length-1 && args.length != 0){
                sb.append(args[i]).append("!");
            } else
            sb.append(args[i]).append(",").append(" ");
        }
        return iLike + sb.toString();
    }
}
