// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.search.documents.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Breaks text following the Unicode Text Segmentation rules. This tokenizer is
 * implemented using Apache Lucene.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata.type")
@JsonTypeName("#Microsoft.Azure.Search.StandardTokenizer")
@Fluent
public final class LuceneStandardTokenizer extends LexicalTokenizer {
    /*
     * The maximum token length. Default is 255. Tokens longer than the maximum
     * length are split.
     */
    @JsonProperty(value = "maxTokenLength")
    private Integer maxTokenLength;

    /**
     * Get the maxTokenLength property: The maximum token length. Default is
     * 255. Tokens longer than the maximum length are split.
     *
     * @return the maxTokenLength value.
     */
    public Integer getMaxTokenLength() {
        return this.maxTokenLength;
    }

    /**
     * Set the maxTokenLength property: The maximum token length. Default is
     * 255. Tokens longer than the maximum length are split.
     *
     * @param maxTokenLength the maxTokenLength value to set.
     * @return the LuceneStandardTokenizer object itself.
     */
    public LuceneStandardTokenizer setMaxTokenLength(Integer maxTokenLength) {
        this.maxTokenLength = maxTokenLength;
        return this;
    }
}