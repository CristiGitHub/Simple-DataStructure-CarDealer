import java.util.LinkedList;
import java.util.List;

public class Dealer {

	private List<MijlocDeTransport> parcAuto = new LinkedList<MijlocDeTransport>();
	
	public void add(MijlocDeTransport mj){
		parcAuto.add(mj);
	}
	
	public void display(){
		for(MijlocDeTransport mj : parcAuto){
			System.out.println(mj);
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MijlocDeTransport p1=new Camioane(8, 20, 23);
		Dealer d = new Dealer();
		d.add(p1);
		
		d.display();
	}

}
