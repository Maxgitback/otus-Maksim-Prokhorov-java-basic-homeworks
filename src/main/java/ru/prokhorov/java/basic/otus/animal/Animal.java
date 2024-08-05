package ru.prokhorov.java.basic.otus.animal;
public abstract class Animal {
     String name;
     int runningSpeed = 1;
     int swimmingSpeed = 6;
     int stamina = 1000;


     public int run(int distance) {
          int calculation = runningSpeed * distance;
          if (stamina >= calculation) {
               stamina -= calculation;
               System.out.println(name + " Побежал затратив выносливость в размере " + calculation +
                       "\nу" + name + " осталось выносливости: " + stamina);
               return calculation;
          } else {
               System.out.println("У " + name + "закончилась выносливсоть");
          }
          if (stamina == 0) {
               System.out.println("у животного " + name + " появилось состояние усталости");
          }
          return -1;
     }
     public abstract int swimming(int distance);
     public void info(){
          System.out.println("У " + name + " осталось выносливости в размере: " + stamina);
     }
}
