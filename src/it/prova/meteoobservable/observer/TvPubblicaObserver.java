package it.prova.meteoobservable.observer;

public class TvPubblicaObserver implements Observer{
	private String bollettinoInSovrimpressione;
	@Override
	public void update(Object nuovoBollettino) {
		this.bollettinoInSovrimpressione = (String) nuovoBollettino;
		System.out.println("TvPubblicaObserver attivo...bollettino attuale mostrato in sovrimpressione: "
				+ this.bollettinoInSovrimpressione);

	}

}
