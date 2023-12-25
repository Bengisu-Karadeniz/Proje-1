package org.example;

public class Main2 {
    public static void main(String[] args) {

        String mesaj = "Kahve makinası";
        Product product1 = new Product();
        product1.setName("Delonghi Kahve Makinası");
        product1.setUnitPrice(7500);
        product1.setDiscount(7);
        product1.setUnitsInStock(3);
        product1.setImageUrl("image1.jp");

        Product product2 = new Product();
        product2.setName("Smeg Kahve Makinası");
        product2.setUnitPrice(7500);
        product2.setDiscount(7);
        product2.setUnitsInStock(3);
        product2.setImageUrl("image2.jp");

        Product product3 = new Product();
        product3.setName("Delonghi Kahve Makinası");
        product3.setUnitPrice(7500);
        product3.setDiscount(7);
        product3.setUnitsInStock(3);
        product3.setImageUrl("image3.jp");

        Product[] products = {product1, product2, product3};

        System.out.println("<ul>");

        for (Product product : products) {

            System.out.println("<li>" + product.getName() + "</li>");

            System.out.println("</ul>");

            IndividualCustomer individualCustomer = new IndividualCustomer();
            individualCustomer.setId(1);
            individualCustomer.setPhone(05222222222);
            individualCustomer.setCustomerNumber(12345);
            individualCustomer.setFirstName("Engin");
            individualCustomer.setLastName("Demiroğ");

            CorporateCustomer corporateCustomer = new CorporateCustomer();
            corporateCustomer.setId(2);
            corporateCustomer.setCompanyName("Kodlama.io");
            corporateCustomer.setPhone(05333333333);
            corporateCustomer.setTaxNumber(11111111111);
            corporateCustomer.setCustomerNumber(54321);

            Customer[] customers = {individualCustomer, corporationCustomer}








        }

    }
  }