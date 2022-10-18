package constructor_assignment;

public class Browser {

	private String name;
	private Double version;
	String plugin[];
	
	public Browser(String Name,Double Version,String []Plugin){
		this.name=Name;
		this.version=Version;
		this.plugin=Plugin;
		
		
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getVersion() {
		return version;
	}

	public void setVersion(Double version) {
		this.version = version;
	}

	public String[] getPlugin() {
		return plugin;
	}

	public void setPlugin(String[] plugin) {
		this.plugin = plugin;
	}

}
