import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

class MyClass {

    private byte[] payload;

    public MyClass(){}

    @JsonCreator
    public MyClass(@JsonProperty("payload") final byte[] payload) {
        this.payload = payload;
    }

    public byte[] getPayload() {
        return this.payload;
    }

}