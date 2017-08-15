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
import java.util.Date;

/**
 * Created by zetterstromk on 6/26/15.
 */
@SuppressWarnings("unused")
@UseStag
public class Group implements Serializable {

    private static final long serialVersionUID = -3604741570351063891L;

    @SerializedName("uri")
    private String mUri;

    @SerializedName("created_time")
    private Date mCreatedTime;

    @SerializedName("group_description")
    private String mGroupDescription;

    @SerializedName("link")
    private String mLink;

    @SerializedName("name")
    private String mName;

    @SerializedName("picture_collection")
    private PictureCollection mPictureCollection;

    @SerializedName("privacy")
    private Privacy mPrivacy;

    @SerializedName("user")
    private User mUser;

    @SerializedName("metadata")
    private Metadata mMetadata;

    public String getUri() {
        return mUri;
    }

    public Date getCreatedTime() {
        return mCreatedTime;
    }

    public String getGroupDescription() {
        return mGroupDescription;
    }

    public String getLink() {
        return mLink;
    }

    public String getName() {
        return mName;
    }

    public PictureCollection getPictureCollection() {
        return mPictureCollection;
    }

    public Privacy getPrivacy() {
        return mPrivacy;
    }

    public User getUser() {
        return mUser;
    }

    public Metadata getMetadata() {
        return mMetadata;
    }

    public void setUri(String uri) {
        mUri = uri;
    }

    public void setCreatedTime(Date createdTime) {
        mCreatedTime = createdTime;
    }

    public void setGroupDescription(String groupDescription) {
        mGroupDescription = groupDescription;
    }

    public void setLink(String link) {
        mLink = link;
    }

    public void setName(String name) {
        mName = name;
    }

    public void setPictureCollection(PictureCollection pictureCollection) {
        mPictureCollection = pictureCollection;
    }

    public void setPrivacy(Privacy privacy) {
        mPrivacy = privacy;
    }

    public void setUser(User user) {
        mUser = user;
    }

    public void setMetadata(Metadata metadata) {
        mMetadata = metadata;
    }
}
