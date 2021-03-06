package com.mugoft.extractors.common;

public abstract class CookiesExtractor {

    /**
     * Start cookies extraction.
     *
     */
    public abstract void start() throws Exception;

    /**
     *
     * @return all read cookies
     */
    public abstract String readCookies();

    /**
     * Finish coolies extraction process.
     *
     * @return status message to display for user TODO: can be replaced by status codes if will be necessary
     */
    public abstract void finish();
}
