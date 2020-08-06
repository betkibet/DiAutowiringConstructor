package com.clc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext cx = new ClassPathXmlApplicationContext("com/clc/resources/byConstructor.xml");
		Car car = (Car) cx.getBean("car");
		car.printCarDetails();

	}

}
