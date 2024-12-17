package com;

class Konto {
	// Attribute
	private int kontoNr;
	private double saldo;
	Kunde kundenDaten;
	
	

	public Konto(int kontoNr, double saldo, Kunde kundenDaten) {
		super();
		this.kontoNr = kontoNr;
		this.saldo = saldo;
		this.kundenDaten = kundenDaten;
	}

	public int getKontoNr() {
		return kontoNr;
	}

	public void setKontoNr(int kontoNr) {
		this.kontoNr = kontoNr;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Kunde getKundenDaten() {
		return kundenDaten;
	}

	public void setKundenDaten(Kunde kundenDaten) {
		this.kundenDaten = kundenDaten;
	}

}