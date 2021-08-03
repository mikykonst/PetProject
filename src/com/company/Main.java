package com.company;

public class Main {

    public static void main(String[] args) throws Exception {
        User user = new User("Misha", 24);

        System.out.println(user.getAccount());

        user.getAccount().putMoney(1000);

        System.out.println(user.getAccount().toString());

        user.getAccount().withdrawMoney(100);

        System.out.println(user.getAccount());

        user.getAccount().withdrawMoney(10000);

        User.BankAccount.getAllUsers();
    }
}
