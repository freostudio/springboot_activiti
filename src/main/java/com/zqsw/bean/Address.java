package com.zqsw.bean;

/*****
 *
 * Address 
 * @author ：Liye /ZQSW
 * @date ：2019/6/17 11:52
 *  类功能描述 :
 *
 *****/
public class Address {
    private String street;
    private String postcode;

    public Address(){}

    public Address(String street, String postcode){
        this.street = street;
        this.postcode = postcode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    @Override
    public String toString() {
        return "Address {street:" + street + ", postcode:" + postcode + "}";
    }
}
