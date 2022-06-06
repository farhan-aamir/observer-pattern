package com.confiz.observer.pattern;

import com.confiz.observer.pattern.observer.IObserver;

public interface IObservable {

	public void register(IObserver observer);

	public void unRegister(IObserver observer);

	public void notifyObserver();

	public String getTemprature();

}
