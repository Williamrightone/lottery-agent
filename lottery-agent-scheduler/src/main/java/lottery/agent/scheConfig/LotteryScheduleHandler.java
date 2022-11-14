package lottery.agent.scheConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import lottery.agent.service.CrawlerService;

@Component
public class LotteryScheduleHandler {
	
	@Autowired
	private CrawlerService crawlerService;

	@Scheduled(cron = "5 * * * * *") 
	public void getInfo() {
		
		crawlerService.getDailyNumber();
		
	}
	
}
