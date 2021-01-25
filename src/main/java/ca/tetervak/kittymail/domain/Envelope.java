package ca.tetervak.kittymail.domain;

import java.io.Serializable;

public class Envelope implements Serializable {

    private int message = 1;
    private boolean registered = false;

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
