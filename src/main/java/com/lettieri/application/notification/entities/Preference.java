package com.lettieri.application.notification.entities;

import lombok.*;

import javax.persistence.*;
import java.util.UUID;

@Getter
@Setter
@Builder
@ToString
@Entity
@Table(name="NOTIFICATION_PREFERENCES")
@AllArgsConstructor
@NoArgsConstructor
public class Preference {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private Boolean smsPreferenceFlag;
    @Column
    private Boolean emailPreferenceFlag;
    @Column
    private String emailAddress;
    @Column
    private String phoneNumber;
    @Column
    private String customerId;
}
