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

package com.aliyuncs.codeup.model.v20200414;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetBranchInfoRequest extends RoaAcsRequest<GetBranchInfoResponse> {
	   

	private String organizationId;

	private String subUserId;

	private String accessToken;

	private Long projectId;

	private String branchName;
	public GetBranchInfoRequest() {
		super("codeup", "2020-04-14", "GetBranchInfo");
		setUriPattern("/api/v3/projects/[ProjectId]/repository/branches/detail");
		setMethod(MethodType.GET);
	}

	public String getOrganizationId() {
		return this.organizationId;
	}

	public void setOrganizationId(String organizationId) {
		this.organizationId = organizationId;
		if(organizationId != null){
			putQueryParameter("OrganizationId", organizationId);
		}
	}

	public String getSubUserId() {
		return this.subUserId;
	}

	public void setSubUserId(String subUserId) {
		this.subUserId = subUserId;
		if(subUserId != null){
			putQueryParameter("SubUserId", subUserId);
		}
	}

	public String getAccessToken() {
		return this.accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
		if(accessToken != null){
			putQueryParameter("AccessToken", accessToken);
		}
	}

	public Long getProjectId() {
		return this.projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putPathParameter("ProjectId", projectId.toString());
		}
	}

	public String getBranchName() {
		return this.branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
		if(branchName != null){
			putQueryParameter("BranchName", branchName);
		}
	}

	@Override
	public Class<GetBranchInfoResponse> getResponseClass() {
		return GetBranchInfoResponse.class;
	}

}
