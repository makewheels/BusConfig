package bean.stationinfo.my;

import java.util.List;

/**
 * 我的站点信息
 * 
 * @author Administrator
 *
 */
public class MyStationInfo {
	private List<BusLine> busLineList;

	public List<BusLine> getBusLineList() {
		return busLineList;
	}

	public void setBusLineList(List<BusLine> busLineList) {
		this.busLineList = busLineList;
	}

	@Override
	public String toString() {
		return "MyStationInfo [busLineList=" + busLineList + "]";
	}
}
