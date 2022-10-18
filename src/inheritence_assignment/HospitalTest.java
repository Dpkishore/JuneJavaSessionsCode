package inheritence_assignment;

public class HospitalTest {

	public static void main(String[] args) {
		
	Hospital h=new Hospital();
	h.pharmaceuticals();
	h.physicianPractices();
	
	Apollo a=new Apollo();
	a.hospitalStaff();
	a.pharmaceuticals();
	a.HospitalDoctors();
	
	Hospital hp=new Fortis();
	hp.physicianPractices();
	
	
	

	}

}
