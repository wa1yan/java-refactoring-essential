package dev.waiyanhtet.refactor_multiple_if_else.service.impl;

import dev.waiyanhtet.refactor_multiple_if_else.service.EnquiryHandlerService;
import org.springframework.stereotype.Service;

@Service("canalPlusService")
public class CanalPlusService implements EnquiryHandlerService {

    @Override
    public String paymentEnquiry() {
        return "Canal+ service return";
    }
}
