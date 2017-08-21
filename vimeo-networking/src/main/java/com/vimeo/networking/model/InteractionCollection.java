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

import org.jetbrains.annotations.Nullable;

import java.io.Serializable;

/**
 * A collection of Interaction objects.
 * Created by zetterstromk on 6/5/15.
 */
@SuppressWarnings("unused")
@UseStag
public class InteractionCollection implements Serializable {

    private static final long serialVersionUID = 1673985602275241413L;

    @Nullable
    @SerializedName("watchlater")
    private Interaction mWatchLater;

    @Nullable
    @SerializedName("like")
    private Interaction mLike;

    @Nullable
    @SerializedName("follow")
    private Interaction mFollow;

    @Nullable
    @SerializedName("buy")
    private Interaction mBuy;

    @Nullable
    @SerializedName("rent")
    private Interaction mRent;

    @Nullable
    @SerializedName("subscribe")
    private Interaction mSubscribe;

    // -----------------------------------------------------------------------------------------------------
    // Getters and Setters
    // -----------------------------------------------------------------------------------------------------
    // <editor-fold desc="Getters and Setters">
    @Nullable
    public Interaction getWatchLater() {
        return mWatchLater;
    }

    public void setWatchLater(@Nullable Interaction watchLater) {
        mWatchLater = watchLater;
    }

    @Nullable
    public Interaction getLike() {
        return mLike;
    }

    public void setLike(@Nullable Interaction like) {
        mLike = like;
    }

    @Nullable
    public Interaction getFollow() {
        return mFollow;
    }

    public void setFollow(@Nullable Interaction follow) {
        mFollow = follow;
    }

    @Nullable
    public Interaction getBuy() {
        return mBuy;
    }

    public void setBuy(@Nullable Interaction buy) {
        mBuy = buy;
    }

    @Nullable
    public Interaction getRent() {
        return mRent;
    }

    public void setRent(@Nullable Interaction rent) {
        mRent = rent;
    }

    @Nullable
    public Interaction getSubscribe() {
        return mSubscribe;
    }

    public void setSubscribe(@Nullable Interaction subscribe) {
        mSubscribe = subscribe;
    }
    // </editor-fold>

}
