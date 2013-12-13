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

package com.microsoft.windowsazure.management.compute.models;

import com.microsoft.windowsazure.management.OperationResponse;
import java.net.URI;

/**
* The Get Data Disk operation response.
*/
public class VirtualMachineDiskGetDataDiskResponse extends OperationResponse
{
    private String diskLabel;
    
    /**
    * The description of the data disk.
    */
    public String getDiskLabel() { return this.diskLabel; }
    
    /**
    * The description of the data disk.
    */
    public void setDiskLabel(String diskLabel) { this.diskLabel = diskLabel; }
    
    private String diskName;
    
    /**
    * The name of the data disk.
    */
    public String getDiskName() { return this.diskName; }
    
    /**
    * The name of the data disk.
    */
    public void setDiskName(String diskName) { this.diskName = diskName; }
    
    private VirtualHardDiskHostCaching hostCaching;
    
    /**
    * The current value of the platform caching behavior of data disk blob for
    * read/write efficiency. Possible values are: None, ReadOnly, ReadWrite.
    */
    public VirtualHardDiskHostCaching getHostCaching() { return this.hostCaching; }
    
    /**
    * The current value of the platform caching behavior of data disk blob for
    * read/write efficiency. Possible values are: None, ReadOnly, ReadWrite.
    */
    public void setHostCaching(VirtualHardDiskHostCaching hostCaching) { this.hostCaching = hostCaching; }
    
    private double logicalDiskSizeInGB;
    
    /**
    * The size, in GB, of the data disk.
    */
    public double getLogicalDiskSizeInGB() { return this.logicalDiskSizeInGB; }
    
    /**
    * The size, in GB, of the data disk.
    */
    public void setLogicalDiskSizeInGB(double logicalDiskSizeInGB) { this.logicalDiskSizeInGB = logicalDiskSizeInGB; }
    
    private Integer logicalUnitNumber;
    
    /**
    * The Logical Unit Number (LUN) for the disk. The LUN specifies the slot in
    * which the data drive appears when mounted for usage by the virtual
    * machine.
    */
    public Integer getLogicalUnitNumber() { return this.logicalUnitNumber; }
    
    /**
    * The Logical Unit Number (LUN) for the disk. The LUN specifies the slot in
    * which the data drive appears when mounted for usage by the virtual
    * machine.
    */
    public void setLogicalUnitNumber(Integer logicalUnitNumber) { this.logicalUnitNumber = logicalUnitNumber; }
    
    private URI mediaLinkUri;
    
    /**
    * The location of physical blob backing the data disk. The blob location is
    * in storage account in the subscription specified by the SubscriptionId
    * value in the operation call.
    */
    public URI getMediaLinkUri() { return this.mediaLinkUri; }
    
    /**
    * The location of physical blob backing the data disk. The blob location is
    * in storage account in the subscription specified by the SubscriptionId
    * value in the operation call.
    */
    public void setMediaLinkUri(URI mediaLinkUri) { this.mediaLinkUri = mediaLinkUri; }
    
    /**
    * Initializes a new instance of the VirtualMachineDiskGetDataDiskResponse
    * class.
    *
    */
    public VirtualMachineDiskGetDataDiskResponse()
    {
    }
}