package com.mtime.client.retail.contract.constants;


/**
 * Created by Mtime on 2016/3/11.
 */
public enum InvoiceMode {
    Paper(1, "纸质发票"),
    Electronic(2, "电子发票");

    private int value;
    private String displayName;

    private InvoiceMode(int value, String displayName) {
        this.value = value;
        this.displayName = displayName;
    }

    public int value() {
        return value;
    }

    String displayName() {
        return displayName;
    }


    public static InvoiceMode valueOf(int value) {
        for(InvoiceMode v : values()){
            if(v.value == value){
                return  v;
            }
        }
        throw new RuntimeException("Undefined SaleOrderType " + value);
    }
}
