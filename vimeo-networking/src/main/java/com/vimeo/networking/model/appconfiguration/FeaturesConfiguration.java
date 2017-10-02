/*
 * Copyright (c) 2015 Vimeo (https://vimeo.com)
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.vimeo.networking.model.appconfiguration;

import com.google.gson.annotations.SerializedName;
import com.vimeo.networking.model.appconfiguration.live.LiveChatConfiguration;
import com.vimeo.networking.model.appconfiguration.live.LiveConfiguration;
import com.vimeo.networking.model.appconfiguration.live.LiveHeartbeatConfiguration;
import com.vimeo.stag.UseStag;
import com.vimeo.stag.UseStag.FieldOption;

import org.jetbrains.annotations.Nullable;

/**
 * An object returned from the /configs endpoint containing configuration details for various API features.
 * <p>
 * Created by vennk on 5/20/15.
 */
@SuppressWarnings({"WeakerAccess", "unused"})
@UseStag(FieldOption.SERIALIZED_NAME)
public class FeaturesConfiguration {

    @Nullable
    @SerializedName("live")
    private LiveConfiguration mLiveConfiguration;

    /**
     * @return a {@link LiveConfiguration} object containing configuration information for live video
     * playback related features if available
     */
    @Nullable
    public LiveConfiguration getLiveConfiguration() {
        return mLiveConfiguration;
    }

    /**
     * @return a {@link LiveHeartbeatConfiguration} object containing information for live video heartbeat settings
     * if available
     */
    @Nullable
    public LiveHeartbeatConfiguration getLiveHeartbeatConfiguration() {
        return mLiveConfiguration != null ? mLiveConfiguration.getLiveHeartbeatConfiguration() : null;
    }

    /**
     * @return a {@link LiveChatConfiguration} object containing information for live chat settings if available
     */
    @Nullable
    public LiveChatConfiguration getLiveChatConfiguration() {
        return mLiveConfiguration != null ? mLiveConfiguration.getLiveChatConfiguration() : null;
    }

    void setLiveConfiguration(@Nullable LiveConfiguration liveConfiguration) {
        mLiveConfiguration = liveConfiguration;
    }
}
