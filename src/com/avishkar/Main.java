package com.avishkar;

public class Main {
  static   int a=30;

    public static void main(String[] args) {
	// write your code here
    Person p1 = new Person("avi",33,44);
        System.out.println("yes"+a);
        //p1.name="avi";
        //p1.age=33;

       // System.out.println(Person.count);

      //  System.out.println(p1.name+p1.age);
//print(p1);


    }

 static   void print(Person obj){
        //Main a = new Main();
    //  System.out.println(a.a);

        System.out.println(obj.name);
    }





}
 class Person{
    int age;
    String name;
    static int count;
    Person(String name,int age,int count){
        Main.print(this);
    this.name=name;
    this.age=age;
    this.count=count;
    }





}
