package io.pivotal.datatx.kafka.producer.model;

import java.util.Date;

public class Trade {

    private String id;
    private Long accountId;
    private Long tradeId;
    private String cusip;
    private int units;
    private Date tradeDate;
    private String action;
    private Long amount;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Long getTradeId() {
        return tradeId;
    }

    public void setTradeId(Long tradeId) {
        this.tradeId = tradeId;
    }

    public String getCusip() {
        return cusip;
    }

    public void setCusip(String cusip) {
        this.cusip = cusip;
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    public Date getTradeDate() {
        return tradeDate;
    }

    public void setTradeDate(Date tradeDate) {
        this.tradeDate = tradeDate;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Trade{" +
                "id='" + id + '\'' +
                ", accountId=" + accountId +
                ", tradeId=" + tradeId +
                ", cusip='" + cusip + '\'' +
                ", units=" + units +
                ", tradeDate=" + tradeDate +
                ", action='" + action + '\'' +
                ", amount=" + amount +
                '}';
    }
}


