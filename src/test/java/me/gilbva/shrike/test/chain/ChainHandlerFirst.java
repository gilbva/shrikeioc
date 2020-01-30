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

package me.gilbva.shrike.test.chain;

import me.gilbva.shrike.annotations.Component;
import me.gilbva.shrike.annotations.InjectNext;
import me.gilbva.shrike.annotations.Priority;

@Component
@Priority(1)
public class ChainHandlerFirst implements MyChainHandler<String> {
    @InjectNext
    private MyChainHandler<String> next;

    @Override
    public String execute(String prev) {
        String c = "1";
        if (prev != null) {
            c = prev + " " + c;
        }
        if (next != null) {
            return next.execute(c);
        }
        return c;
    }

}