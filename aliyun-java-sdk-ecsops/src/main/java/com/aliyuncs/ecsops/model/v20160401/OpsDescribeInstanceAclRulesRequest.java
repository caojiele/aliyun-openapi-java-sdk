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

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecsops.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeInstanceAclRulesRequest extends RpcAcsRequest<OpsDescribeInstanceAclRulesResponse> {
	   

	private String ipProtocol;

	private String priority;

	private String type;

	private String pageNumber;

	private String instanceId;

	private String pageSize;

	private String auditParamStr;
	public OpsDescribeInstanceAclRulesRequest() {
		super("Ecsops", "2016-04-01", "OpsDescribeInstanceAclRules", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getIpProtocol() {
		return this.ipProtocol;
	}

	public void setIpProtocol(String ipProtocol) {
		this.ipProtocol = ipProtocol;
		if(ipProtocol != null){
			putQueryParameter("IpProtocol", ipProtocol);
		}
	}

	public String getPriority() {
		return this.priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
		if(priority != null){
			putQueryParameter("Priority", priority);
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type);
		}
	}

	public String getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(String pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize);
		}
	}

	public String getAuditParamStr() {
		return this.auditParamStr;
	}

	public void setAuditParamStr(String auditParamStr) {
		this.auditParamStr = auditParamStr;
		if(auditParamStr != null){
			putQueryParameter("AuditParamStr", auditParamStr);
		}
	}

	@Override
	public Class<OpsDescribeInstanceAclRulesResponse> getResponseClass() {
		return OpsDescribeInstanceAclRulesResponse.class;
	}

}
