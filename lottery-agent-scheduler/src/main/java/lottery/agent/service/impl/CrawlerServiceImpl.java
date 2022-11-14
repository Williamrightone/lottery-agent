package lottery.agent.service.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.stereotype.Service;

import lottery.agent.service.CrawlerService;

@Service
public class CrawlerServiceImpl implements CrawlerService {

	@Override
	public void getDailyNumber() {
		
		try {
			
			Document document = Jsoup.connect("https://www.taiwanlottery.com.tw/lotto/dailycash/history.aspx").get();
			
			String no1 = document.getElementById("D539Control_history1_dlQuery_SNo1_0").getElementsByTag("span").get(0).text();
			String no2 = document.getElementById("D539Control_history1_dlQuery_SNo1_1").getElementsByTag("span").get(0).text();
			String no3 = document.getElementById("D539Control_history1_dlQuery_SNo1_2").getElementsByTag("span").get(0).text();
			String no4 = document.getElementById("D539Control_history1_dlQuery_SNo1_3").getElementsByTag("span").get(0).text();
			String no5 = document.getElementById("D539Control_history1_dlQuery_SNo1_4").getElementsByTag("span").get(0).text();
			
			String openDate = document.getElementById("D539Control_history1_dlQuery_D539_DDate_0").getElementsByTag("span").get(0).text();
			
			List<String> noList = new ArrayList<String>();
			
			noList.add(no1);
			noList.add(no2);
			noList.add(no3);
			noList.add(no4);
			noList.add(no5);
			
			System.out.println(noList);
			System.out.println(openDate);
			
			String yearString = openDate.substring(0, 3);
			Integer year = Integer.parseInt(yearString);
			year += 1911;
			System.out.println(year);
			
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
