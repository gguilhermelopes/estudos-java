package annotation;

import java.lang.annotation.RetentionPolicy;

@ExemploAnnotation(
        value = 15L,
        names = {"Guilherme", "Bukenzitos"},
        value2 = RetentionPolicy.RUNTIME,
        value3 = RetentionPolicy.RUNTIME
)
public class AnnotationClass {
}
