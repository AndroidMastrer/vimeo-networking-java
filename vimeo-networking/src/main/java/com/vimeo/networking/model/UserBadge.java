/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2016 Vimeo
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

import org.jetbrains.annotations.NotNull;

import java.io.Serializable;

/**
 * A badge that can be associated with a user.
 * <p>
 * This data is not available to the general public.
 * <p>
 * Created by zetterstromk on 7/18/16.
 */
@SuppressWarnings("unused")
@UseStag
public class UserBadge implements Serializable {

    private static final long serialVersionUID = 4184875757132125902L;

    private static final String BADGE_ALUM = "alum";
    private static final String BADGE_BUSINESS = "business";
    private static final String BADGE_CURATION = "curation";
    private static final String BADGE_PLUS = "plus";
    private static final String BADGE_POTUS = "potus";
    private static final String BADGE_PRO = "pro";
    private static final String BADGE_STAFF = "staff";
    private static final String BADGE_SUPPORT = "support";

    public enum UserBadgeType {
        NONE,
        ALUM,
        BUSINESS,
        CURATION,
        PLUS,
        POTUS,
        PRO,
        STAFF,
        SUPPORT
    }

    @SerializedName(value = "type", alternate = "m_badge_type")
    private String mBadgeType;

    @SerializedName(value = "text", alternate = "m_text")
    private String mText;

    @SerializedName(value = "alt_text", alternate = "m_alternate_text")
    private String mAlternateText;

    @SerializedName(value = "url", alternate = "m_url")
    private String mUrl;

    // -----------------------------------------------------------------------------------------------------
    // Getters and Setters
    // -----------------------------------------------------------------------------------------------------
    // <editor-fold desc="Getters and Setters">
    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public String getAlternateText() {
        return mAlternateText;
    }

    public void setAlternateText(String alternateText) {
        mAlternateText = alternateText;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

    @NotNull
    public UserBadgeType getBadgeType() {
        if (mBadgeType == null) {
            return UserBadgeType.NONE;
        }
        switch (mBadgeType) {
            case BADGE_ALUM:
                return UserBadgeType.ALUM;
            case BADGE_BUSINESS:
                return UserBadgeType.BUSINESS;
            case BADGE_CURATION:
                return UserBadgeType.CURATION;
            case BADGE_PLUS:
                return UserBadgeType.PLUS;
            case BADGE_POTUS:
                return UserBadgeType.POTUS;
            case BADGE_PRO:
                return UserBadgeType.PRO;
            case BADGE_STAFF:
                return UserBadgeType.STAFF;
            case BADGE_SUPPORT:
                return UserBadgeType.SUPPORT;
            default:
                return UserBadgeType.NONE;

        }
    }

    public void setBadgeType(String badgeType) {
        mBadgeType = badgeType;
    }
    // </editor-fold>
}
