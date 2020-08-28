package com.yidianyidi.hun.navigator.modle.req;

import lombok.Data;

@Data
public class ClassifyAddreq {
    public ClassifyAddreq() {
    }

    public ClassifyAddreq(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * ID
     */
    int id;
    /**
     * 分类名称
     */
    String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    @Override
    public String toString() {
        return "ClassifyAddreq{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

