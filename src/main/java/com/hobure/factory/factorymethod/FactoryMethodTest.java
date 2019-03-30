package com.hobure.factory.factorymethod;

import com.hobure.factory.IPhone;
import com.hobure.factory.factorymethod.phonefactory.ApplePhoneFactory;
import com.hobure.factory.factorymethod.phonefactory.SamsungPhoneFactory;

/**
 * 2019-03-30
 * hobure
 */
public class FactoryMethodTest {

    public static void main(String[] args) {
        IPhone appPhone =  new ApplePhoneFactory().createPhone();
        System.out.println(appPhone.getPrice());

        IPhone samsungPhone =  new SamsungPhoneFactory().createPhone();
        System.out.println(samsungPhone.getPrice());

    }
}
