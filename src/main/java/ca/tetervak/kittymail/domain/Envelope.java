package ca.tetervak.kittymail.domain;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.io.Serializable;

@SuppressWarnings("unused")
public class Envelope implements Serializable {

    private CatMessage message = CatMessage.MEW;
    // no need to validate the boolean
    private boolean registered = false;

    public Envelope() {
    }

    public CatMessage getMessage() {
        return message;
    }

    public void setMessage(CatMessage message) {
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
