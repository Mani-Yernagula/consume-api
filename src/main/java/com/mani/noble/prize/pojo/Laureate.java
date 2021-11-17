
package com.mani.noble.prize.pojo;

import java.io.Serializable;
import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "knownName",
    "portion",
    "sortOrder",
    "motivation",
    "links"
})
@Generated("jsonschema2pojo")
public class Laureate implements Serializable
{

    @JsonProperty("id")
    private String id;
    @JsonProperty("knownName")
    private KnownName knownName;
    @JsonProperty("portion")
    private String portion;
    @JsonProperty("sortOrder")
    private String sortOrder;
    @JsonProperty("motivation")
    private Motivation motivation;
    @JsonProperty("links")
    private List<Link__1> links = null;
    private final static long serialVersionUID = -708291417302213796L;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("knownName")
    public KnownName getKnownName() {
        return knownName;
    }

    @JsonProperty("knownName")
    public void setKnownName(KnownName knownName) {
        this.knownName = knownName;
    }

    @JsonProperty("portion")
    public String getPortion() {
        return portion;
    }

    @JsonProperty("portion")
    public void setPortion(String portion) {
        this.portion = portion;
    }

    @JsonProperty("sortOrder")
    public String getSortOrder() {
        return sortOrder;
    }

    @JsonProperty("sortOrder")
    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    @JsonProperty("motivation")
    public Motivation getMotivation() {
        return motivation;
    }

    @JsonProperty("motivation")
    public void setMotivation(Motivation motivation) {
        this.motivation = motivation;
    }

    @JsonProperty("links")
    public List<Link__1> getLinks() {
        return links;
    }

    @JsonProperty("links")
    public void setLinks(List<Link__1> links) {
        this.links = links;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Laureate.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("knownName");
        sb.append('=');
        sb.append(((this.knownName == null)?"<null>":this.knownName));
        sb.append(',');
        sb.append("portion");
        sb.append('=');
        sb.append(((this.portion == null)?"<null>":this.portion));
        sb.append(',');
        sb.append("sortOrder");
        sb.append('=');
        sb.append(((this.sortOrder == null)?"<null>":this.sortOrder));
        sb.append(',');
        sb.append("motivation");
        sb.append('=');
        sb.append(((this.motivation == null)?"<null>":this.motivation));
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
        result = ((result* 31)+((this.portion == null)? 0 :this.portion.hashCode()));
        result = ((result* 31)+((this.sortOrder == null)? 0 :this.sortOrder.hashCode()));
        result = ((result* 31)+((this.motivation == null)? 0 :this.motivation.hashCode()));
        result = ((result* 31)+((this.links == null)? 0 :this.links.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.knownName == null)? 0 :this.knownName.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Laureate) == false) {
            return false;
        }
        Laureate rhs = ((Laureate) other);
        return (((((((this.portion == rhs.portion)||((this.portion!= null)&&this.portion.equals(rhs.portion)))&&((this.sortOrder == rhs.sortOrder)||((this.sortOrder!= null)&&this.sortOrder.equals(rhs.sortOrder))))&&((this.motivation == rhs.motivation)||((this.motivation!= null)&&this.motivation.equals(rhs.motivation))))&&((this.links == rhs.links)||((this.links!= null)&&this.links.equals(rhs.links))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.knownName == rhs.knownName)||((this.knownName!= null)&&this.knownName.equals(rhs.knownName))));
    }

}
