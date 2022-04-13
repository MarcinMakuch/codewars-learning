package com.company.tablice;

import java.util.Stack;

public class Main01 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Minecraft");
        stack.push("Doom");
        stack.push("Mario Bros");
        stack.push("Alien Isolation");
        stack.push("Tekken");
        stack.push("NFS");
        stack.push("This war of mine");


        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.peek());

    }
}
