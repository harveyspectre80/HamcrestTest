package com;

public class Todo {

    public final int id;
    public final String summary;
    public final String desc;

    public Todo(int id, String summary, String desc) {

        this.id = id;
        this.summary = summary;
        this.desc = desc;
    }

    public int getId() {
        return id;
    }
    public String getSummary() {
        return summary;
    }
    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", summary='" + summary + '\'' +
                ", desc='" + desc + '\'' +
                '}';

    }
}
