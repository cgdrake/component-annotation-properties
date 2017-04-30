package io.primeval.component.annotation.properties.common;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

import org.osgi.framework.Constants;

import io.primeval.component.annotation.properties.ComponentProperty;

@ComponentProperty(Constants.SERVICE_RANKING)
@Target(ElementType.TYPE)
public @interface ServiceRanking {
    int value();
}
