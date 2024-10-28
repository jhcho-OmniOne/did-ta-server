/*
 * Copyright 2024 OmniOne.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.omnione.did.base.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation for validating that a list is not empty.
 * This annotation ensures that the annotated list is not empty if it is not null.
 * If the list is null, the validation will pass.
 */
@Constraint(validatedBy = NonEmptyListValidator.class)
@Target({ ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
public @interface NonEmptyList {
    /**
     * The error message that will be shown if the list is empty.
     * Default message is "List must not be empty".
     */
    String message() default "List must not be empty";

    /**
     * Allows specifying validation groups, to which this constraint belongs.
     */
    Class<?>[] groups() default {};

    /**
     * Payload type that can be attached to a given constraint declaration.
     */
    Class<? extends Payload>[] payload() default {};
}
