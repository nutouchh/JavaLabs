package ru.mirea.lab12_15.task2;

public class App {
    public static void main(String[] args) {
        Address address = new Address();

        address.separate(
                "COUNTRY, REGION, CITY, STREET, HOUSE, BUILDING, APARTMENT"
        );
        System.out.println(address);

        address.separate(
                "COUNTRY, REGION: CITY, STREET. HOUSE- BUILDING/ APARTMENT"
        );
        System.out.println(address);
    }
}
