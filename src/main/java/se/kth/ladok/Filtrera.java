package se.kth.ladok;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"KurstillfallenUID",
"Filtrering",
"GruppUID",
"StudenterUID",
"UtbildningsinstansUID",
"OrderBy",
"Page",
"Limit"
})
public class Filtrera {

@JsonProperty("KurstillfallenUID")
private List<String> kurstillfallenUID = null;
@JsonProperty("Filtrering")
private List<String> filtrering = null;
@JsonProperty("GruppUID")
private Object gruppUID;
@JsonProperty("StudenterUID")
private Object studenterUID;
@JsonProperty("UtbildningsinstansUID")
private String utbildningsinstansUID;
@JsonProperty("OrderBy")
private List<String> orderBy = null;
@JsonProperty("Page")
private Integer page;
@JsonProperty("Limit")
private Integer limit;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("KurstillfallenUID")
public List<String> getKurstillfallenUID() {
return kurstillfallenUID;
}

@JsonProperty("KurstillfallenUID")
public void setKurstillfallenUID(List<String> kurstillfallenUID) {
this.kurstillfallenUID = kurstillfallenUID;
}

@JsonProperty("Filtrering")
public List<String> getFiltrering() {
return filtrering;
}

@JsonProperty("Filtrering")
public void setFiltrering(List<String> filtrering) {
this.filtrering = filtrering;
}

@JsonProperty("GruppUID")
public Object getGruppUID() {
return gruppUID;
}

@JsonProperty("GruppUID")
public void setGruppUID(Object gruppUID) {
this.gruppUID = gruppUID;
}

@JsonProperty("StudenterUID")
public Object getStudenterUID() {
return studenterUID;
}

@JsonProperty("StudenterUID")
public void setStudenterUID(Object studenterUID) {
this.studenterUID = studenterUID;
}

@JsonProperty("UtbildningsinstansUID")
public String getUtbildningsinstansUID() {
return utbildningsinstansUID;
}

@JsonProperty("UtbildningsinstansUID")
public void setUtbildningsinstansUID(String utbildningsinstansUID) {
this.utbildningsinstansUID = utbildningsinstansUID;
}

@JsonProperty("OrderBy")
public List<String> getOrderBy() {
return orderBy;
}

@JsonProperty("OrderBy")
public void setOrderBy(List<String> orderBy) {
this.orderBy = orderBy;
}

@JsonProperty("Page")
public Integer getPage() {
return page;
}

@JsonProperty("Page")
public void setPage(Integer page) {
this.page = page;
}

@JsonProperty("Limit")
public Integer getLimit() {
return limit;
}

@JsonProperty("Limit")
public void setLimit(Integer limit) {
this.limit = limit;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}
