package run.timetable;

import java.io.File;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.alibaba.fastjson.JSON;

import bean.timetable.my.DepartTime;
import bean.timetable.my.TimeTable;
import util.FileUtil;

/**
 * 生成我的时刻表的json文件
 * 
 * @author Administrator
 *
 */
public class GenerateMyTimeTableJson {

	public static void main(String[] args) {
		// 时刻表源html文件
		String sourcePath = "D:\\workSpace\\sts\\BusConfig\\resources\\timetable\\official";
		// 解析后的保存json
		String targetPath = "D:\\workSpace\\sts\\BusConfig\\resources\\timetable\\my";
		File[] files = new File(sourcePath).listFiles();
		for (File file : files) {
			if (file.isDirectory()) {
				// continue;
			}
			Document document = null;
			// 解析html文件
			try {
				document = Jsoup.parse(file, "utf-8");
				// 标题
				String originalTopic = document.getElementsByClass("topic").get(0).text();
				// 描述
				String originalDescription = document.getElementsByClass("att").get(0).text();
				// 表格
				Element table = document.getElementsByTag("table").get(0);
				// 所有时间表格节点
				Elements tds = table.getElementsByTag("td");
				// localTime结合
				List<LocalTime> localTimeList = new ArrayList<>();
				for (Element td : tds) {
					// 每一个原始时间字符串：4时50分
					String originalTimeString = td.text().trim();
					if (originalTimeString.equals("")) {
						continue;
					}
					// 替换为：4:50
					originalTimeString = originalTimeString.replace("时", ":");
					originalTimeString = originalTimeString.replace("分", "");
					// 分割字符串，拿到小时和分钟
					String[] arr = originalTimeString.split(":");
					int hour = Integer.parseInt(arr[0]);
					int minute = Integer.parseInt(arr[1]);
					LocalTime localTime = LocalTime.of(hour, minute);
					localTimeList.add(localTime);
				}
				// 对时间排序
				Collections.sort(localTimeList);
				TimeTable timeTable = new TimeTable();
				String filename = file.getName();
				String busName = "";
				// 是不是以f开头，表示反向的
				String f = "";
				if (filename.startsWith("f")) {
					timeTable.setDirection("1");
					busName = filename.substring(1, filename.lastIndexOf("."));
					f = "f";
				} else {
					timeTable.setDirection("0");
					busName = filename.substring(0, filename.lastIndexOf("."));
				}
				timeTable.setBusName(busName);
				timeTable.setOriginalTopic(originalTopic);
				timeTable.setOriginalDescription(originalDescription);
				// 响应给客户端的时间集合，例如：04:50
				List<String> stringList = new ArrayList<>();
				List<DepartTime> departTimeList = new ArrayList<>();
				for (LocalTime localTime : localTimeList) {
					stringList.add(localTime.toString());
					DepartTime departTime = new DepartTime();
					int hour = localTime.getHour();
					int minute = localTime.getMinute();
					departTime.setHour(hour);
					departTime.setMinute(minute);
					departTime.setLocalTime(localTime);
					String myTimeString = "";
					// 分钟补零
					if (minute <= 9) {
						myTimeString = hour + ":" + minute + "0";
					} else {
						myTimeString = hour + ":" + minute + "";
					}
					departTime.setMyTimeString(myTimeString);
					departTimeList.add(departTime);
				}
				timeTable.setStringList(stringList);
				timeTable.setDepartTimeList(departTimeList);
				String jsonString = JSON.toJSONString(timeTable);
				FileUtil.saveToFile(targetPath, f + busName + ".json", jsonString);
			} catch (Exception e) {
				System.out.println(file.getName());
				e.printStackTrace();
			}
		}
	}

}
