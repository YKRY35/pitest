package com.zhou.service;

public class UserService {

    int getNum(int a){
        int w = 1;
        return w + a;
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getClass().getClassLoader());
    }
}
