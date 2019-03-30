package com.hobure.factory.factorymethod.phonefactory;

import com.hobure.factory.IPhone;
import com.hobure.factory.SamsungPhone;
import com.hobure.factory.factorymethod.IPhoneFactory;

/**
 * 2019-03-30
 * hobure
 */
public class SamsungPhoneFactory implements IPhoneFactory {

    public IPhone createPhone() {
        return new SamsungPhone();
    }
}
