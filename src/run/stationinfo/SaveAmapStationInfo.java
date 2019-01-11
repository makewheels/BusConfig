package run.stationinfo;

import com.alibaba.fastjson.JSON;

import bean.stationinfo.amap.AmapStationInfo;
import util.FileUtil;
import util.WebUtil;

/**
 * 保存高德地图的公交站点信息
 * 
 * @author Administrator
 *
 */
public class SaveAmapStationInfo {

	public static void main(String[] args) throws Exception {
		// 存放路径
		String folderPath = "D:\\workSpace\\sts\\BusConfig\\resources\\stationinfo\\amap";
		// 站名
		String busName = "50";
		String stationListUrl = "http://restapi.amap.com/v3/bus/linename?s=rsv3&key=3be642e30fc349691f5fb9de0a4785a0"
				+ "&extensions=all&city=%E5%A4%A7%E5%BA%86&keywords=";
		// 保存高德站点信息json
		for (int i = 1; i <= 1000; i++) {
			busName = i + "";
			String stationInfoJson = WebUtil.sendGet(stationListUrl + busName);
			AmapStationInfo stationInfo = JSON.parseObject(stationInfoJson, AmapStationInfo.class);
			// 如果查到了信息
			if (stationInfo.getCount().equals("0") == false) {
				// 保存json
				FileUtil.saveToFile(folderPath, busName + ".json", stationInfoJson);
				System.out.println(busName + " -> success");
			} else {
				// 打印公交名
				System.out.println(busName + " -> fail");
			}
			Thread.sleep(1);
		}
	}

}
