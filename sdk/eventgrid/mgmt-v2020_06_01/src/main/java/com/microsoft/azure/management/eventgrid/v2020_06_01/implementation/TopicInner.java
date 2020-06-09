/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventgrid.v2020_06_01.implementation;

import java.util.List;
import com.microsoft.azure.management.eventgrid.v2020_06_01.TopicProvisioningState;
import com.microsoft.azure.management.eventgrid.v2020_06_01.InputSchema;
import com.microsoft.azure.management.eventgrid.v2020_06_01.InputSchemaMapping;
import com.microsoft.azure.management.eventgrid.v2020_06_01.PublicNetworkAccess;
import com.microsoft.azure.management.eventgrid.v2020_06_01.InboundIpRule;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * EventGrid Topic.
 */
@JsonFlatten
public class TopicInner extends Resource {
    /**
     * The privateEndpointConnections property.
     */
    @JsonProperty(value = "properties.privateEndpointConnections")
    private List<PrivateEndpointConnectionInner> privateEndpointConnections;

    /**
     * Provisioning state of the topic. Possible values include: 'Creating',
     * 'Updating', 'Deleting', 'Succeeded', 'Canceled', 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private TopicProvisioningState provisioningState;

    /**
     * Endpoint for the topic.
     */
    @JsonProperty(value = "properties.endpoint", access = JsonProperty.Access.WRITE_ONLY)
    private String endpoint;

    /**
     * This determines the format that Event Grid should expect for incoming
     * events published to the topic. Possible values include:
     * 'EventGridSchema', 'CustomEventSchema', 'CloudEventSchemaV1_0'.
     */
    @JsonProperty(value = "properties.inputSchema")
    private InputSchema inputSchema;

    /**
     * This enables publishing using custom event schemas. An
     * InputSchemaMapping can be specified to map various properties of a
     * source schema to various required properties of the EventGridEvent
     * schema.
     */
    @JsonProperty(value = "properties.inputSchemaMapping")
    private InputSchemaMapping inputSchemaMapping;

    /**
     * Metric resource id for the topic.
     */
    @JsonProperty(value = "properties.metricResourceId", access = JsonProperty.Access.WRITE_ONLY)
    private String metricResourceId;

    /**
     * This determines if traffic is allowed over public network. By default it
     * is enabled.
     * You can further restrict to specific IPs by configuring &lt;seealso
     * cref="P:Microsoft.Azure.Events.ResourceProvider.Common.Contracts.TopicProperties.InboundIpRules"
     * /&gt;. Possible values include: 'Enabled', 'Disabled'.
     */
    @JsonProperty(value = "properties.publicNetworkAccess")
    private PublicNetworkAccess publicNetworkAccess;

    /**
     * This can be used to restrict traffic from specific IPs instead of all
     * IPs. Note: These are considered only if PublicNetworkAccess is enabled.
     */
    @JsonProperty(value = "properties.inboundIpRules")
    private List<InboundIpRule> inboundIpRules;

    /**
     * Get the privateEndpointConnections value.
     *
     * @return the privateEndpointConnections value
     */
    public List<PrivateEndpointConnectionInner> privateEndpointConnections() {
        return this.privateEndpointConnections;
    }

    /**
     * Set the privateEndpointConnections value.
     *
     * @param privateEndpointConnections the privateEndpointConnections value to set
     * @return the TopicInner object itself.
     */
    public TopicInner withPrivateEndpointConnections(List<PrivateEndpointConnectionInner> privateEndpointConnections) {
        this.privateEndpointConnections = privateEndpointConnections;
        return this;
    }

    /**
     * Get provisioning state of the topic. Possible values include: 'Creating', 'Updating', 'Deleting', 'Succeeded', 'Canceled', 'Failed'.
     *
     * @return the provisioningState value
     */
    public TopicProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get endpoint for the topic.
     *
     * @return the endpoint value
     */
    public String endpoint() {
        return this.endpoint;
    }

    /**
     * Get this determines the format that Event Grid should expect for incoming events published to the topic. Possible values include: 'EventGridSchema', 'CustomEventSchema', 'CloudEventSchemaV1_0'.
     *
     * @return the inputSchema value
     */
    public InputSchema inputSchema() {
        return this.inputSchema;
    }

    /**
     * Set this determines the format that Event Grid should expect for incoming events published to the topic. Possible values include: 'EventGridSchema', 'CustomEventSchema', 'CloudEventSchemaV1_0'.
     *
     * @param inputSchema the inputSchema value to set
     * @return the TopicInner object itself.
     */
    public TopicInner withInputSchema(InputSchema inputSchema) {
        this.inputSchema = inputSchema;
        return this;
    }

    /**
     * Get this enables publishing using custom event schemas. An InputSchemaMapping can be specified to map various properties of a source schema to various required properties of the EventGridEvent schema.
     *
     * @return the inputSchemaMapping value
     */
    public InputSchemaMapping inputSchemaMapping() {
        return this.inputSchemaMapping;
    }

    /**
     * Set this enables publishing using custom event schemas. An InputSchemaMapping can be specified to map various properties of a source schema to various required properties of the EventGridEvent schema.
     *
     * @param inputSchemaMapping the inputSchemaMapping value to set
     * @return the TopicInner object itself.
     */
    public TopicInner withInputSchemaMapping(InputSchemaMapping inputSchemaMapping) {
        this.inputSchemaMapping = inputSchemaMapping;
        return this;
    }

    /**
     * Get metric resource id for the topic.
     *
     * @return the metricResourceId value
     */
    public String metricResourceId() {
        return this.metricResourceId;
    }

    /**
     * Get this determines if traffic is allowed over public network. By default it is enabled.
     You can further restrict to specific IPs by configuring &lt;seealso cref="P:Microsoft.Azure.Events.ResourceProvider.Common.Contracts.TopicProperties.InboundIpRules" /&gt;. Possible values include: 'Enabled', 'Disabled'.
     *
     * @return the publicNetworkAccess value
     */
    public PublicNetworkAccess publicNetworkAccess() {
        return this.publicNetworkAccess;
    }

    /**
     * Set this determines if traffic is allowed over public network. By default it is enabled.
     You can further restrict to specific IPs by configuring &lt;seealso cref="P:Microsoft.Azure.Events.ResourceProvider.Common.Contracts.TopicProperties.InboundIpRules" /&gt;. Possible values include: 'Enabled', 'Disabled'.
     *
     * @param publicNetworkAccess the publicNetworkAccess value to set
     * @return the TopicInner object itself.
     */
    public TopicInner withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        this.publicNetworkAccess = publicNetworkAccess;
        return this;
    }

    /**
     * Get this can be used to restrict traffic from specific IPs instead of all IPs. Note: These are considered only if PublicNetworkAccess is enabled.
     *
     * @return the inboundIpRules value
     */
    public List<InboundIpRule> inboundIpRules() {
        return this.inboundIpRules;
    }

    /**
     * Set this can be used to restrict traffic from specific IPs instead of all IPs. Note: These are considered only if PublicNetworkAccess is enabled.
     *
     * @param inboundIpRules the inboundIpRules value to set
     * @return the TopicInner object itself.
     */
    public TopicInner withInboundIpRules(List<InboundIpRule> inboundIpRules) {
        this.inboundIpRules = inboundIpRules;
        return this;
    }

}