package com.ncc.messenger.models;

public class CountryCallingCode {
    private String code;
    private String dial_code;
    private String name;
    private String local;

    public CountryCallingCode(String code, String dial_code, String name, String local) {
        this.code = code;
        this.dial_code = dial_code;
        this.name = name;
        this.local = local;
    }

    public String getCode() {
        return code;
    }

    public String getDial_code() {
        return dial_code;
    }

    public String getName() {
        return name;
    }

    public String getLocal() {
        return local;
    }
}
