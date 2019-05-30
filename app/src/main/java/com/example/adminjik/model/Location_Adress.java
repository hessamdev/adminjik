package com.example.adminjik.model;

public class Location_Adress {

    String id, mainid, ostan, shahr, mahale;

    public Location_Adress(String id, String mainid, String ostan, String shahr, String mahale) {
        this.id = id;
        this.mainid = mainid;
        this.ostan = ostan;
        this.shahr = shahr;
        this.mahale = mahale;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMainid() {
        return mainid;
    }

    public void setMainid(String mainid) {
        this.mainid = mainid;
    }

    public String getOstan() {
        return ostan;
    }

    public void setOstan(String ostan) {
        this.ostan = ostan;
    }

    public String getShahr() {
        return shahr;
    }

    public void setShahr(String shahr) {
        this.shahr = shahr;
    }

    public String getMahale() {
        return mahale;
    }

    public void setMahale(String mahale) {
        this.mahale = mahale;
    }
}
