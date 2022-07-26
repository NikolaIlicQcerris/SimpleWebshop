package com.qcerris.webshop.domain.entity.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public enum ShoppingCartStatus {
    NEW("New"),  //just created or empty
    ACTIVE("Active"),  //contains at least one item
    COMPLETED("Completed"), //after checkout
    DELETED("Deleted");


    private static final Logger logger = LoggerFactory.getLogger(ShoppingCartStatus.class);

    private final String description;

    ShoppingCartStatus(final String description) {
        this.description = description;
    }

    @JsonCreator
    public static ShoppingCartStatus fromString(final String typeString) {
        try {
            return valueOf(typeString.toUpperCase());
        } catch (final Exception e) {
            logger.warn("Unable to resolve type for input string {}", typeString);
            return null;
        }
    }

    public String getDescription() {
        return this.description;
    }

}
