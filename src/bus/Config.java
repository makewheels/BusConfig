package bus;

public class Config {

	// 站名和坐标
	String stationListUrl = "http://restapi.amap.com/v3/bus/linename?s=rsv3&key=3be642e30fc349691f5fb9de0a4785a0&extensions=all&city=%E5%A4%A7%E5%BA%86&keywords=50";
	// 所有车辆列表
	String allBusListUrl = "http://busmishu.com:8080/BusComeServer/pages/index/IndexAction.do?action=mapxxx&bus_direction=1&bus_name=50";
	// 距离指定位置之前最近的三辆车
	String threeBusesUrl = "http://busmishu.com:8082/DqBusComeServer/pages//index/IndexAction.do?action=dqdoprocess&bus_direction=1&bus_name=6&sta_id_select=19";

}
