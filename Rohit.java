This is Rohit.java
-----------------------------------com.example.Body.java-----------------------------------

package com.example;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"MLI",
"last_cli_date",
"ac_num",
"cst_num",
"card_num",
"last_cli_amt",
"cr_lmt_amt"
})
public class Body {

@JsonProperty("MLI")
private String mLI;
@JsonProperty("last_cli_date")
private String lastCliDate;
@JsonProperty("ac_num")
private String acNum;
@JsonProperty("cst_num")
private String cstNum;
@JsonProperty("card_num")
private String cardNum;
@JsonProperty("last_cli_amt")
private String lastCliAmt;
@JsonProperty("cr_lmt_amt")
private String crLmtAmt;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("MLI")
public String getMLI() {
return mLI;
}

@JsonProperty("MLI")
public void setMLI(String mLI) {
this.mLI = mLI;
}

@JsonProperty("last_cli_date")
public String getLastCliDate() {
return lastCliDate;
}

@JsonProperty("last_cli_date")
public void setLastCliDate(String lastCliDate) {
this.lastCliDate = lastCliDate;
}

@JsonProperty("ac_num")
public String getAcNum() {
return acNum;
}

@JsonProperty("ac_num")
public void setAcNum(String acNum) {
this.acNum = acNum;
}

@JsonProperty("cst_num")
public String getCstNum() {
return cstNum;
}

@JsonProperty("cst_num")
public void setCstNum(String cstNum) {
this.cstNum = cstNum;
}

@JsonProperty("card_num")
public String getCardNum() {
return cardNum;
}

@JsonProperty("card_num")
public void setCardNum(String cardNum) {
this.cardNum = cardNum;
}

@JsonProperty("last_cli_amt")
public String getLastCliAmt() {
return lastCliAmt;
}

@JsonProperty("last_cli_amt")
public void setLastCliAmt(String lastCliAmt) {
this.lastCliAmt = lastCliAmt;
}

@JsonProperty("cr_lmt_amt")
public String getCrLmtAmt() {
return crLmtAmt;
}

@JsonProperty("cr_lmt_amt")
public void setCrLmtAmt(String crLmtAmt) {
this.crLmtAmt = crLmtAmt;
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
-----------------------------------com.example.Event.java-----------------------------------

package com.example;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"header",
"body"
})
public class Event {

@JsonProperty("header")
private Header header;
@JsonProperty("body")
private Body body;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("header")
public Header getHeader() {
return header;
}

@JsonProperty("header")
public void setHeader(Header header) {
this.header = header;
}

@JsonProperty("body")
public Body getBody() {
return body;
}

@JsonProperty("body")
public void setBody(Body body) {
this.body = body;
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
-----------------------------------com.example.Example.java-----------------------------------

package com.example;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"event"
})
public class Example {

@JsonProperty("event")
private Event event;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("event")
public Event getEvent() {
return event;
}

@JsonProperty("event")
public void setEvent(Event event) {
this.event = event;
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
-----------------------------------com.example.Header.java-----------------------------------

package com.example;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"name",
"version",
"producerCSI",
"channelId",
"countryCode",
"businessCode",
"domain",
"uuid",
"sid",
"transactionTime",
"timestamp"
})
public class Header {

@JsonProperty("name")
private String name;
@JsonProperty("version")
private String version;
@JsonProperty("producerCSI")
private String producerCSI;
@JsonProperty("channelId")
private String channelId;
@JsonProperty("countryCode")
private String countryCode;
@JsonProperty("businessCode")
private String businessCode;
@JsonProperty("domain")
private String domain;
@JsonProperty("uuid")
private String uuid;
@JsonProperty("sid")
private String sid;
@JsonProperty("transactionTime")
private String transactionTime;
@JsonProperty("timestamp")
private String timestamp;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("name")
public String getName() {
return name;
}

@JsonProperty("name")
public void setName(String name) {
this.name = name;
}

@JsonProperty("version")
public String getVersion() {
return version;
}

@JsonProperty("version")
public void setVersion(String version) {
this.version = version;
}

@JsonProperty("producerCSI")
public String getProducerCSI() {
return producerCSI;
}

@JsonProperty("producerCSI")
public void setProducerCSI(String producerCSI) {
this.producerCSI = producerCSI;
}

@JsonProperty("channelId")
public String getChannelId() {
return channelId;
}

@JsonProperty("channelId")
public void setChannelId(String channelId) {
this.channelId = channelId;
}

@JsonProperty("countryCode")
public String getCountryCode() {
return countryCode;
}

@JsonProperty("countryCode")
public void setCountryCode(String countryCode) {
this.countryCode = countryCode;
}

@JsonProperty("businessCode")
public String getBusinessCode() {
return businessCode;
}

@JsonProperty("businessCode")
public void setBusinessCode(String businessCode) {
this.businessCode = businessCode;
}

@JsonProperty("domain")
public String getDomain() {
return domain;
}

@JsonProperty("domain")
public void setDomain(String domain) {
this.domain = domain;
}

@JsonProperty("uuid")
public String getUuid() {
return uuid;
}

@JsonProperty("uuid")
public void setUuid(String uuid) {
this.uuid = uuid;
}

@JsonProperty("sid")
public String getSid() {
return sid;
}

@JsonProperty("sid")
public void setSid(String sid) {
this.sid = sid;
}

@JsonProperty("transactionTime")
public String getTransactionTime() {
return transactionTime;
}

@JsonProperty("transactionTime")
public void setTransactionTime(String transactionTime) {
this.transactionTime = transactionTime;
}

@JsonProperty("timestamp")
public String getTimestamp() {
return timestamp;
}

@JsonProperty("timestamp")
public void setTimestamp(String timestamp) {
this.timestamp = timestamp;
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
