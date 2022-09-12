package com.lettieri.application.notification.services;

import com.lettieri.application.notification.entities.Preference;
import com.lettieri.application.notification.repositories.PreferencesRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@AllArgsConstructor
@Transactional
public class PreferencesService {

    private final PreferencesRepository preferencesRepository;

    public Preference getCustomerPreference(String customerId) {
        Optional<Preference> preference = Optional.ofNullable(this.preferencesRepository.findByCustomerId(customerId));
        if(!preference.isPresent()) {
            throw new IllegalArgumentException(
                    String.format("Preference not found for %s",
                            customerId));
        }
        return preference.get();
    }

}
