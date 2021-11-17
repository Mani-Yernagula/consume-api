
package com.mani.noble.prize.api.pojo;

import java.io.Serializable;
import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "nobelPrizes",
    "meta",
    "links"
})
@Generated("jsonschema2pojo")
public class NoblePrizes implements Serializable
{

    @JsonProperty("nobelPrizes")
    private List<NobelPrize> nobelPrizes = null;
    @JsonProperty("meta")
    private Meta meta;
    @JsonProperty("links")
    private Links links;
    private final static long serialVersionUID = 910303226143817607L;

    @JsonProperty("nobelPrizes")
    public List<NobelPrize> getNobelPrizes() {
        return nobelPrizes;
    }

    @JsonProperty("nobelPrizes")
    public void setNobelPrizes(List<NobelPrize> nobelPrizes) {
        this.nobelPrizes = nobelPrizes;
    }

    @JsonProperty("meta")
    public Meta getMeta() {
        return meta;
    }

    @JsonProperty("meta")
    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    @JsonProperty("links")
    public Links getLinks() {
        return links;
    }

    @JsonProperty("links")
    public void setLinks(Links links) {
        this.links = links;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(NoblePrizes.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("nobelPrizes");
        sb.append('=');
        sb.append(((this.nobelPrizes == null)?"<null>":this.nobelPrizes));
        sb.append(',');
        sb.append("meta");
        sb.append('=');
        sb.append(((this.meta == null)?"<null>":this.meta));
        sb.append(',');
        sb.append("links");
        sb.append('=');
        sb.append(((this.links == null)?"<null>":this.links));
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
        result = ((result* 31)+((this.links == null)? 0 :this.links.hashCode()));
        result = ((result* 31)+((this.nobelPrizes == null)? 0 :this.nobelPrizes.hashCode()));
        result = ((result* 31)+((this.meta == null)? 0 :this.meta.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NoblePrizes) == false) {
            return false;
        }
        NoblePrizes rhs = ((NoblePrizes) other);
        return ((((this.links == rhs.links)||((this.links!= null)&&this.links.equals(rhs.links)))&&((this.nobelPrizes == rhs.nobelPrizes)||((this.nobelPrizes!= null)&&this.nobelPrizes.equals(rhs.nobelPrizes))))&&((this.meta == rhs.meta)||((this.meta!= null)&&this.meta.equals(rhs.meta))));
    }

}
