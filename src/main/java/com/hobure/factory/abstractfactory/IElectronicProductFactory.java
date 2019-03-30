package com.hobure.factory.abstractfactory;

import com.hobure.factory.IComputer;
import com.hobure.factory.IPhone;

/**
 * 2019-03-30
 * hobure
 */
public interface IElectronicProductFactory {

    public IPhone createPhone();

    public IComputer createComputer();
}
