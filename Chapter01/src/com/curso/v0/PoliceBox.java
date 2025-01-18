package com.curso.v0;

public class PoliceBox {
    String color; //null
    long age; //0

    public void PoliceBox() {
        color = "blue";
        age = 1200;
    }

    public static void main(String[] time) {
        PoliceBox p = new PoliceBox();
        PoliceBox q = new PoliceBox();
        
        p.color = "green";
        p.age = 1400;
        
        p = q;

        System.out.println("Q1=" + q.color); ///null
        System.out.println("Q2=" + q.age);
        System.out.println("P1=" + p.color);  //null
        System.out.println("P2=" + p.age);
    }
}

