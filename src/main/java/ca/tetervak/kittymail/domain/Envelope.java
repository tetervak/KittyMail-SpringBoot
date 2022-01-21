package ca.tetervak.kittymail.domain;

import java.io.Serializable;

@SuppressWarnings("unused")
public class Envelope implements Serializable {

    private int message = 1;
    // no need to validate the boolean
    private boolean registered = true;

    public Envelope() {
    }

    public int getMessage() {
        return message;
    }

    public void setMessage(int message) {
        this.message = message;
    }

    public boolean isRegistered() {
        return registered;
    }

    public void setRegistered(boolean registered) {
        this.registered = registered;
    }

    @Override
    public String toString() {
        return "Envelope{" +
                "message=" + message +
                ", registered=" + registered +
                '}';
    }
}
