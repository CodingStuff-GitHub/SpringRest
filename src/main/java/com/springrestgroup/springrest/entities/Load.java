package com.springrestgroup.springrest.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Load {
    @Id
    private int id;
    private String loadingPoint;
    private String productType;
    private int noOfTrucks;
    private String shipperId;
    private String truckType;
    private String unloadingPoint;
    private int weight;
    private String date;

    @Override
    public String toString() {
        return "Load{" +
                "id=" + id +
                ", loadingPoint='" + loadingPoint + '\'' +
                ", productType='" + productType + '\'' +
                ", noOfTrucks=" + noOfTrucks +
                ", shipperId='" + shipperId + '\'' +
                ", truckType='" + truckType + '\'' +
                ", unloadingPoint='" + unloadingPoint + '\'' +
                ", Weight=" + weight +
                ", Date=" + date +
                '}';
    }

    public Load() {
        super();
    }

    public Load(int id, String loadingPoint, String productType, int noOfTrucks, String shipperId, String truckType, String unloadingPoint, int weight, String date) {
        this.id = id;
        this.loadingPoint = loadingPoint;
        this.productType = productType;
        this.noOfTrucks = noOfTrucks;
        this.shipperId = shipperId;
        this.truckType = truckType;
        this.unloadingPoint = unloadingPoint;
        this.weight = weight;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLoadingPoint() {
        return loadingPoint;
    }

    public void setLoadingPoint(String loadingPoint) {
        this.loadingPoint = loadingPoint;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public int getNoOfTrucks() {
        return noOfTrucks;
    }

    public void setNoOfTrucks(int noOfTrucks) {
        this.noOfTrucks = noOfTrucks;
    }

    public String getShipperId() {
        return shipperId;
    }

    public void setShipperId(String shipperId) {
        this.shipperId = shipperId;
    }

    public String getTruckType() {
        return truckType;
    }

    public void setTruckType(String truckType) {
        this.truckType = truckType;
    }

    public String getUnloadingPoint() {
        return unloadingPoint;
    }

    public void setUnloadingPoint(String unloadingPoint) {
        this.unloadingPoint = unloadingPoint;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getDate() {
        return this.date;
    }

    public String setDate(String date) {
        return this.date = date;
    }
}
