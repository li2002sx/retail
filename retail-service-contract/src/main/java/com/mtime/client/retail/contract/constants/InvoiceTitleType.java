package com.mtime.client.retail.contract.constants;

/**
 * Created by Mtime on 2016/3/11.
 */
/// <summary>
/// 开票方式
/// </summary>

public enum InvoiceTitleType {

    NoInvoice(0, "不开发票"),
    Personal(1, "个人"),
    Bussiness(2, "单位");

    int value;
    String displayName;

    private InvoiceTitleType(int value, String displayName) {
        this.value = value;
        this.displayName = displayName;
    }

    public int value() {
        return value;
    }

    String displayName() {
        return displayName;
    }


    public static InvoiceTitleType valueOf(int value) {
        for(InvoiceTitleType v : values()){
            if(v.value == value){
                return  v;
            }
        }
        throw new RuntimeException("Undefined SaleOrderType " + value);
    }
}
