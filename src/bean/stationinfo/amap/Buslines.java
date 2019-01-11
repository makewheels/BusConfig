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
public class Buslines {

	private String id;
	private String type;
	private String name;
	private String polyline;
	private String citycode;
	private String start_stop;
	private String end_stop;
	private String start_time;
	private String end_time;
	private List<String> company;
	private String distance;
	private String basic_price;
	private String total_price;
	private String bounds;
	private List<Busstops> busstops;

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setPolyline(String polyline) {
		this.polyline = polyline;
	}

	public String getPolyline() {
		return polyline;
	}

	public void setCitycode(String citycode) {
		this.citycode = citycode;
	}

	public String getCitycode() {
		return citycode;
	}

	public void setStart_stop(String start_stop) {
		this.start_stop = start_stop;
	}

	public String getStart_stop() {
		return start_stop;
	}

	public void setEnd_stop(String end_stop) {
		this.end_stop = end_stop;
	}

	public String getEnd_stop() {
		return end_stop;
	}

	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}

	public String getStart_time() {
		return start_time;
	}

	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}

	public String getEnd_time() {
		return end_time;
	}

	public void setCompany(List<String> company) {
		this.company = company;
	}

	public List<String> getCompany() {
		return company;
	}

	public void setDistance(String distance) {
		this.distance = distance;
	}

	public String getDistance() {
		return distance;
	}

	public void setBasic_price(String basic_price) {
		this.basic_price = basic_price;
	}

	public String getBasic_price() {
		return basic_price;
	}

	public void setTotal_price(String total_price) {
		this.total_price = total_price;
	}

	public String getTotal_price() {
		return total_price;
	}

	public void setBounds(String bounds) {
		this.bounds = bounds;
	}

	public String getBounds() {
		return bounds;
	}

	public void setBusstops(List<Busstops> busstops) {
		this.busstops = busstops;
	}

	public List<Busstops> getBusstops() {
		return busstops;
	}

	@Override
	public String toString() {
		return "Buslines [id=" + id + ", type=" + type + ", name=" + name + ", polyline=" + polyline + ", citycode="
				+ citycode + ", start_stop=" + start_stop + ", end_stop=" + end_stop + ", start_time=" + start_time
				+ ", end_time=" + end_time + ", company=" + company + ", distance=" + distance + ", basic_price="
				+ basic_price + ", total_price=" + total_price + ", bounds=" + bounds + ", busstops=" + busstops + "]";
	}

}