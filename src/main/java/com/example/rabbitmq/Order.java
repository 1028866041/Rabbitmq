package com.example.rabbitmq;

/**
 * Created by Administrator on 2018/9/13 0013.
 */
public class Order {

    private String id;
    private String name;
    private String messageId;

    public Order() {
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMessageId() {
        return messageId;
    }

}
