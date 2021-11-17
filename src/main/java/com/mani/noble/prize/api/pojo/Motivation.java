
package com.mani.noble.prize.api.pojo;

import java.io.Serializable;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "en",
    "se"
})
@Generated("jsonschema2pojo")
public class Motivation implements Serializable
{

    @JsonProperty("en")
    private String en;
    @JsonProperty("se")
    private String se;
    private final static long serialVersionUID = 1390093745885420516L;

    @JsonProperty("en")
    public String getEn() {
        return en;
    }

    @JsonProperty("en")
    public void setEn(String en) {
        this.en = en;
    }

    @JsonProperty("se")
    public String getSe() {
        return se;
    }

    @JsonProperty("se")
    public void setSe(String se) {
        this.se = se;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Motivation.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("en");
        sb.append('=');
        sb.append(((this.en == null)?"<null>":this.en));
        sb.append(',');
        sb.append("se");
        sb.append('=');
        sb.append(((this.se == null)?"<null>":this.se));
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
        result = ((result* 31)+((this.se == null)? 0 :this.se.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Motivation) == false) {
            return false;
        }
        Motivation rhs = ((Motivation) other);
        return (((this.en == rhs.en)||((this.en!= null)&&this.en.equals(rhs.en)))&&((this.se == rhs.se)||((this.se!= null)&&this.se.equals(rhs.se))));
    }

}
