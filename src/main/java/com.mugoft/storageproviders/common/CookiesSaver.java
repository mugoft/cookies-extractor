package com.mugoft.storageproviders.common;

public abstract class CookiesSaver {
    /**
     * Output path  where cookies should be stored
     */
    protected final String outPath;

    public CookiesSaver(String outPath) {
        this.outPath = outPath;
    }

    /**
     * Stores cookies in json format using {@link outPath}
     * During storing some exceptions can happen, which has to be handled by upper layer.
     */
    public abstract void storeCookies(String jsonCookies) throws Exception;
}
