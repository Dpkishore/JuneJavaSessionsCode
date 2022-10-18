package oops_encapsulation;

public class Browser {
	public void launchBrowser(){
		System.out.println("launch Browser");
		checkBrowserVersion();
		checkOSComtible();
		enoughRamSpace();
		checkbrowserUpgrade();
			
		}
		
		private void checkBrowserVersion(){
			
			System.out.println("checkBrowserVersion");
			
		}
		
		private void checkOSComtible() {
			System.out.println("checkOSComtible");
		}
		
		private void enoughRamSpace(){
			System.out.println("Enough Ram space....");
		}
		
		private void checkbrowserUpgrade() {
			System.out.println("checkbrowserUpgrade");
		}
	}


