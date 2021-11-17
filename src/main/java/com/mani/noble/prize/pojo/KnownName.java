
package com.mani.noble.prize.pojo;

import java.io.Serializable;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "en"
})
@Generated("jsonschema2pojo")
public class KnownName implements Serializable
{

    @JsonProperty("en")
    private String en;
    private final static long serialVersionUID = -8809342784531653924L;

    @JsonProperty("en")
    public String getEn() {
        return en;
    }

    @JsonProperty("en")
    public void setEn(String en) {
        this.en = en;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(KnownName.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("en");
        sb.append('=');
        sb.append(((this.en == null)?"<null>":this.en));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.en == null)? 0 :this.en.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof KnownName) == false) {
            return false;
        }
        KnownName rhs = ((KnownName) other);
        return ((this.en == rhs.en)||((this.en!= null)&&this.en.equals(rhs.en)));
    }

}
