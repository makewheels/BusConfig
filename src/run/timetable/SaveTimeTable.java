package run.timetable;

import java.io.IOException;

import util.FileUtil;
import util.WebUtil;

/**
 * 保存发车时刻表的html页面
 * 
 * @author Administrator
 *
 */
public class SaveTimeTable {
	public static String officalTimeTableFolderPath = "D:\\workSpace\\sts\\BusConfig\\resources\\timetable\\official";

	public static void main(String[] args) {
		String[] busNameArr = FileUtil.readTextFile(SaveTimeTable.class.getResource("/busNameList-amap.txt").getPath())
				.split("\n");
		String baseUrl = "http://gongjiaomishu.com/web/city/daqing/time/";
		for (String busName : busNameArr) {
			String url = baseUrl + busName + ".html";
			String direction0;
			try {
				direction0 = WebUtil.sendGetThrowException(url);
			} catch (IOException e) {
				System.out.println("不存在的车：" + busName);
				continue;
			}
			FileUtil.saveToFile(officalTimeTableFolderPath, busName + ".html", direction0);
			String direction1 = null;
			try {
				direction1 = WebUtil.sendGetThrowException(url);
			} catch (IOException e) {
				System.out.println("error on 反向！！！");
				e.printStackTrace();
			}
			FileUtil.saveToFile(officalTimeTableFolderPath, "f" + busName + ".html", direction1);
		}
	}

}
