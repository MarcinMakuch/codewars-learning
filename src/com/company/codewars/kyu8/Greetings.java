package com.company.codewars.kyu8;

public class Greetings {
    public static void main(String[] args) {
        System.out.println(greet("afasfa"));


    }
    public static String greet(String language){
       String greetings = "";
       switch (language) {
           case "english":
               greetings = "Welcome";
               break;
           case "czech":
               greetings = "Vitejte";
               break;
           case "danish":
               greetings = "Velkomst";
               break;
           case "dutch":
               greetings = "Welkom";
               break;
           case "estonian":
               greetings = "Tere tulemast";
               break;
           case "finnish":
               greetings = "Tervetuloa";
               break;
           case "flemish":
               greetings = "Welgekomen";
               break;
           case "french":
               greetings = "Bienvenue";
               break;
           case "german":
               greetings = "Willkommen";
               break;
           case "irish":
               greetings = "Failte";
               break;
           case "italian":
               greetings = "Benvenuto";
               break;
           case "latvian":
               greetings = "Gaidits";
               break;
           case "lithuanian":
               greetings = "Laukiamas";
               break;
           case "polish":
               greetings = "Witamy";
               break;
           case "spanish":
               greetings = "Bienvenido";
               break;
           case "swedish":
               greetings = "Valkommen";
               break;
           case "welsh":
               greetings = "Croeso";
               break;
           default:
               greetings = "Welcome";
               break;
       }

        return greetings;
    }
}
