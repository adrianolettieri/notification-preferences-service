package com.lettieri.application.notification.model;

public enum PreferenceStatus {
    SUCCESS("Notification Received Successfully");
    public final String message;
    private PreferenceStatus(String message) {
        this.message = message;
    }
}
