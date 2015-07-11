/*
 * Copyright 2015 Hippo Seven
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hippo.conaco.util;

public final class IntIdGenerator {

    public static int INVAILD_ID = -1;

    private int mId = 0;

    private IntIdGenerator() {
        // Empty
    }

    public synchronized int nextId() {
        int id;
        do {
            id = mId++;
        } while (id == INVAILD_ID);
        return mId++;
    }

    public static IntIdGenerator create() {
        return new IntIdGenerator();
    }
}
