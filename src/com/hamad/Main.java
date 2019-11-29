package com.hamad;

public class Main {

    public static void main(String[] args) {
	    Vehicle vehicle1 = new Vehicle();
        System.out.println(vehicle1.name);
        vehicle1.setName("city");
        System.out.println(vehicle1.name);

        Vehicle vehicle2 = new Vehicle("BMW","White","X5","BMW");
        System.out.println(vehicle2.color);

    }
}
