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

package com.vimeo.networking.model.search;

import com.google.gson.annotations.SerializedName;
import com.vimeo.stag.UseStag;

import org.jetbrains.annotations.Nullable;

import java.io.Serializable;

/**
 * A grouping of all facets
 * <p>
 * Created by zetterstromk on 6/27/16.
 */
@SuppressWarnings("unused")
@UseStag
public class SearchFacetCollection implements Serializable {

    private static final long serialVersionUID = 3340976215489066653L;

    @Nullable
    @SerializedName("type")
    protected SearchFacet mTypeFacet;

    @Nullable
    @SerializedName("category")
    protected SearchFacet mCategoryFacet;

    @Nullable
    @SerializedName("duration")
    protected SearchFacet mDurationFacet;

    @Nullable
    @SerializedName("license")
    protected SearchFacet mLicenseFacet;

    @Nullable
    @SerializedName("uploaded")
    protected SearchFacet mUploadedFacet;

    @Nullable
    @SerializedName("user_type")
    protected SearchFacet mUserTypeFacet;

    @Nullable
    public SearchFacet getTypeFacet() {
        return mTypeFacet;
    }

    @Nullable
    public SearchFacet getCategoryFacet() {
        return mCategoryFacet;
    }

    @Nullable
    public SearchFacet getDurationFacet() {
        return mDurationFacet;
    }

    @Nullable
    public SearchFacet getLicenseFacet() {
        return mLicenseFacet;
    }

    @Nullable
    public SearchFacet getUploadedFacet() {
        return mUploadedFacet;
    }

    @Nullable
    public SearchFacet getUserTypeFacet() {
        return mUserTypeFacet;
    }
}
