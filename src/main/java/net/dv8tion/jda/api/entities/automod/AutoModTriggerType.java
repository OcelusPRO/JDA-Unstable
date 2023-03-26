/*
 * Copyright 2015 Austin Keener, Michael Ritter, Florian Spieß, and the JDA contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.dv8tion.jda.api.entities.automod;

import javax.annotation.Nonnull;

public enum AutoModTriggerType
{
    KEYWORD(1, 6),
    SPAM(3, 1),
    KEYWORD_PRESET(4, 1),
    MENTION_SPAM(5, 1),
    UNKNOWN(-1, 1),
    ;

    private final int key;
    private final int maxPerGuild;

    AutoModTriggerType(int key, int maxPerGuild)
    {
        this.key = key;
        this.maxPerGuild = maxPerGuild;
    }

    public int getKey()
    {
        return key;
    }

    public int getMaxPerGuild()
    {
        return maxPerGuild;
    }

    @Nonnull
    public static AutoModTriggerType fromKey(int key)
    {
        for (AutoModTriggerType trigger : values())
        {
            if (trigger.key == key)
                return trigger;
        }
        return UNKNOWN;
    }
}
