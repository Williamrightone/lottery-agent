package ltagent.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduleHandler {
	
	@Value("${daily.target.time: }")
	private String dailyTriggerTime;
	
	@Autowired
	private LotteryAgentScheduleService lotteryAgentScheduleService;

	@Scheduled(cron = "0 0 12 ? * MON-SAT") 
	public void getDailyNumber() {
		
		lotteryAgentScheduleService.getDailyTargetNumber();
		
	}
	
	
}
