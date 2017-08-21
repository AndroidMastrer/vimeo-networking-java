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

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vimeo.networking.utils.VimeoNetworkUtil;
import com.vimeo.stag.UseStag;
import com.vimeo.stag.UseStag.FieldOption;

import org.jetbrains.annotations.Nullable;

import java.io.Serializable;

/**
 * This class represents an authenticated account with Vimeo. It can be through client credentials or a
 * truly authenticated {@link User}
 * <p>
 * Created by alfredhanssen on 4/12/15.
 */
@SuppressWarnings("unused")
@UseStag(FieldOption.SERIALIZED_NAME)
public class VimeoAccount implements Serializable {

    private static final long serialVersionUID = -8535823709613167151L;

    @SerializedName("access_token")
    private String mAccessToken;

    @SerializedName("token_type")
    private String mTokenType;

    @SerializedName("scope")
    private String mScope;

    @SerializedName("user")
    private User mUser;

    private String mUserJSON;

    public VimeoAccount() {
        //constructor for stag TypeAdapter generation
    }

    public VimeoAccount(@Nullable String accessToken) {
        mAccessToken = accessToken;
    }

    public VimeoAccount(String accessToken, String tokenType, String scope, String userJSON) {
        if (accessToken == null || accessToken.isEmpty() || tokenType == null ||
            tokenType.isEmpty() || scope == null || scope.isEmpty()) {
            throw new AssertionError("Account can only be created with token, tokenType, scope");
        }

        mAccessToken = accessToken;
        mTokenType = tokenType;
        mScope = scope;

        Gson gson = VimeoNetworkUtil.getGson();

        mUser = gson.fromJson(userJSON, User.class);
    }

    // -----------------------------------------------------------------------------------------------------
    // Getters and Setters
    // -----------------------------------------------------------------------------------------------------
    // <editor-fold desc="Getters and Setters">
    public boolean isAuthenticated() {
        return (mAccessToken != null && !mAccessToken.isEmpty());
    }

    public String getAccessToken() {
        return mAccessToken;
    }

    public void setAccessToken(String accessToken) {
        mAccessToken = accessToken;
    }

    public String getTokenType() {
        return mTokenType;
    }

    public void setTokenType(String tokenType) {
        mTokenType = tokenType;
    }

    public String getScope() {
        return mScope;
    }

    public void setScope(String scope) {
        mScope = scope;
    }

    @Nullable
    public User getUser() {
        return mUser;
    }

    public void setUser(User user) {
        mUser = user;
    }

    @Nullable
    public String getUserJSON() {
        if (mUser == null) {
            return null;
        }

        if (mUserJSON != null) {
            return mUserJSON;
        }

        Gson gson = VimeoNetworkUtil.getGson();

        mUserJSON = gson.toJson(mUser);

        return mUserJSON;
    }

    public void setUserJSON(String userJSON) {
        mUserJSON = userJSON;
    }
    // </editor-fold>
}
