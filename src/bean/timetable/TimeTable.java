package bean.timetable;

import java.util.List;

/**
 * 我的，发车时刻表
 * 
 * @author Administrator
 *
 */
public class TimeTable {
	// 公交名
	private String busName;
	// 方向
	private String direction;
	// 原始描述
	private String originalDescription;
	// 分区点
	private String partition;
	// 全程距离
	private String distance;
	// 单程运行时间
	private String timeCost;
	// 平均间隔
	private String averageInterval;
	// 发车时间字符串列表，格式：4:50
	private List<String> stringList;
	// 发车时间列表
	private List<DepartTime> departTimeList;

	public String getBusName() {
		return busName;
	}

	public void setBusName(String busName) {
		this.busName = busName;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public String getOriginalDescription() {
		return originalDescription;
	}

	public void setOriginalDescription(String originalDescription) {
		this.originalDescription = originalDescription;
	}

	public String getPartition() {
		return partition;
	}

	public void setPartition(String partition) {
		this.partition = partition;
	}

	public String getDistance() {
		return distance;
	}

	public void setDistance(String distance) {
		this.distance = distance;
	}

	public String getTimeCost() {
		return timeCost;
	}

	public void setTimeCost(String timeCost) {
		this.timeCost = timeCost;
	}

	public String getAverageInterval() {
		return averageInterval;
	}

	public void setAverageInterval(String averageInterval) {
		this.averageInterval = averageInterval;
	}

	public List<String> getStringList() {
		return stringList;
	}

	public void setStringList(List<String> stringList) {
		this.stringList = stringList;
	}

	public List<DepartTime> getDepartTimeList() {
		return departTimeList;
	}

	public void setDepartTimeList(List<DepartTime> departTimeList) {
		this.departTimeList = departTimeList;
	}

	@Override
	public String toString() {
		return "TimeTable [busName=" + busName + ", direction=" + direction + ", originalDescription="
				+ originalDescription + ", partition=" + partition + ", distance=" + distance + ", timeCost=" + timeCost
				+ ", averageInterval=" + averageInterval + ", stringList=" + stringList + ", departTimeList="
				+ departTimeList + "]";
	}
}
