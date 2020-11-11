
public abstract class MijlocDeTransport {

	
	private double roti;
	private double tonaj;
	public MijlocDeTransport(double roti, double tonaj) {
		super();
		this.roti = roti;
		this.tonaj = tonaj;
	}
	public double getRoti() {
		return roti;
	}
	public double getTonaj() {
		return tonaj;
	}

	public abstract double pret();
}
