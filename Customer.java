package org.example;

public class customer extends customer {
    private int id;
    private String customerNumber;
    private String phone;



    public String getCustomerNumber() {
        return customerNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;


    }
}
