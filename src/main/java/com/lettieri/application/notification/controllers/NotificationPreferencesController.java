package com.lettieri.application.notification.controllers;

import com.lettieri.application.notification.formatters.PreferenceMapper;
import com.lettieri.application.notification.model.CustomerDTO;
import com.lettieri.application.notification.model.PreferenceDTO;
import com.lettieri.application.notification.model.PreferenceStatus;
import com.lettieri.application.notification.services.PreferencesService;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping()
@AllArgsConstructor
@Api(tags = "Notification Preferences")
public class NotificationPreferencesController {

    private PreferencesService preferencesService;
    private PreferenceMapper preferenceMapper;

    @PostMapping("/preferences")
    public ResponseEntity<PreferenceDTO> getPreference(@RequestBody CustomerDTO customer) {
        PreferenceDTO preferenceDTO = preferenceMapper.
                toPreferenceDto(
                        preferencesService.getCustomerPreference(customer.getCustomerId()));
        preferenceDTO.setStatus(PreferenceStatus.SUCCESS);
        preferenceDTO.setStatusDescription(PreferenceStatus.SUCCESS.message);
        return ResponseEntity.ok(preferenceDTO);
    }

    @GetMapping("/healthcheck")
    public String healthCheck (){
        return "UP";
    }
}
