package dev.waiyanhtet.refactor_multiple_if_else.service.impl;

import dev.waiyanhtet.refactor_multiple_if_else.service.BillerService;
import dev.waiyanhtet.refactor_multiple_if_else.service.ServiceFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BillerServiceImpl implements BillerService {

    private final ServiceFactory serviceFactory;

    @Override
    public String paymentEnquiryByServicePath(String path) {
        var service = serviceFactory.getServiceByPath(path);
        return service.paymentEnquiry();
    }
}
