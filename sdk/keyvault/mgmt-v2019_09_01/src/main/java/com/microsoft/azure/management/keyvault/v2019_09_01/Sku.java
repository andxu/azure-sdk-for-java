/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.keyvault.v2019_09_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SKU details.
 */
public class Sku {
    /**
     * SKU family name.
     */
    @JsonProperty(value = "family", required = true)
    private String family;

    /**
     * SKU name to specify whether the key vault is a standard vault or a
     * premium vault. Possible values include: 'standard', 'premium'.
     */
    @JsonProperty(value = "name", required = true)
    private SkuName name;

    /**
     * Creates an instance of Sku class.
     * @param name sKU name to specify whether the key vault is a standard vault or a premium vault. Possible values include: 'standard', 'premium'.
     */
    public Sku() {
        family = "A";
    }

    /**
     * Get sKU family name.
     *
     * @return the family value
     */
    public String family() {
        return this.family;
    }

    /**
     * Set sKU family name.
     *
     * @param family the family value to set
     * @return the Sku object itself.
     */
    public Sku withFamily(String family) {
        this.family = family;
        return this;
    }

    /**
     * Get sKU name to specify whether the key vault is a standard vault or a premium vault. Possible values include: 'standard', 'premium'.
     *
     * @return the name value
     */
    public SkuName name() {
        return this.name;
    }

    /**
     * Set sKU name to specify whether the key vault is a standard vault or a premium vault. Possible values include: 'standard', 'premium'.
     *
     * @param name the name value to set
     * @return the Sku object itself.
     */
    public Sku withName(SkuName name) {
        this.name = name;
        return this;
    }

}
