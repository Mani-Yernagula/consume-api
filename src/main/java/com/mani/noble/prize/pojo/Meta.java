
package com.mani.noble.prize.pojo;

import java.io.Serializable;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "offset",
    "limit",
    "nobelPrizeCategory",
    "count",
    "terms",
    "license",
    "disclaimer"
})
@Generated("jsonschema2pojo")
public class Meta implements Serializable
{

    @JsonProperty("offset")
    private Integer offset;
    @JsonProperty("limit")
    private Integer limit;
    @JsonProperty("nobelPrizeCategory")
    private String nobelPrizeCategory;
    @JsonProperty("count")
    private Integer count;
    @JsonProperty("terms")
    private String terms;
    @JsonProperty("license")
    private String license;
    @JsonProperty("disclaimer")
    private String disclaimer;
    private final static long serialVersionUID = 8565098699295032843L;

    @JsonProperty("offset")
    public Integer getOffset() {
        return offset;
    }

    @JsonProperty("offset")
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    @JsonProperty("limit")
    public Integer getLimit() {
        return limit;
    }

    @JsonProperty("limit")
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @JsonProperty("nobelPrizeCategory")
    public String getNobelPrizeCategory() {
        return nobelPrizeCategory;
    }

    @JsonProperty("nobelPrizeCategory")
    public void setNobelPrizeCategory(String nobelPrizeCategory) {
        this.nobelPrizeCategory = nobelPrizeCategory;
    }

    @JsonProperty("count")
    public Integer getCount() {
        return count;
    }

    @JsonProperty("count")
    public void setCount(Integer count) {
        this.count = count;
    }

    @JsonProperty("terms")
    public String getTerms() {
        return terms;
    }

    @JsonProperty("terms")
    public void setTerms(String terms) {
        this.terms = terms;
    }

    @JsonProperty("license")
    public String getLicense() {
        return license;
    }

    @JsonProperty("license")
    public void setLicense(String license) {
        this.license = license;
    }

    @JsonProperty("disclaimer")
    public String getDisclaimer() {
        return disclaimer;
    }

    @JsonProperty("disclaimer")
    public void setDisclaimer(String disclaimer) {
        this.disclaimer = disclaimer;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Meta.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("offset");
        sb.append('=');
        sb.append(((this.offset == null)?"<null>":this.offset));
        sb.append(',');
        sb.append("limit");
        sb.append('=');
        sb.append(((this.limit == null)?"<null>":this.limit));
        sb.append(',');
        sb.append("nobelPrizeCategory");
        sb.append('=');
        sb.append(((this.nobelPrizeCategory == null)?"<null>":this.nobelPrizeCategory));
        sb.append(',');
        sb.append("count");
        sb.append('=');
        sb.append(((this.count == null)?"<null>":this.count));
        sb.append(',');
        sb.append("terms");
        sb.append('=');
        sb.append(((this.terms == null)?"<null>":this.terms));
        sb.append(',');
        sb.append("license");
        sb.append('=');
        sb.append(((this.license == null)?"<null>":this.license));
        sb.append(',');
        sb.append("disclaimer");
        sb.append('=');
        sb.append(((this.disclaimer == null)?"<null>":this.disclaimer));
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
        result = ((result* 31)+((this.license == null)? 0 :this.license.hashCode()));
        result = ((result* 31)+((this.offset == null)? 0 :this.offset.hashCode()));
        result = ((result* 31)+((this.terms == null)? 0 :this.terms.hashCode()));
        result = ((result* 31)+((this.limit == null)? 0 :this.limit.hashCode()));
        result = ((result* 31)+((this.count == null)? 0 :this.count.hashCode()));
        result = ((result* 31)+((this.disclaimer == null)? 0 :this.disclaimer.hashCode()));
        result = ((result* 31)+((this.nobelPrizeCategory == null)? 0 :this.nobelPrizeCategory.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Meta) == false) {
            return false;
        }
        Meta rhs = ((Meta) other);
        return ((((((((this.license == rhs.license)||((this.license!= null)&&this.license.equals(rhs.license)))&&((this.offset == rhs.offset)||((this.offset!= null)&&this.offset.equals(rhs.offset))))&&((this.terms == rhs.terms)||((this.terms!= null)&&this.terms.equals(rhs.terms))))&&((this.limit == rhs.limit)||((this.limit!= null)&&this.limit.equals(rhs.limit))))&&((this.count == rhs.count)||((this.count!= null)&&this.count.equals(rhs.count))))&&((this.disclaimer == rhs.disclaimer)||((this.disclaimer!= null)&&this.disclaimer.equals(rhs.disclaimer))))&&((this.nobelPrizeCategory == rhs.nobelPrizeCategory)||((this.nobelPrizeCategory!= null)&&this.nobelPrizeCategory.equals(rhs.nobelPrizeCategory))));
    }

}
