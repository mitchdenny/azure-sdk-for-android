// 
// Copyright (c) Microsoft and contributors.  All rights reserved.
// 
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//   http://www.apache.org/licenses/LICENSE-2.0
// 
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// 
// See the License for the specific language governing permissions and
// limitations under the License.
// 

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.windowsazure.management.servicebus.models;

import java.net.URI;
import java.util.Calendar;

/**
* A service bus namespace.
*/
public class ServiceBusNamespace
{
    private URI acsManagementEndpoint;
    
    /**
    * ACS endpoint you can use to obtain access tokens.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/jj873988.aspx for
    * more information)
    */
    public URI getAcsManagementEndpoint() { return this.acsManagementEndpoint; }
    
    /**
    * ACS endpoint you can use to obtain access tokens.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/jj873988.aspx for
    * more information)
    */
    public void setAcsManagementEndpoint(URI acsManagementEndpoint) { this.acsManagementEndpoint = acsManagementEndpoint; }
    
    private Calendar createdAt;
    
    /**
    * The time the namespace was created.
    */
    public Calendar getCreatedAt() { return this.createdAt; }
    
    /**
    * The time the namespace was created.
    */
    public void setCreatedAt(Calendar createdAt) { this.createdAt = createdAt; }
    
    private boolean enabled;
    
    /**
    * Whether or not the namespace is currently enabled.
    */
    public boolean getEnabled() { return this.enabled; }
    
    /**
    * Whether or not the namespace is currently enabled.
    */
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    
    private String name;
    
    /**
    * The name of the namespace.
    */
    public String getName() { return this.name; }
    
    /**
    * The name of the namespace.
    */
    public void setName(String name) { this.name = name; }
    
    private String region;
    
    /**
    * Specifies the targeted region in which the namespace should be created.
    * It can be any of the following values: East AsiaNorth EuropeWest
    * EuropeEast USSoutheast AsiaNorth Central USWest USSouth Central US  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/jj873988.aspx for
    * more information)
    */
    public String getRegion() { return this.region; }
    
    /**
    * Specifies the targeted region in which the namespace should be created.
    * It can be any of the following values: East AsiaNorth EuropeWest
    * EuropeEast USSoutheast AsiaNorth Central USWest USSouth Central US  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/jj873988.aspx for
    * more information)
    */
    public void setRegion(String region) { this.region = region; }
    
    private URI serviceBusEndpoint;
    
    /**
    * Endpoint you can use to perform messaging or relay operations.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/jj873988.aspx for
    * more information)
    */
    public URI getServiceBusEndpoint() { return this.serviceBusEndpoint; }
    
    /**
    * Endpoint you can use to perform messaging or relay operations.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/jj873988.aspx for
    * more information)
    */
    public void setServiceBusEndpoint(URI serviceBusEndpoint) { this.serviceBusEndpoint = serviceBusEndpoint; }
    
    private String status;
    
    /**
    * Status of the namespace. It can be any of these values:1 =
    * Created/Active2 = Creating3 = Suspended4 = Deleting  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/jj873988.aspx for
    * more information)
    */
    public String getStatus() { return this.status; }
    
    /**
    * Status of the namespace. It can be any of these values:1 =
    * Created/Active2 = Creating3 = Suspended4 = Deleting  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/jj873988.aspx for
    * more information)
    */
    public void setStatus(String status) { this.status = status; }
    
    private String subscriptionId;
    
    /**
    * The Id of the Azure subscription associated with the namespace.
    */
    public String getSubscriptionId() { return this.subscriptionId; }
    
    /**
    * The Id of the Azure subscription associated with the namespace.
    */
    public void setSubscriptionId(String subscriptionId) { this.subscriptionId = subscriptionId; }
    
    /**
    * Initializes a new instance of the ServiceBusNamespace class.
    *
    */
    public ServiceBusNamespace()
    {
    }
}