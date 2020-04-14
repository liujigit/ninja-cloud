package com.ninja.cloud.zuul.entity;

/**
 * Copyright：botBrain.ai
 * Author: liuji
 * Date: 2020/4/9.
 * Description:
 */
public class AppInfo {
    private String name;
    private Integer port;
    private String swaggerVersion = "2.0";

    public AppInfo() {
    }

    public AppInfo(String name, Integer port) {
        this.name = name;
        this.port = port;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return "/" + name.toLowerCase()+"/v2/api-docs";
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getSwaggerVersion() {
        return swaggerVersion;
    }

    public void setSwaggerVersion(String swaggerVersion) {
        this.swaggerVersion = swaggerVersion;
    }
}
