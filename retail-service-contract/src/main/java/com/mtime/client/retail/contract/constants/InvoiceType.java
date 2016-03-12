package com.mtime.client.retail.contract.constants;

/**
 * Created by Mtime on 2016/3/11.
 */
public enum InvoiceType {
    NoInvoice(1, "不开发票"),
    Normal(2, "普通发票"),
    VA(3, "增值税发票");

    int value;
    String displayName;

    private InvoiceType(int value, String displayName) {
        this.value = value;
        this.displayName = displayName;
    }

    public int value() {
        return value;
    }

    String displayName() {
        return displayName;
    }


    public static InvoiceType valueOf(int value) {
        for(InvoiceType v : values()){
            if(v.value == value){
                return  v;
            }
        }
        throw new RuntimeException("Undefined SaleOrderType " + value);
    }
}