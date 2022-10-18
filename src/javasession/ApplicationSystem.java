package javasession;

public class ApplicationSystem {
	String name;
	int pages;
	String url;
	public ApplicationSystem(String name,int pages, String url){
		this.name=name;
		this.pages=pages;
		this.url=url;
		
	}

	public int getPageCount(String AppName){
		switch (AppName) {
		case "amzon":
			return pages;
		case "flipkart":
			return pages;
			
		case "uber":
			return pages;
			

		default:
			System.out.println("app not found");
			return -1;
			
		}
		
	}

}
