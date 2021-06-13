package com.example.recyclerview_191190;

public class CountryData {
    int code;
    String name,language;

    public CountryData(int code, String name, String language) {
        this.code = code;
        this.name = name;
        this.language = language;
    }

    public CountryData() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
