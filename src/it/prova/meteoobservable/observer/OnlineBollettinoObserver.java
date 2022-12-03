package it.prova.meteoobservable.observer;

public class OnlineBollettinoObserver implements Observer {

	private String bollettino;

	@Override
	public void update(Object nuovoBollettino) {
		this.bollettino=(String) nuovoBollettino;
		System.out.println("OnlineBollettinoObserver attivo...bollettino attuale: "+ this.bollettino);
	}
	
}
