package com.example.demo.service;

public interface IPayStr {
     String pay();
     PayType defindeType();
     enum PayType{
          ZFB("zfb","支付宝"),  WX("wx","微信");
          private String type, desc;
          PayType(String type, String desc) {
               this.type = type;
               this.desc = desc;
          }
          public String getDesc() {
               return desc;
          }
     }
}
