// package com.res.aspect;
//
//
// import org.aspectj.lang.ProceedingJoinPoint;
// import org.aspectj.lang.annotation.Around;
// import org.aspectj.lang.annotation.Aspect;
// import org.hibernate.validator.HibernateValidator;
// import org.springframework.stereotype.Component;
// import org.springframework.validation.Validator;
// import org.springframework.validation.annotation.Validated;
//
// import javax.validation.Validation;
//
// @Aspect
// @Component
// public class ParamCheckAspect {
//
//     private Validator validator = (Validator) Validation.byProvider(HibernateValidator.class).configure().failFast(true).buildValidatorFactory().getValidator();
//
//     @Around(value = "@annotation(org.springframework.validation.annotation.Validated) && @annotation(validated)")
//     public Object around(ProceedingJoinPoint joinPoint , Validated validated){
//
//
//
//
//     }
//
// }
