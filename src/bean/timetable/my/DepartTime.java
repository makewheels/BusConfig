package bean.timetable.my;

import java.time.LocalTime;

/**
 * 发车时间
 * 
 * @author Administrator
 *
 */
public class DepartTime {
	// 小时
	private Integer hour;
	// 分钟
	private Integer minute;
	// 时间
	private LocalTime localTime;
	// 我的格式化时间字符串，例如：4:50
	private String myTimeString;

	public Integer getHour() {
		return hour;
	}

	public void setHour(Integer hour) {
		this.hour = hour;
	}

	public Integer getMinute() {
		return minute;
	}

	public void setMinute(Integer minute) {
		this.minute = minute;
	}

	public LocalTime getLocalTime() {
		return localTime;
	}

	public void setLocalTime(LocalTime localTime) {
		this.localTime = localTime;
	}

	public String getMyTimeString() {
		return myTimeString;
	}

	public void setMyTimeString(String myTimeString) {
		this.myTimeString = myTimeString;
	}

}
