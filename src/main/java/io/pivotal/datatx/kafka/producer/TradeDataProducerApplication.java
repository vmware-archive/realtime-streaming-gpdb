package io.pivotal.datatx.kafka.producer;

import io.pivotal.datatx.kafka.producer.service.ITradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TradeDataProducerApplication implements  CommandLineRunner {

	@Autowired
	ITradeService tradeService;

	public static void main(String[] args) {
		SpringApplication.run(TradeDataProducerApplication.class, args);
	}


	@Override
	public void run(String... strings) throws Exception {
		long sTime=System.currentTimeMillis();
		long eTime=sTime;
		while (true && ((eTime-sTime) < 1000*60*2 )) {
			tradeService.produceTrade();
			Thread.sleep(10);
			eTime=System.currentTimeMillis();
		}
	}


}
