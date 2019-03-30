package com.hobure.factory.abstractfactory;

import com.hobure.factory.IPhone;
import com.hobure.factory.abstractfactory.electronicfactory.AppleFactory;
import com.hobure.factory.abstractfactory.electronicfactory.SamsungFactory;
import com.hobure.factory.factorymethod.phonefactory.ApplePhoneFactory;
import com.hobure.factory.factorymethod.phonefactory.SamsungPhoneFactory;

/**
 * 2019-03-30
 * hobure
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {
        AppleFactory appleFactory = new AppleFactory();
        System.out.println(appleFactory.createComputer().getPrice());
        System.out.println(appleFactory.createPhone().getPrice());

        SamsungFactory samsungFactory = new SamsungFactory();
        System.out.println(samsungFactory.createComputer().getPrice());
        System.out.println(samsungFactory.createPhone().getPrice());

    }
}
