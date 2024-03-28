package Inheritance;

import java.time.LocalDate;

enum Classes{PROGRAMMING, ALGORITHMS, GAMEDESIGN,CALCULUS}

public class User{
    static int globalId = 0;
    private String name;
    LocalDate dob;
    int id;
    Classes[] classes;
    String email;

    public User(String name){
        System.out.println("Called the User Constructor");
        this.name = name;
        this.id = ++globalId;
        
    }
    public String GetName(){
        return this.name;
    }
}