package com.mtime.client.retail.contract.constants;


/**
 * Created by Mtime on 2016/3/11.
 */
// 发票状态
public enum InvoiceStatus {
    UnProcess(1, "未处理"),
    Done(2, "已开票"),
    Canceled(3, "已作废");

    private int value;
    private String displayName;

    private InvoiceStatus(int value, String displayName) {
        this.value = value;
        this.displayName = displayName;
    }

    public int value() {
        return value;
    }

    String displayName() {
        return displayName;
    }


    public static InvoiceStatus valueOf(int value) {
        for(InvoiceStatus v : values()){
            if(v.value == value){
                return  v;
            }
        }
        throw new RuntimeException("Undefined SaleOrderType " + value);
    }
}