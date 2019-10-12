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

package com.github.gilbva.shrikeioc.test.chain;

import com.github.gilbva.shrikeioc.annotations.Component;
import com.github.gilbva.shrikeioc.annotations.InjectNext;
import com.github.gilbva.shrikeioc.annotations.Priority;

@Component
@Priority(2)
public class ChainHandlerSecond implements MyChainHandler<String> {
    @InjectNext
    private MyChainHandler<String> next;

    @Override
    public String execute(String prev) {
        String c = "2";
        if (prev != null) {
            c = prev + " " + c;
        }
        if (next != null) {
            return next.execute(c);
        }
        return c;
    }

}
