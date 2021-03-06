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
import com.aliyuncs.ecsops.transform.v20160401.OpsDescribeGlobalSecurityGroupResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeGlobalSecurityGroupResponse extends AcsResponse {

	private String requestId;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long id;

		private Long aliUid;

		private String bid;

		private String securityGroupId;

		private String securityGroupName;

		private String description;

		private String vpcId;

		private String createdTime;

		private String modifiedTime;

		private Integer ecsNum;

		private Boolean authed;

		private String type;

		private Integer groupType;

		private Boolean defaultGroup;

		private String regionNo;

		private List<String> ecsInstanceIds;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Long getAliUid() {
			return this.aliUid;
		}

		public void setAliUid(Long aliUid) {
			this.aliUid = aliUid;
		}

		public String getBid() {
			return this.bid;
		}

		public void setBid(String bid) {
			this.bid = bid;
		}

		public String getSecurityGroupId() {
			return this.securityGroupId;
		}

		public void setSecurityGroupId(String securityGroupId) {
			this.securityGroupId = securityGroupId;
		}

		public String getSecurityGroupName() {
			return this.securityGroupName;
		}

		public void setSecurityGroupName(String securityGroupName) {
			this.securityGroupName = securityGroupName;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getCreatedTime() {
			return this.createdTime;
		}

		public void setCreatedTime(String createdTime) {
			this.createdTime = createdTime;
		}

		public String getModifiedTime() {
			return this.modifiedTime;
		}

		public void setModifiedTime(String modifiedTime) {
			this.modifiedTime = modifiedTime;
		}

		public Integer getEcsNum() {
			return this.ecsNum;
		}

		public void setEcsNum(Integer ecsNum) {
			this.ecsNum = ecsNum;
		}

		public Boolean getAuthed() {
			return this.authed;
		}

		public void setAuthed(Boolean authed) {
			this.authed = authed;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public Integer getGroupType() {
			return this.groupType;
		}

		public void setGroupType(Integer groupType) {
			this.groupType = groupType;
		}

		public Boolean getDefaultGroup() {
			return this.defaultGroup;
		}

		public void setDefaultGroup(Boolean defaultGroup) {
			this.defaultGroup = defaultGroup;
		}

		public String getRegionNo() {
			return this.regionNo;
		}

		public void setRegionNo(String regionNo) {
			this.regionNo = regionNo;
		}

		public List<String> getEcsInstanceIds() {
			return this.ecsInstanceIds;
		}

		public void setEcsInstanceIds(List<String> ecsInstanceIds) {
			this.ecsInstanceIds = ecsInstanceIds;
		}
	}

	@Override
	public OpsDescribeGlobalSecurityGroupResponse getInstance(UnmarshallerContext context) {
		return	OpsDescribeGlobalSecurityGroupResponseUnmarshaller.unmarshall(this, context);
	}
}
