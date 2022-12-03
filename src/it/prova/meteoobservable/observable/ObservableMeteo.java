package it.prova.meteoobservable.observable;

import java.util.ArrayList;
import java.util.List;

import it.prova.meteoobservable.observer.Observer;


public class ObservableMeteo implements Subject {
	private String bollettinoAttuale;
	private List<Observer> observers = new ArrayList<>();

	public ObservableMeteo() {
		this.bollettinoAttuale = "soleggiato";
	}

	@Override
	public void registerObserver(Observer channel) {
		// notifico il risultato iniziale non appena un observer si sottoscrive
		channel.update(this.bollettinoAttuale);
		this.observers.add(channel);
	}

	@Override
	public void removeObserver(Observer channel) {
		this.observers.remove(channel);
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : this.observers) {
			observer.update(this.bollettinoAttuale);
		}
	}

	public String getBollettinoAttuale() {
		return bollettinoAttuale;
	}

	// se cambia il risultato bisogna scatenare il meccanismo di notifica
	public void setBollettinoAttuale(String bollettinoAttuale) {
		this.bollettinoAttuale = bollettinoAttuale;
		this.notifyObservers();
	}


}
