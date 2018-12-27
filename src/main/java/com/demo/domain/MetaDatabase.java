package com.demo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 数据库元数据
 */
@Entity
@Table
public class MetaDatabase {

    /**
     * 数据库ID
     */
    @Id
    @GeneratedValue
    private Integer id;

    /**
     * 数据库名称
     */
    private String name;

    /**
     * 数据库存放文件系统地址
     */
    private String location;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }
}
