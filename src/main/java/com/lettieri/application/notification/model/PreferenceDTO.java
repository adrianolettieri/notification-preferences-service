package com.lettieri.application.notification.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class PreferenceDTO {

    @JsonProperty
    private PreferenceStatus status;
    @JsonProperty
    private String statusDescription;
    @JsonProperty
    private String smsPreferenceFlag;
    @JsonProperty
    private String emailPreferenceFlag;
    @JsonProperty
    private String emailAddress;
    @JsonProperty
    private String phoneNumber;

}
