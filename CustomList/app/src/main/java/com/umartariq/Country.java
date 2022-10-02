package com.umartariq;

public class Country {
    public String countryName;
    public String english_name;
    public String iso2;
    public String iso3;
    public String name_code;
    public String phone_code;

    public Country(String countryName,String english_name,String name_code,String phone_code){
        this.countryName = countryName;
        this.english_name = english_name;
        this.name_code = name_code;
        this.phone_code = phone_code;


    }

    public String getEnglish_name() {
        return english_name;
    }

    public void setEnglish_name(String english_name) {
        this.english_name = english_name;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getIso2() {
        return iso2;
    }

    public void setIso2(String iso2) {
        this.iso2 = iso2;
    }

    public String getIso3() {
        return iso3;
    }

    public void setIso3(String iso3) {
        this.iso3 = iso3;
    }

    public String getName_code() {
        return name_code;
    }

    public void setName_code(String name_code) {
        this.name_code = name_code;
    }

    public String getPhone_code() {
        return phone_code;
    }

    public void setPhone_code(String phone_code) {
        this.phone_code = phone_code;
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryName='" + countryName + '\'' +
                ", english_name='" + english_name + '\'' +
                ", iso2='" + iso2 + '\'' +
                ", iso3='" + iso3 + '\'' +
                ", name_code='" + name_code + '\'' +
                ", phone_code='" + phone_code + '\'' +
                '}';
    }
}
