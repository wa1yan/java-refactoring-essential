package dev.waiyanhtet.refactor_multiple_if_else.service;

import dev.waiyanhtet.refactor_multiple_if_else.config.BillerServicePathConfiguration;
import dev.waiyanhtet.refactor_multiple_if_else.service.impl.AtomService;
import dev.waiyanhtet.refactor_multiple_if_else.service.impl.CanalPlusService;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@RequiredArgsConstructor
public class ServiceFactory {

    private final AtomService atomService;
    private final CanalPlusService canalPlusService;
    private final BillerServicePathConfiguration servicePathConfiguration;

    private Map<String, EnquiryHandlerService> serviceMap = new HashMap<>();


    @PostConstruct
    public void registerServiceByPath() {
        this.serviceMap.put(this.servicePathConfiguration.getAtomPath(), atomService);
        this.serviceMap.put(this.servicePathConfiguration.getCanalPlusPath(), canalPlusService);
    }

    public EnquiryHandlerService getServiceByPath(String path) {
        return serviceMap.getOrDefault(path, () ->"No handler for this path");
    }
}
