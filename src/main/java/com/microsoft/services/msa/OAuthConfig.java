package com.microsoft.services.msa;

import android.net.Uri;

/**
 * OAuth endpoint configuration.
 */
public interface OAuthConfig {

    /**
     * The authorization uri
     * @return the value
     */
    Uri getAuthorizeUri();

    /**
     * The desktop uri
     * @return the value
     */
    Uri getDesktopUri();

    /**
     * The logout uri
     * @return the value
     */
    Uri getLogoutUri();

    /**
     * The auth token uri
     * @return the value
     */
    Uri getTokenUri();
}
