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

package com.vimeo.networking.model;

import com.google.gson.annotations.SerializedName;
import com.vimeo.stag.UseStag;

import java.io.Serializable;

/**
 * Created by hanssena on 4/23/15.
 */
@SuppressWarnings("unused")
@UseStag
public class Tag implements Serializable {

    private static final long serialVersionUID = 3388947522077930006L;

    @SerializedName("uri")
    private String mUri;

    @SerializedName("name")
    private String mName;

    @SerializedName("tag")
    private String mTag;

    @SerializedName("canonical")
    private String mCanonical;

    @SerializedName("metadata")
    private Metadata mMetadata;

    public String getUri() {
        return mUri;
    }

    public String getName() {
        return mName;
    }

    public String getTag() {
        return mTag;
    }

    public String getCanonical() {
        return mCanonical;
    }

    public Metadata getMetadata() {
        return mMetadata;
    }

    public void setUri(String uri) {
        mUri = uri;
    }

    public void setName(String name) {
        mName = name;
    }

    public void setTag(String tag) {
        mTag = tag;
    }

    public void setCanonical(String canonical) {
        mCanonical = canonical;
    }

    public void setMetadata(Metadata metadata) {
        mMetadata = metadata;
    }
}
