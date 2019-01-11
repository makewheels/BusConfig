package bean.stationinfo.my;

import java.util.List;

/**
 * 一条公交线路
 * 
 * @author Administrator
 *
 */
public class BusLine {
	private String startStop;
	private String endStop;
	private String startTime;
	private String endTime;
	private String distance;
	private String price;
	private List<BusStop> busStopList;

	public String getStartStop() {
		return startStop;
	}

	public void setStartStop(String startStop) {
		this.startStop = startStop;
	}

	public String getEndStop() {
		return endStop;
	}

	public void setEndStop(String endStop) {
		this.endStop = endStop;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getDistance() {
		return distance;
	}

	public void setDistance(String distance) {
		this.distance = distance;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public List<BusStop> getBusStopList() {
		return busStopList;
	}

	public void setBusStopList(List<BusStop> busStopList) {
		this.busStopList = busStopList;
	}

	@Override
	public String toString() {
		return "BusLine [startStop=" + startStop + ", endStop=" + endStop + ", startTime=" + startTime + ", endTime="
				+ endTime + ", distance=" + distance + ", price=" + price + ", busStopList=" + busStopList + "]";
	}

}
