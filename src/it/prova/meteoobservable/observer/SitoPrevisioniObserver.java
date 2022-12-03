package it.prova.meteoobservable.observer;

public class SitoPrevisioniObserver implements Observer {
	private String titoloPagineConBollettino;

	@Override
	public void update(Object nuovoBollettino) {

		this.titoloPagineConBollettino = (String) nuovoBollettino;
		System.out.println("SitoPrevisioniObserver attivo...bollettino attuale mostrato nel titolo: "
				+ this.titoloPagineConBollettino);
	}

}
