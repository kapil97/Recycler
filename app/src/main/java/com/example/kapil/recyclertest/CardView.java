package com.example.kapil.recyclertest;

/**
 * Created by Kapil on 30-06-2017.
 */

public class CardView {
    private String head;
    private String desc;

    public CardView(String head, String desc) {
        this.head = head;
        this.desc = desc;
    }

    public String getHead() {
        return head;
    }

    public String getDesc() {
        return desc;
    }
    
    public void setHead(String head)
    {
        this.head = head;
    }
    
    public void setDesc(String desc)
    {
        this.desc = desc;
    }
}
