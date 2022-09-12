package com.lettieri.application.notification.formatters;

import com.lettieri.application.notification.entities.Preference;
import com.lettieri.application.notification.model.PreferenceDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface PreferenceMapper {


    PreferenceDTO toPreferenceDto(Preference preference);
}
