package com.young.config;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger2API 文档配置
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {
    @Bean
    public Docket creatRestapi(){
        //链式
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                //为当前包下的controller生成API文档
                .apis(RequestHandlerSelectors.basePackage("com.young.controller"))
                //为指定注解的类生成API文档 @Api的controller
                //.apis(RequestHandlerSelectors.withClassAnnotation(Api.class));
                //为指定注解的方法生成API文档
                //.apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Swagger2UI文档演示")
                .description("mall")
                .contact("young")
                .version("1.0")
                .build();
    }

}
