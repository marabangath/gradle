/*
 * Copyright 2017 the original author or authors.
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

package org.gradle.api.internal.tasks.properties;

import org.gradle.api.internal.tasks.DeclaredTaskInputFileProperty;
import org.gradle.api.internal.tasks.DeclaredTaskInputProperty;
import org.gradle.api.internal.tasks.DeclaredTaskOutputFileProperty;
import org.gradle.api.internal.tasks.TaskValidationContext;

/**
 * Visits properties of beans which are inputs, outputs, destroyables or local state.
 */
public interface PropertyVisitor {

    void visitInputFileProperty(DeclaredTaskInputFileProperty inputFileProperty);

    void visitInputProperty(DeclaredTaskInputProperty inputProperty);

    void visitOutputFileProperty(DeclaredTaskOutputFileProperty outputFileProperty);

    void visitDestroyableProperty(Object value);

    void visitLocalStateProperty(Object value);

    void visitValidationMessage(TaskValidationContext.Severity severity, String message);

    class Adapter implements PropertyVisitor {

        @Override
        public void visitInputFileProperty(DeclaredTaskInputFileProperty inputFileProperty) {
        }

        @Override
        public void visitInputProperty(DeclaredTaskInputProperty inputProperty) {
        }

        @Override
        public void visitOutputFileProperty(DeclaredTaskOutputFileProperty outputFileProperty) {
        }

        @Override
        public void visitDestroyableProperty(Object value) {
        }

        @Override
        public void visitLocalStateProperty(Object value) {
        }

        @Override
        public void visitValidationMessage(TaskValidationContext.Severity severity, String message) {
        }
    }

}
