package com.hong.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by hong2 on 11/11/2018
 * Time : 11:45 PM
 */

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.hong.controller"))
                .build()
                .apiInfo(apiInfo())
                .useDefaultResponseMessages(true);
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Rest API")
                .description("Swagger Test")
                .version("1.0.0")
                .licenseUrl("http://ycdl-mobile-api.com")
                .build();
    }
}
