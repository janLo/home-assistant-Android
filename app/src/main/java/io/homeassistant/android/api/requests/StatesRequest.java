package io.homeassistant.android.api.requests;

import com.afollestad.ason.Ason;

public class StatesRequest extends Ason {
    protected final int id;
    protected final String type = "get_states";

    public StatesRequest(int id) {
        this.id = id;
    }
}