package com.serenitydojo;

public class Dog{
    private String name;
    private String favoriteToy;
    private int age;
    private boolean isFed;

    public static final String DOG_NOISE = "Woof";

public Dog(String name, String favoriteToy, int age){
    this.name = name;
    this.favoriteToy = favoriteToy;
    this.age = age;
}

public String makeNoise(){
    return DOG_NOISE;
}
public void feed(){
    this.isFed=true;
}
public String getName(String name){
    this.name=name;
}
    
    public String getFavoriteToy(String favoriteToy){
    this.favoriteToy=favoriteToy;
}
    
    public int getAge(int age){
    this.age=age;
}
}
