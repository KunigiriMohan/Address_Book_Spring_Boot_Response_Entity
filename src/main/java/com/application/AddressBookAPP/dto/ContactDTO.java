package com.application.AddressBookAPP.dto;

public class ContactDTO {

    private String name;
    private String address;
    private String city;
    private String state;
    private String pinCode;
    private String mobileNo;
    private String email;
    
    /**
     * Defining Constructer
     * @param name
     * @param address
     * @param city
     * @param state
     * @param pinCode
     * @param mobileNo
     * @param email
     */
    public ContactDTO( String name, String address, String city, String state, String pinCode, String mobileNo,
            String email) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.pinCode = pinCode;
        this.mobileNo = mobileNo;
        this.email = email;
    }


    /**
     * Getters and Setters
     */
    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getAddress() {
        return address;
    }


    public void setAddress(String address) {
        this.address = address;
    }


    public String getCity() {
        return city;
    }


    public void setCity(String city) {
        this.city = city;
    }


    public String getState() {
        return state;
    }


    public void setState(String state) {
        this.state = state;
    }


    public String getPinCode() {
        return pinCode;
    }


    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }


    public String getMobileNo() {
        return mobileNo;
    }


    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }
}
