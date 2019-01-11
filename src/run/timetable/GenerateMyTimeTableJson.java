package run.timetable;

import java.io.File;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * 生成我的时刻表的json文件
 * 
 * @author Administrator
 *
 */
public class GenerateMyTimeTableJson {

	public static void main(String[] args) {
		String folderPath = "D:\\workSpace\\sts\\BusConfig\\resources\\timetable\\official";
		File[] files = new File(folderPath).listFiles();
		File file=files[0];
		System.out.println(file.getName());
//		for (File file : files) {
			if (file.isDirectory()) {
//				continue;
			}
			Document document = null;
			try {
				document = Jsoup.parse(file, "utf-8");
				String description = document.getElementsByClass("att").get(0).text();
				Element table = document.getElementsByTag("table").get(0);
				Elements tr = table.getElementsByTag("td");
				for (Element element : tr) {
					System.out.println(element.text());
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
//		}
	}

}
