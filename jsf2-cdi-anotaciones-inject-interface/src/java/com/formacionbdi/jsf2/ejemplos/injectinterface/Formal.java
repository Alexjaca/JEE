
package com.formacionbdi.jsf2.ejemplos.injectinterface;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.inject.Qualifier;

@Target({ElementType.METHOD, 
    ElementType.FIELD, 
    ElementType.PARAMETER, 
    ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface Formal {
    
}
