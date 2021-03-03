package com.crsardar.bdd.java.model;

public class Transaction {

    private String transactionId;
    private double value;
    private CURRENCY currency;
    private long date;

    public Transaction() {
    }

    public Transaction(String transactionId, double value, CURRENCY currency, long date) {
        this.transactionId = transactionId;
        this.value = value;
        this.currency = currency;
        this.date = date;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public CURRENCY getCurrency() {
        return currency;
    }

    public void setCurrency(CURRENCY currency) {
        this.currency = currency;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionId='" + transactionId + '\'' +
                ", value=" + value +
                ", currency=" + currency +
                ", date=" + date +
                '}';
    }

    public static enum CURRENCY{
        INR("INR"),
        USD("USD");
        public final String label;

        private CURRENCY(String label){

            this.label = label;
        }
    }
}
