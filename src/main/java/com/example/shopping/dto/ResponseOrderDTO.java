package com.example.shopping.dto;

public class ResponseOrderDTO {
	private float amount;
    private int invoiceNumber;
    private String date;
    private String OrderDescription;
    private int orderId;

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(int invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getOrderDescription() {
        return OrderDescription;
    }

    public void setOrderDescription(String orderDescription) {
        OrderDescription = orderDescription;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
}
