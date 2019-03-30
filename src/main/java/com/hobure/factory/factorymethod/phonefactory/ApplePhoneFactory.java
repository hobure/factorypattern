package com.hobure.factory.factorymethod.phonefactory;

import com.hobure.factory.IPhone;
import com.hobure.factory.ApplePhone;
import com.hobure.factory.factorymethod.IPhoneFactory;

/**
 * 2019-03-30
 * hobure
 */
public class ApplePhoneFactory implements IPhoneFactory {

    public IPhone createPhone() {
        return new ApplePhone();

    }
}
