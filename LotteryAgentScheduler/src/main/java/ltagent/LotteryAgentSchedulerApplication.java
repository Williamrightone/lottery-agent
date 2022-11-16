package ltagent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class LotteryAgentSchedulerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LotteryAgentSchedulerApplication.class, args);
	}

}
