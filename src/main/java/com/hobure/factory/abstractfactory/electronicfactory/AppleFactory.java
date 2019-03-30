package com.hobure.factory.abstractfactory.electronicfactory;

import com.hobure.factory.AppleComputer;
import com.hobure.factory.ApplePhone;
import com.hobure.factory.IComputer;
import com.hobure.factory.IPhone;
import com.hobure.factory.abstractfactory.IElectronicProductFactory;
import com.hobure.factory.factorymethod.IPhoneFactory;

/**
 * 2019-03-30
 * hobure
 */
public class AppleFactory implements IElectronicProductFactory {

    public IPhone createPhone() {
        return new ApplePhone();
    }

    public IComputer createComputer() {
        return new AppleComputer();
    }
}
