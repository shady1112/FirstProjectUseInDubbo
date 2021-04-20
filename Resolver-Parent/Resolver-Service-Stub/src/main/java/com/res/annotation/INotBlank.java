package com.res.annotation;


import org.hibernate.validator.constraints.NotBlank;
import org.springframework.core.annotation.Order;

import javax.validation.ReportAsSingleViolation;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@NotBlank
@ReportAsSingleViolation
@Order
public @interface INotBlank {
}
