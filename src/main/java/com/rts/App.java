package com.rts;

import com.rts.pojo.Car;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Car car = new Car();
        car.setCarNo("TN67Z8668");
        car.setManufacturer("Audi");
        car.setModel("A3");
        
        System.out.println(car.getCarNo() );
        System.out.println(car.getManufacturer() );
        System.out.println(car.getModel() );
    }
}
