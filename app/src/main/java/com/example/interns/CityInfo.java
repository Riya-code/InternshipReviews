package com.example.interns;

public class CityInfo {
    private String studinfo;
    private String det;

    public CityInfo(String studinfo,String det ) {
        this.studinfo = studinfo;
        this.det = det;
    }

    public String getStudinfo() {
        return studinfo;
    }

    public void setStudinfo(String studinfo) {
        this.studinfo = studinfo;
    }

    public String getDet() {
        return det;
    }

    public void setDet(String det) {
        this.det = det;
    }
}

