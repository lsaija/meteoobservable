package it.prova.meteoobservable.test;

import it.prova.meteoobservable.observable.ObservableMeteo;
import it.prova.meteoobservable.observer.Observer;
import it.prova.meteoobservable.observer.OnlineBollettinoObserver;
import it.prova.meteoobservable.observer.SitoPrevisioniObserver;
import it.prova.meteoobservable.observer.TvPubblicaObserver;

public class TestObservable {

	public static void main(String[] args) {
		ObservableMeteo meteo = new ObservableMeteo();

		System.out.println("...un observer si iscrive e subito viene notificato del fatto che sia soleggiato...");
		Observer streamingOnline = new OnlineBollettinoObserver();
		meteo.registerObserver(streamingOnline);
		System.out.println();

		System.out.println("...il tempo cambia e l'unico observer viene notificato...");
		meteo.setBollettinoAttuale("è nuvoloso");
		System.out.println();

		System.out.println("...si iscrivono due nuovi observer e vengono subito notificati dell'attuale bollettino...");
		Observer sitoPrevisioni = new SitoPrevisioniObserver();
		meteo.registerObserver(sitoPrevisioni);
		Observer tvPubblica = new TvPubblicaObserver();
		meteo.registerObserver(tvPubblica);
		System.out.println();

		System.out.println("...il tempo cambia di nuovo e tutti vengono notificati...");
		meteo.setBollettinoAttuale("Piove!!");
		System.out.println();
	}

}
