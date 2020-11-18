package com.example.demo;

import com.example.demo.config.ApplicationConfig;
import com.example.demo.domain.Vendor;
import com.example.demo.domain.po.VendorRepository;
import com.example.demo.service.PayContext;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SpringFactoryMethodPatternTest {
    @Autowired
    VendorRepository vendorRepo;

    @Test
    void should_get_bean() {
         Vendor vendor = vendorRepo.getVendorById("Vendor1");
        String returnCode = vendor.registABill("no123");
        System.out.println(returnCode);
        assertEquals(returnCode,"no123");
    }
    @Test
    void should_get_select_PayMethod_when_client_selected_some_pay_method() {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        PayContext paycontext = context.getBean(PayContext.class);
        String wx = paycontext.pay("WX");
        assertEquals("微信",wx);

        String zfb = paycontext.pay("ZFB");
        assertEquals("支付宝",zfb);
    }
}
