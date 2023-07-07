package annotation;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Inherited

public @interface ExemploAnnotation {
    long value();
    String[] names();
    RetentionPolicy[] value2();
    RetentionPolicy value3();

    String defaultName() default "Gui";


}
