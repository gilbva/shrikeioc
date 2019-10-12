/*
 * Copyright 2019 ShrikeIoC Framework.
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

package com.github.gilbva.shrikeioc.test.context;

import com.github.gilbva.shrikeioc.context.IocContext;
import com.github.gilbva.shrikeioc.annotations.Component;
import com.github.gilbva.shrikeioc.annotations.Inject;
import com.github.gilbva.shrikeioc.scope.Application;

@Component
public class ContextInject {
    @Inject
    private IocContext<Application> appCtx;

    public IocContext<Application> getAppCtx() {
        return appCtx;
    }
}
