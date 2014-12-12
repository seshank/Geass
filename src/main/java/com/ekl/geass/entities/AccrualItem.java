package com.ekl.geass.entities;

/**
 * Created by seshank.koganti on 13/12/14.
 */

public class AccrualItem {

    private String item_sub_type;

    private String reference_id;

    private double total_amount;

    private double unit_price;

    private int quantity;

    private String item_type;

    private String tax_rate;

    private String tax_auth_party_id;

    private String tax_auth_geo_id;

    public AccrualItem(String item_sub_type, String reference_id, double total_amount, double unit_price, int quantity) {
        this.item_sub_type = item_sub_type;
        this.reference_id = reference_id;
        this.total_amount = total_amount;
        this.unit_price = unit_price;
        this.quantity = quantity;
        this.tax_auth_party_id = new String("NA");
        this.tax_auth_geo_id = new String("NA");
    }

    public String getItem_sub_type() {
        return item_sub_type;
    }

    public void setItem_sub_type(String item_sub_type) {
        this.item_sub_type = item_sub_type;
    }

    public String getReference_id() {
        return reference_id;
    }

    public void setReference_id(String reference_id) {
        this.reference_id = reference_id;
    }

    public double getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(double total_amount) {
        this.total_amount = total_amount;
    }

    public double getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(double unit_price) {
        this.unit_price = unit_price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getItem_type() {
        return item_type;
    }

    public void setItem_type(String item_type) {
        this.item_type = item_type;
    }

    public String getTax_rate() {
        return tax_rate;
    }

    public void setTax_rate(String tax_rate) {
        this.tax_rate = tax_rate;
    }

    public String getTax_auth_party_id() {
        return tax_auth_party_id;
    }

    public void setTax_auth_party_id(String tax_auth_party_id) {
        this.tax_auth_party_id = tax_auth_party_id;
    }

    public String getTax_auth_geo_id() {
        return tax_auth_geo_id;
    }

    public void setTax_auth_geo_id(String tax_auth_geo_id) {
        this.tax_auth_geo_id = tax_auth_geo_id;
    }
}
