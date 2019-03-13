package io.pivotal.datatx.kafka.producer.util;

import io.pivotal.datatx.kafka.producer.model.Trade;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.UUID;


public class DataUtils {

    private static Random random = new Random();
    private static int min=10000;
    private static int max=200000;


    public static Trade createRandomTrade(){

        Trade trade=new Trade();
        trade.setId(UUID.randomUUID().toString());
        trade.setAccountId(new Long(randInt()));
        trade.setTradeId(new Long(randInt()));
        trade.setAction(randomTrade());
        trade.setAmount(new Long(100+random.nextInt(1000000)));
        trade.setTradeDate(new Date());
        trade.setCusip(randomChars(5));
        trade.setUnits(1000+random.nextInt(100000));

        System.out.println(trade);
        return trade;


    }



    private static String randomChars(int length) {
        StringBuilder rtn = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int c = random.nextInt(26) + 97;
            rtn.append((char) c);
        }
        String result = rtn.toString();
        return Character.toUpperCase(result.charAt(0)) + result.substring(1);
    }

    private static Date getRandomDate(int start, int end){
        GregorianCalendar gc = new GregorianCalendar();
        int year = randIntBetween(start, end);
        gc.set(gc.YEAR, year);
        int dayOfYear = randIntBetween(1, gc.getActualMaximum(gc.DAY_OF_YEAR));
        gc.set(gc.DAY_OF_YEAR, dayOfYear);
        return gc.getTime();
    }

    public static int randIntBetween(int start, int end) {
        return start + (int)Math.round(Math.random() * (end - start));
    }

    public static int randInt(){
        return 100000 + random.nextInt(900000);
    }

    public static String randomTrade(){
        if (random.nextInt(10)/2 == 0){
            return "BUY";
        }else
            return "SELL";
    }


}
