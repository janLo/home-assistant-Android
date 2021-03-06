package io.homeassistant.android;

public final class Common {

    public static final String PREF_HASS_URL_KEY = "hass_url";
    public static final String PREF_HASS_PASSWORD_KEY = "hass_password";

    public static final int LIGHT_SUPPORTS_BRIGHTNESS = 1;
    public static final int LIGHT_SUPPORTS_COLOR_TEMP = 2;
    public static final int LIGHT_SUPPORTS_EFFECT = 4;
    public static final int LIGHT_SUPPORTS_FLASH = 8;
    public static final int LIGHT_SUPPORTS_RGB_COLOR = 16;
    public static final int LIGHT_SUPPORTS_TRANSITION = 32;
    public static final int LIGHT_SUPPORTS_XY_COLOR = 64;
    public static final int LIGHT_SUPPORTS_WHITE_VALUE = 128;

    private Common() {

    }
}