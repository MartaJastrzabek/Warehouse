package com.homework.warehouse;

public class Device {
    private String code;
    private String producer;
    private String type;
    private double price;

    public Device() {
    }

    public Device(String code, String producer, String type, double price) {
        this.code = code;
        this.producer = producer;
        this.type = type;
        this.price = price;
    }

    public Device(String code, String producer, String type) {
        this.code = code;
        this.producer = producer;
        this.type = type;
    }

    public String getInfo(){
        return "kod: " + code + ", producent: " + ", typ: " + type + ", cena: " + price;
    }
}
