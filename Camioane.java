public class Camioane extends MasiniMari {
	public Camioane(double roti, double tonaj, int incarcatura) {
		super(roti, tonaj, incarcatura);
		// TODO Auto-generated constructor stub	

	}
	@Override
	public int getIncarcatura() {
		// TODO Auto-generated method stub
		return super.getIncarcatura();
	}
	@Override
	public double getRoti() {
		// TODO Auto-generated method stub
		return super.getRoti();
	}
	@Override
	public double getTonaj() {
		// TODO Auto-generated method stub
		return super.getTonaj();
	}
	@Override
	public double pret() {
		// TODO Auto-generated method stub
		return getRoti()*1000+getIncarcatura()*100+getTonaj()*10;
	}		

}
