package com.confiz.observer.pattern;

import java.util.ArrayList;
import java.util.List;

import com.confiz.observer.pattern.observer.IObserver;

public class WeatherStation implements IObservable {
	
	String temprature = "26 F";
	List<IObserver> observers = new ArrayList<IObserver>();

	@Override
	public void register(IObserver observer) {
		observers.add(observer);
	}

	@Override
	public void unRegister(IObserver observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObserver() {
		observers.forEach(observer -> {
			observer.update();
		});
	}
	
	@Override
	public String getTemprature() {
		return temprature;
	}

}
