package com.hobure.factory.simplefactory;

import com.hobure.factory.ApplePhone;
import com.hobure.factory.IPhone;
import com.hobure.factory.SamsungPhone;

/**
 * 2019-03-30
 * hobure
 */
public class PhoneFactory {

    public IPhone createPahone(String brand){
        //创建苹果手机
        if("apple".equals(brand)){
            return new ApplePhone();
        }
        //创建三星手机
        if("samsung".equals(brand)){
            return new SamsungPhone();
        }
        return null;
    }
}
