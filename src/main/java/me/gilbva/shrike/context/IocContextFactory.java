/*
 * Copyright 2019 Shrike Framework.
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

package me.gilbva.shrike.context;

import me.gilbva.shrike.scope.Application;

/**
 * Factory service for the application IoC context.
 *
 * @author Gilberto Vento
 */
public interface IocContextFactory {
    /**
     * Creates the application scoped IocContext.
     *
     * @param application The application scope object.
     * @return The created IocContext object.
     */
    IocContext<Application> createApplicationContext(Application application);
}