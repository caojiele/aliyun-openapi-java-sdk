/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsDetailInstanceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDetailInstanceResponse extends AcsResponse {

	private String requestId;

	private String regionId;

	private String zoneId;

	private String clusterId;

	private String instanceId;

	private Long resourceOwnerId;

	private String hostname;

	private String instanceName;

	private String description;

	private String status;

	private String businessStatus;

	private String houyiStatus;

	private String innerIpAddress;

	private String publicBindIpAddress;

	private String publicAssignIpAddress;

	private String publicAssignNatIpAddress;

	private String imageId;

	private String imageName;

	private Integer cores;

	private Integer mem;

	private Integer intranetRx;

	private Integer intranetTx;

	private Integer internetRx;

	private Integer internetTx;

	private String securityControl;

	private String systemDeviceCategory;

	private String vpcId;

	private String vswId;

	private String natIp;

	private String eip;

	private String eipId;

	private Integer eipBandwidth;

	private String netWorkType;

	private Boolean networkValidation;

	private Boolean ioOptimized;

	private String vlanId;

	private String ncId;

	private String rackId;

	private String instanceType;

	private Integer payType;

	private List<String> securityGroupIds;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getRegionId() {
		return this.regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
	}

	public String getHostname() {
		return this.hostname;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	public String getInstanceName() {
		return this.instanceName;
	}

	public void setInstanceName(String instanceName) {
		this.instanceName = instanceName;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getBusinessStatus() {
		return this.businessStatus;
	}

	public void setBusinessStatus(String businessStatus) {
		this.businessStatus = businessStatus;
	}

	public String getHouyiStatus() {
		return this.houyiStatus;
	}

	public void setHouyiStatus(String houyiStatus) {
		this.houyiStatus = houyiStatus;
	}

	public String getInnerIpAddress() {
		return this.innerIpAddress;
	}

	public void setInnerIpAddress(String innerIpAddress) {
		this.innerIpAddress = innerIpAddress;
	}

	public String getPublicBindIpAddress() {
		return this.publicBindIpAddress;
	}

	public void setPublicBindIpAddress(String publicBindIpAddress) {
		this.publicBindIpAddress = publicBindIpAddress;
	}

	public String getPublicAssignIpAddress() {
		return this.publicAssignIpAddress;
	}

	public void setPublicAssignIpAddress(String publicAssignIpAddress) {
		this.publicAssignIpAddress = publicAssignIpAddress;
	}

	public String getPublicAssignNatIpAddress() {
		return this.publicAssignNatIpAddress;
	}

	public void setPublicAssignNatIpAddress(String publicAssignNatIpAddress) {
		this.publicAssignNatIpAddress = publicAssignNatIpAddress;
	}

	public String getImageId() {
		return this.imageId;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
	}

	public String getImageName() {
		return this.imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public Integer getCores() {
		return this.cores;
	}

	public void setCores(Integer cores) {
		this.cores = cores;
	}

	public Integer getMem() {
		return this.mem;
	}

	public void setMem(Integer mem) {
		this.mem = mem;
	}

	public Integer getIntranetRx() {
		return this.intranetRx;
	}

	public void setIntranetRx(Integer intranetRx) {
		this.intranetRx = intranetRx;
	}

	public Integer getIntranetTx() {
		return this.intranetTx;
	}

	public void setIntranetTx(Integer intranetTx) {
		this.intranetTx = intranetTx;
	}

	public Integer getInternetRx() {
		return this.internetRx;
	}

	public void setInternetRx(Integer internetRx) {
		this.internetRx = internetRx;
	}

	public Integer getInternetTx() {
		return this.internetTx;
	}

	public void setInternetTx(Integer internetTx) {
		this.internetTx = internetTx;
	}

	public String getSecurityControl() {
		return this.securityControl;
	}

	public void setSecurityControl(String securityControl) {
		this.securityControl = securityControl;
	}

	public String getSystemDeviceCategory() {
		return this.systemDeviceCategory;
	}

	public void setSystemDeviceCategory(String systemDeviceCategory) {
		this.systemDeviceCategory = systemDeviceCategory;
	}

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
	}

	public String getVswId() {
		return this.vswId;
	}

	public void setVswId(String vswId) {
		this.vswId = vswId;
	}

	public String getNatIp() {
		return this.natIp;
	}

	public void setNatIp(String natIp) {
		this.natIp = natIp;
	}

	public String getEip() {
		return this.eip;
	}

	public void setEip(String eip) {
		this.eip = eip;
	}

	public String getEipId() {
		return this.eipId;
	}

	public void setEipId(String eipId) {
		this.eipId = eipId;
	}

	public Integer getEipBandwidth() {
		return this.eipBandwidth;
	}

	public void setEipBandwidth(Integer eipBandwidth) {
		this.eipBandwidth = eipBandwidth;
	}

	public String getNetWorkType() {
		return this.netWorkType;
	}

	public void setNetWorkType(String netWorkType) {
		this.netWorkType = netWorkType;
	}

	public Boolean getNetworkValidation() {
		return this.networkValidation;
	}

	public void setNetworkValidation(Boolean networkValidation) {
		this.networkValidation = networkValidation;
	}

	public Boolean getIoOptimized() {
		return this.ioOptimized;
	}

	public void setIoOptimized(Boolean ioOptimized) {
		this.ioOptimized = ioOptimized;
	}

	public String getVlanId() {
		return this.vlanId;
	}

	public void setVlanId(String vlanId) {
		this.vlanId = vlanId;
	}

	public String getNcId() {
		return this.ncId;
	}

	public void setNcId(String ncId) {
		this.ncId = ncId;
	}

	public String getRackId() {
		return this.rackId;
	}

	public void setRackId(String rackId) {
		this.rackId = rackId;
	}

	public String getInstanceType() {
		return this.instanceType;
	}

	public void setInstanceType(String instanceType) {
		this.instanceType = instanceType;
	}

	public Integer getPayType() {
		return this.payType;
	}

	public void setPayType(Integer payType) {
		this.payType = payType;
	}

	public List<String> getSecurityGroupIds() {
		return this.securityGroupIds;
	}

	public void setSecurityGroupIds(List<String> securityGroupIds) {
		this.securityGroupIds = securityGroupIds;
	}

	@Override
	public OpsDetailInstanceResponse getInstance(UnmarshallerContext context) {
		return	OpsDetailInstanceResponseUnmarshaller.unmarshall(this, context);
	}
}
