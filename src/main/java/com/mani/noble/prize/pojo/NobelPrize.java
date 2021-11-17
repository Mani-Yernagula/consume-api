
package com.mani.noble.prize.pojo;

import java.io.Serializable;
import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "awardYear",
    "category",
    "categoryFullName",
    "prizeAmount",
    "prizeAmountAdjusted",
    "links",
    "laureates",
    "dateAwarded"
})
@Generated("jsonschema2pojo")
public class NobelPrize implements Serializable
{

    @JsonProperty("awardYear")
    private String awardYear;
    @JsonProperty("category")
    private Category category;
    @JsonProperty("categoryFullName")
    private CategoryFullName categoryFullName;
    @JsonProperty("prizeAmount")
    private Integer prizeAmount;
    @JsonProperty("prizeAmountAdjusted")
    private Integer prizeAmountAdjusted;
    @JsonProperty("links")
    private List<Link> links = null;
    @JsonProperty("laureates")
    private List<Laureate> laureates = null;
    @JsonProperty("dateAwarded")
    private String dateAwarded;
    private final static long serialVersionUID = -4329923786444959713L;

    @JsonProperty("awardYear")
    public String getAwardYear() {
        return awardYear;
    }

    @JsonProperty("awardYear")
    public void setAwardYear(String awardYear) {
        this.awardYear = awardYear;
    }

    @JsonProperty("category")
    public Category getCategory() {
        return category;
    }

    @JsonProperty("category")
    public void setCategory(Category category) {
        this.category = category;
    }

    @JsonProperty("categoryFullName")
    public CategoryFullName getCategoryFullName() {
        return categoryFullName;
    }

    @JsonProperty("categoryFullName")
    public void setCategoryFullName(CategoryFullName categoryFullName) {
        this.categoryFullName = categoryFullName;
    }

    @JsonProperty("prizeAmount")
    public Integer getPrizeAmount() {
        return prizeAmount;
    }

    @JsonProperty("prizeAmount")
    public void setPrizeAmount(Integer prizeAmount) {
        this.prizeAmount = prizeAmount;
    }

    @JsonProperty("prizeAmountAdjusted")
    public Integer getPrizeAmountAdjusted() {
        return prizeAmountAdjusted;
    }

    @JsonProperty("prizeAmountAdjusted")
    public void setPrizeAmountAdjusted(Integer prizeAmountAdjusted) {
        this.prizeAmountAdjusted = prizeAmountAdjusted;
    }

    @JsonProperty("links")
    public List<Link> getLinks() {
        return links;
    }

    @JsonProperty("links")
    public void setLinks(List<Link> links) {
        this.links = links;
    }

    @JsonProperty("laureates")
    public List<Laureate> getLaureates() {
        return laureates;
    }

    @JsonProperty("laureates")
    public void setLaureates(List<Laureate> laureates) {
        this.laureates = laureates;
    }

    @JsonProperty("dateAwarded")
    public String getDateAwarded() {
        return dateAwarded;
    }

    @JsonProperty("dateAwarded")
    public void setDateAwarded(String dateAwarded) {
        this.dateAwarded = dateAwarded;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(NobelPrize.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("awardYear");
        sb.append('=');
        sb.append(((this.awardYear == null)?"<null>":this.awardYear));
        sb.append(',');
        sb.append("category");
        sb.append('=');
        sb.append(((this.category == null)?"<null>":this.category));
        sb.append(',');
        sb.append("categoryFullName");
        sb.append('=');
        sb.append(((this.categoryFullName == null)?"<null>":this.categoryFullName));
        sb.append(',');
        sb.append("prizeAmount");
        sb.append('=');
        sb.append(((this.prizeAmount == null)?"<null>":this.prizeAmount));
        sb.append(',');
        sb.append("prizeAmountAdjusted");
        sb.append('=');
        sb.append(((this.prizeAmountAdjusted == null)?"<null>":this.prizeAmountAdjusted));
        sb.append(',');
        sb.append("links");
        sb.append('=');
        sb.append(((this.links == null)?"<null>":this.links));
        sb.append(',');
        sb.append("laureates");
        sb.append('=');
        sb.append(((this.laureates == null)?"<null>":this.laureates));
        sb.append(',');
        sb.append("dateAwarded");
        sb.append('=');
        sb.append(((this.dateAwarded == null)?"<null>":this.dateAwarded));
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
        result = ((result* 31)+((this.awardYear == null)? 0 :this.awardYear.hashCode()));
        result = ((result* 31)+((this.categoryFullName == null)? 0 :this.categoryFullName.hashCode()));
        result = ((result* 31)+((this.prizeAmount == null)? 0 :this.prizeAmount.hashCode()));
        result = ((result* 31)+((this.prizeAmountAdjusted == null)? 0 :this.prizeAmountAdjusted.hashCode()));
        result = ((result* 31)+((this.links == null)? 0 :this.links.hashCode()));
        result = ((result* 31)+((this.dateAwarded == null)? 0 :this.dateAwarded.hashCode()));
        result = ((result* 31)+((this.laureates == null)? 0 :this.laureates.hashCode()));
        result = ((result* 31)+((this.category == null)? 0 :this.category.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NobelPrize) == false) {
            return false;
        }
        NobelPrize rhs = ((NobelPrize) other);
        return (((((((((this.awardYear == rhs.awardYear)||((this.awardYear!= null)&&this.awardYear.equals(rhs.awardYear)))&&((this.categoryFullName == rhs.categoryFullName)||((this.categoryFullName!= null)&&this.categoryFullName.equals(rhs.categoryFullName))))&&((this.prizeAmount == rhs.prizeAmount)||((this.prizeAmount!= null)&&this.prizeAmount.equals(rhs.prizeAmount))))&&((this.prizeAmountAdjusted == rhs.prizeAmountAdjusted)||((this.prizeAmountAdjusted!= null)&&this.prizeAmountAdjusted.equals(rhs.prizeAmountAdjusted))))&&((this.links == rhs.links)||((this.links!= null)&&this.links.equals(rhs.links))))&&((this.dateAwarded == rhs.dateAwarded)||((this.dateAwarded!= null)&&this.dateAwarded.equals(rhs.dateAwarded))))&&((this.laureates == rhs.laureates)||((this.laureates!= null)&&this.laureates.equals(rhs.laureates))))&&((this.category == rhs.category)||((this.category!= null)&&this.category.equals(rhs.category))));
    }

}
