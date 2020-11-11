
public abstract class MasiniMari extends MijlocDeTransport
{
	private int incarcatura;
	public MasiniMari(double roti, double tonaj, int incarcatura) {
		super(roti, tonaj);
		this.incarcatura = incarcatura;
	}
	public int getIncarcatura() {
		return incarcatura;
	}

	
	
}
