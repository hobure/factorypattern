package com.hobure.factory.abstractfactory.electronicfactory;

import com.hobure.factory.IComputer;
import com.hobure.factory.IPhone;
import com.hobure.factory.SamsungComputer;
import com.hobure.factory.SamsungPhone;
import com.hobure.factory.abstractfactory.IElectronicProductFactory;
import com.hobure.factory.factorymethod.IPhoneFactory;

/**
 * 2019-03-30
 * hobure
 */
public class SamsungFactory implements IElectronicProductFactory {

    public IPhone createPhone() {
        return new SamsungPhone();
    }

    public IComputer createComputer() {
        return new SamsungComputer();
    }
}
