package run.stationinfo;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;

import bean.stationinfo.amap.AmapStationInfo;
import bean.stationinfo.amap.Buslines;
import bean.stationinfo.amap.Busstops;
import bean.stationinfo.my.BusLine;
import bean.stationinfo.my.BusStop;
import bean.stationinfo.my.MyStationInfo;
import util.FileUtil;

/**
 * 生成我的站点信息的json文件
 * 
 * @author Administrator
 *
 */
public class GenerateMyStationInfoJson {

	public static void main(String[] args) {
		File[] files = new File("D:\\workSpace\\sts\\BusConfig\\resources\\stationinfo\\amap").listFiles();
		// 遍历所有高德json文件
		for (File file : files) {
			if (file.isDirectory()) {
				continue;
			}
			String filename = file.getName();
			String busName = filename.substring(0, filename.lastIndexOf("."));
			AmapStationInfo amapStationInfo = JSON.parseObject(FileUtil.readTextFile(file.getPath()),
					AmapStationInfo.class);
			if (amapStationInfo.getCount().equals("2") == false) {
				System.out.println(amapStationInfo.getCount() + "  " + amapStationInfo.getBuslines().get(0).getName());
			}
			List<Buslines> amapBuslines = amapStationInfo.getBuslines();
			MyStationInfo myStationInfo = new MyStationInfo();
			List<BusLine> myBusLineList = new ArrayList<>();
			// 遍历高德所有线路
			for (Buslines amapBusline : amapBuslines) {
				// 组装站点
				List<BusStop> myBusStopList = new ArrayList<>();
				List<Busstops> amapBusstops = amapBusline.getBusstops();
				for (Busstops amapBusstop : amapBusstops) {
					BusStop myBusStop = new BusStop();
					myBusStop.setName(amapBusstop.getName());
					myBusStop.setLocation(amapBusstop.getLocation());
					myBusStopList.add(myBusStop);
				}
				BusLine myBusLine = new BusLine();
				myBusLine.setBusStopList(myBusStopList);
				// 组装一条线路
				myBusLine.setStartStop(amapBusline.getStart_stop());
				myBusLine.setEndStop(amapBusline.getEnd_stop());
				myBusLine.setStartTime(amapBusline.getStart_time());
				myBusLine.setEndTime(amapBusline.getEnd_time());
				myBusLine.setDistance(amapBusline.getDistance());
				myBusLine.setPrice(amapBusline.getTotal_price());
				// 添加这条线路
				myBusLineList.add(myBusLine);
			}
			myStationInfo.setBusLineList(myBusLineList);
			// 保存json文件
			String jsonString = JSON.toJSONString(myStationInfo);
			String folerPath = "D:\\workSpace\\sts\\BusConfig\\resources\\stationinfo\\my";
			FileUtil.saveToFile(folerPath, busName + ".json", jsonString);
		}
	}

}
