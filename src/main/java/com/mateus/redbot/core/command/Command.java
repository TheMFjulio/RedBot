package com.mateus.redbot.core.command;

import com.mateus.redbot.core.permissions.UserPermission;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Command {
    String name();
    String description();
    CommandCategory commandCategory();
    String args();
    UserPermission commandPermission();
}
