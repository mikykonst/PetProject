package com.company;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private int age;
    private BankAccount account;

    User(String username, int age) throws Exception {
        this.username = username;
        this.age = age;
        this.account = new BankAccount(0, this);
    }

    public BankAccount getAccount() {
        return account;
    }

    public void setAccount(BankAccount account) {
        this.account = account;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public static class BankAccount implements Account {
        private float moneyAmount;
        private final User user;
        public static List<User> users = new ArrayList<User>();

        BankAccount(float moneyAmount, User user) throws Exception {
            if (user.getAge() > 18) {
                this.moneyAmount = moneyAmount;
                this.user = user;
                users.add(user);
            } else {
                throw new Exception("User should be 18 years old");
            }
        }

        public static void getAllUsers() {
            users.forEach(user -> {
                System.out.println(user.getUsername());
            });
        }

        @Override
        public void withdrawMoney(double amount) throws Exception {
            if (moneyAmount >= amount) {
                this.moneyAmount -= amount;
            } else {
                throw new Exception("There is no money");
            }
        }

        @Override
        public void putMoney(float amount) {
            this.moneyAmount += amount;
        }

        @Override
        public String toString() {
            return "BankAccount{" +
                    "moneyAmount=" + moneyAmount +
                    ", user=" + user.getUsername() +
                    '}';
        }
    }

}
