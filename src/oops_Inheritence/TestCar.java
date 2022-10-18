package oops_Inheritence;

public class TestCar {
	
	

	public static void main(String[] args) {
		BMW b=new BMW();
		b.Start();
		b.autoParking();
		b.Engine();
		b.refuel();
		b.billing();
		
		
		Car c=new Car();
		c.start();
		c.stop();
		c.refuel();
		
		
		
		
		Vechile v=new Vechile();
			v.Engine();
			
			
			
			Car c1=new BMW();
			c1.start();// BMW
			c1.stop();
			c1.refuel();
			c1.Engine();
			
			
			
			Audi a=new Audi();
			a.theftSafty();
			System.out.println(b.speed);
			
			
			AeroDynamic ad=new AeroDynamic();
			
			ad.Splitter();
			ad.Diveplanes();
			ad.Engine();
			//ad.Start();
			
			Engineering e=new Engineering();
			e.refuel();
			e.Manuplating();
			Physics p=new Physics();
			p.Nuclearphysics();
			p.start();
			p.Gair();
			
			Mechanical m=new Mechanical();
			
			m.Engine();
			
		
			//Vechile v3=new Car();
			//v3.Engine();
			
			final  int i=10;
			
			final int days=20;
			//System.out.println(10*days);
	}

}
