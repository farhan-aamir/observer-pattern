package com.confiz.observer.pattern;

import com.confiz.observer.pattern.observer.IObserver;
import com.confiz.observer.pattern.observer.SmartPhone;
import com.confiz.observer.pattern.observer.Television;
import com.confiz.observer.pattern.observer.WebPurtal;

public class Driver {

	public static void main(String... args) {
		System.out.println("<====================>");
		System.out.println("   Observer Pattern");
		System.out.println("<====================>");

		IObservable weatherStation = new WeatherStation();

		IObserver smartPhone = new SmartPhone(weatherStation);
		IObserver television = new Television(weatherStation);
		IObserver webPortal = new WebPurtal(weatherStation);

		// Registering All Observer
		weatherStation.register(smartPhone);
		weatherStation.register(television);
		weatherStation.register(webPortal);

		// Notifying All Observers
		weatherStation.notifyObserver();
	}
}
