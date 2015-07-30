package com.microsoft.services.msa;

import android.net.Uri;

/**
 * OAuth configuration for the Microsoft services
 */
public class MicrosoftOAuthConfig implements OAuthConfig {

    /**
     * The domain to authenticate against
     */
    public static final String HTTPS_LOGIN_LIVE_COM = "https://login.live.com/";

    /**
     * Singleton instance
     */
    private static MicrosoftOAuthConfig sInstance;

    /**
     * The authorization uri
     */
    private Uri mOAuthAuthorizeUri;

    /**
     * The desktop uri
     */
    private Uri mOAuthDesktopUri;

    /**
     * The logout uri
     */
    private Uri mOAuthLogoutUri;

    /**
     * The auth token uri
     */
    private Uri mOAuthTokenUri;

    /**
     * Default Constructor
     */
    public MicrosoftOAuthConfig() {
        mOAuthAuthorizeUri = Uri.parse(HTTPS_LOGIN_LIVE_COM + "oauth20_authorize.srf");
        mOAuthDesktopUri = Uri.parse(HTTPS_LOGIN_LIVE_COM + "oauth20_desktop.srf");
        mOAuthLogoutUri = Uri.parse(HTTPS_LOGIN_LIVE_COM + "oauth20_logout.srf");
        mOAuthTokenUri = Uri.parse(HTTPS_LOGIN_LIVE_COM + "oauth20_token.srf");
    }

    /**
     * Gets an instance of the OneDrive OAuth configuration
     * @return The singleton instance
     */
    public static MicrosoftOAuthConfig getInstance() {
        if (MicrosoftOAuthConfig.sInstance == null) {
            MicrosoftOAuthConfig.sInstance = new MicrosoftOAuthConfig();
        }

        return MicrosoftOAuthConfig.sInstance;
    }

    @Override
    public Uri getAuthorizeUri() {
        return mOAuthAuthorizeUri;
    }

    @Override
    public Uri getDesktopUri() {
        return mOAuthDesktopUri;
    }

    @Override
    public Uri getLogoutUri() {
        return mOAuthLogoutUri;
    }

    @Override
    public Uri getTokenUri() {
        return mOAuthTokenUri;
    }
}
