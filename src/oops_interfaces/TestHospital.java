package oops_interfaces;

public class TestHospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  FortiHospital fh=new FortiHospital();
  
  fh.medicalReasearch();
  fh.ENTServices();
  fh.emergencyService();
  fh.publishMedicalNews();
  
  
  
  UsMedical us=new FortiHospital();
  
  us.emergencyServices();
  us.pediaServices();
	}

}
