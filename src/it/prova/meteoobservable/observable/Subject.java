package it.prova.meteoobservable.observable;

import it.prova.meteoobservable.observer.Observer;

public interface Subject {
	public void registerObserver(Observer o);

	public void removeObserver(Observer o);

	public void notifyObservers();

}
