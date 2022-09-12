package com.lettieri.application.notification.repositories;

import com.lettieri.application.notification.entities.Preference;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PreferencesRepository extends JpaRepository<Preference, UUID> {

    Preference findByCustomerId(String customerId);
}
