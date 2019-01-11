package bean.stationinfo.my;

/**
 * 一个站点
 * 
 * @author Administrator
 *
 */
public class BusStop {
	private String name;
	private String location;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "BusStop [name=" + name + ", location=" + location + "]";
	}

}
