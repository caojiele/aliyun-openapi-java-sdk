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
public class OpsDescribeBusinessPropertiesRequest extends RpcAcsRequest<OpsDescribeBusinessPropertiesResponse> {
	   

	private Long businessId;

	private String propertyCode;

	private String auditParamStr;
	public OpsDescribeBusinessPropertiesRequest() {
		super("Ecsops", "2016-04-01", "OpsDescribeBusinessProperties", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getBusinessId() {
		return this.businessId;
	}

	public void setBusinessId(Long businessId) {
		this.businessId = businessId;
		if(businessId != null){
			putQueryParameter("BusinessId", businessId.toString());
		}
	}

	public String getPropertyCode() {
		return this.propertyCode;
	}

	public void setPropertyCode(String propertyCode) {
		this.propertyCode = propertyCode;
		if(propertyCode != null){
			putQueryParameter("PropertyCode", propertyCode);
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
	public Class<OpsDescribeBusinessPropertiesResponse> getResponseClass() {
		return OpsDescribeBusinessPropertiesResponse.class;
	}

}
