/**
  * Copyright 2019 bejson.com 
  */
package bean.stationinfo.amap;

import java.util.List;

/**
 * Auto-generated: 2019-01-10 0:13:14
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Suggestion {

	private List<String> keywords;
	private List<String> cities;

	public void setKeywords(List<String> keywords) {
		this.keywords = keywords;
	}

	public List<String> getKeywords() {
		return keywords;
	}

	public void setCities(List<String> cities) {
		this.cities = cities;
	}

	public List<String> getCities() {
		return cities;
	}

	@Override
	public String toString() {
		return "Suggestion [keywords=" + keywords + ", cities=" + cities + "]";
	}

}