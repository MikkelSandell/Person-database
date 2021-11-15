package com.company;
import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;

public class UserInterface {
    ArrayList<Person> list = new ArrayList<>();
    boolean isRunning = true;

    public void start() {
        list.add(new Person("Mikkel","Sandell"));
        System.out.println("Welcome too person data");
        while (isRunning) {
            System.out.println("""
                    1) add person
                    2) remove Person
                    3) show list of person
                    4) Exit""");
            Scanner scanner = new Scanner(System.in);
            String selection = scanner.next();
            switch (selection) {
                case "1":
                    System.out.println("first type the first name of the person");
                    String fristname = scanner.next();
                    System.out.println("then type a last name");
                    String lastName = scanner.next();
                    list.add(new Person(fristname, lastName));
                    break;
                case "2":
                    System.out.println("Type the name of the person you would like too remove");
                    String removeName = scanner.next();
                    for (int i = 0; i < list.size(); i++) {
                        if( removeName.equals(list.get(i).firstName)){
                            list.remove(i);
                        }

                    }

                    break;
                case "3":
                    Collections.sort(list);
                    for (Person person : list) {
                        System.out.println(person);
                    }
                    break;
                case "4":
                    isRunning =false;
                    System.out.println("see you next time");
            }
        }
    }
}