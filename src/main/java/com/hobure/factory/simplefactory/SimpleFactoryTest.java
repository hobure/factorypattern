package com.hobure.factory.simplefactory;

import com.hobure.factory.IPhone;

/**
 * 2019-03-30
 * hobure
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {

        IPhone applePhone = new PhoneFactory().createPahone("apple");
        System.out.println(applePhone.getPrice());

        IPhone samsungPhone = new PhoneFactory().createPahone("samsung");
        System.out.println(samsungPhone.getPrice());

    }
}
