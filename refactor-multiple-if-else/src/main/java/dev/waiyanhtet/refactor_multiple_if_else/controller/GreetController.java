package dev.waiyanhtet.refactor_multiple_if_else.controller;

import dev.waiyanhtet.refactor_multiple_if_else.service.BillerService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class GreetController {

    private final BillerService billerService;

    @GetMapping("/enquiry")
    public String paymentEnquiry(HttpServletRequest request) {
        var path = request.getHeader("path-info");
        return billerService.paymentEnquiryByServicePath(path);
    }
}
