package com.confiz.observer.pattern.observer;

import com.confiz.observer.pattern.IObservable;

public class WebPurtal implements IObserver{

	IObservable obserable;

	public WebPurtal(IObservable obserable) {
		this.obserable = obserable;
	}

	@Override
	public void update() {
		System.out.println("Web Portal");
		System.out.println("Current Temprature: " + obserable.getTemprature());
		System.out.println();
		System.out.println("<=============================================================>");
	}
	
}
