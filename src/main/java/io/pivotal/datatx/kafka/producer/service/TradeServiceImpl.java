package io.pivotal.datatx.kafka.producer.service;

import io.pivotal.datatx.kafka.producer.model.Trade;
import io.pivotal.datatx.kafka.producer.model.User;
import io.pivotal.datatx.kafka.producer.util.DataUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class TradeServiceImpl implements ITradeService {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    private static final String TOPIC = "tradetopic";

    public  void produceTrade() {

        kafkaTemplate.send(TOPIC, convertToString(DataUtils.createRandomTrade()));
    }

    private String convertToString(User user){

        StringBuilder  sb=new StringBuilder();
        sb.append(user.getName()).append(",").append(user.getDept()).append(",").append(user.getSalary());

        return sb.toString();

    }

    private String convertToString(Trade trade){

        StringBuilder  sb=new StringBuilder();
        sb.append(trade.getId()).append(",").append(trade.getAccountId()).append(",").append(trade.getTradeId())
                .append(",").append(trade.getCusip()).append(",").append(trade.getUnits()).append(",")
                .append(trade.getTradeDate()).append(",").append(trade.getAction()).append(",")
                .append(trade.getAmount());

        return sb.toString();

    }



}
