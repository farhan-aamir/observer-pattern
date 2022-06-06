package com.confiz.observer.pattern.observer;

import com.confiz.observer.pattern.IObservable;

public class SmartPhone implements IObserver {

	IObservable obserable;

	public SmartPhone(IObservable obserable) {
		this.obserable = obserable;
	}

	@Override
	public void update() {
		System.out.println("Smart Phone");
		System.out.println("Current Temprature: " + obserable.getTemprature());
		System.out.println();
		System.out.println("<=============================================================>");
	}

}
