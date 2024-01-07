package com.zzz.pms.application.common;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class FeignInterceptor implements RequestInterceptor {
    @Override
    public void apply(RequestTemplate requestTemplate) {
        String traceId = MDC.get("traceId");
        log.info("-----openfeign interceptor-----traceId--------{}---------", traceId);
        requestTemplate.header("x-traceId", traceId);
    }
}
