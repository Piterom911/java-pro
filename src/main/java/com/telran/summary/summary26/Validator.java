package com.telran.summary.summary26;

import java.lang.reflect.Field;

public class Validator {

    public void validate(Student student) throws Exception {
        Class<? extends Student> clazz = student.getClass();
        Field[] declaredFields = clazz.getDeclaredFields();

        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(NotEmpty.class)) {
                field.setAccessible(true);
                String fieldStr = (String) field.get(student);
                NotEmpty annotation = field.getAnnotation(NotEmpty.class);

                if (fieldStr == null && annotation.skip() != Skip.NULL) {
                    throw new ValidateException("Field " + field.getName() + " is null.");
                }
                if (fieldStr.isEmpty() && annotation.skip() != Skip.EMPTY) {
                    throw new ValidateException("Field " + field.getName() + " is empty.");
                }
            }
        }
    }
}