package com.company;

public class Main {

    public static void main(String[] args) {

        Animal[] animals = {new Shark(), new Turtle(), new Eagle()};
        Shark[] sharks = new Shark[5];
        Turtle[] turtles = new Turtle[5];
        Eagle[] eagles = new Eagle[5];
        for (Animal animal : animals) {



//                if (animal.getClass().getName().equals("com.company.Shark")){
//            ((Shark)animal).attack();  }
//        else if (animal.getClass().getName().equals("com.company.Turtle")){
//            ((Turtle)animal).swim(); }
//       else if (animal.getClass().getName().equals("com.company.Eagle")){
//                ((Eagle)animal).fly(); }
            if (animal instanceof Shark) {
                ((Shark) animal).attack();
                    for (Shark shark: sharks ) {
                    shark = (Shark) animal;
                    System.out.println(shark);
                }
           } else if (animal instanceof Turtle) {
                 ((Turtle) animal).swim();
                    for (Turtle turtle : turtles) {
                    turtle = (Turtle) animal;
                    System.out.println(turtle);
                }
            } else if (animal instanceof Eagle) {
                 ((Eagle) animal).fly();
                    for (Eagle eagle : eagles) {
                    eagle = (Eagle) animal;
                    System.out.println(eagle);
                }
          }
        }
        }
       }
