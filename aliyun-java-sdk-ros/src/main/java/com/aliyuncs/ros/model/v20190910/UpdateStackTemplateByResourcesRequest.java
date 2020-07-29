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

package com.aliyuncs.ros.model.v20190910;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ros.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateStackTemplateByResourcesRequest extends RpcAcsRequest<UpdateStackTemplateByResourcesResponse> {
	   

	private String clientToken;

	private String stackId;

	private List<String> logicalResourceIds;

	private Boolean dryRun;

	private String templateFormat;
	public UpdateStackTemplateByResourcesRequest() {
		super("ROS", "2019-09-10", "UpdateStackTemplateByResources", "ros");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getStackId() {
		return this.stackId;
	}

	public void setStackId(String stackId) {
		this.stackId = stackId;
		if(stackId != null){
			putQueryParameter("StackId", stackId);
		}
	}

	public List<String> getLogicalResourceIds() {
		return this.logicalResourceIds;
	}

	public void setLogicalResourceIds(List<String> logicalResourceIds) {
		this.logicalResourceIds = logicalResourceIds;	
		if (logicalResourceIds != null) {
			for (int i = 0; i < logicalResourceIds.size(); i++) {
				putQueryParameter("LogicalResourceId." + (i + 1) , logicalResourceIds.get(i));
			}
		}	
	}

	public Boolean getDryRun() {
		return this.dryRun;
	}

	public void setDryRun(Boolean dryRun) {
		this.dryRun = dryRun;
		if(dryRun != null){
			putQueryParameter("DryRun", dryRun.toString());
		}
	}

	public String getTemplateFormat() {
		return this.templateFormat;
	}

	public void setTemplateFormat(String templateFormat) {
		this.templateFormat = templateFormat;
		if(templateFormat != null){
			putQueryParameter("TemplateFormat", templateFormat);
		}
	}

	@Override
	public Class<UpdateStackTemplateByResourcesResponse> getResponseClass() {
		return UpdateStackTemplateByResourcesResponse.class;
	}

}
