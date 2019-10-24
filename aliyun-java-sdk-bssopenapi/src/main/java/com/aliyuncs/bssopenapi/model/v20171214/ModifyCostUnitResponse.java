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

package com.aliyuncs.bssopenapi.model.v20171214;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.bssopenapi.transform.v20171214.ModifyCostUnitResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ModifyCostUnitResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private List<DataItem> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private Long ownerUid;

		private Long unitId;

		private Boolean isSuccess;

		public Long getOwnerUid() {
			return this.ownerUid;
		}

		public void setOwnerUid(Long ownerUid) {
			this.ownerUid = ownerUid;
		}

		public Long getUnitId() {
			return this.unitId;
		}

		public void setUnitId(Long unitId) {
			this.unitId = unitId;
		}

		public Boolean getIsSuccess() {
			return this.isSuccess;
		}

		public void setIsSuccess(Boolean isSuccess) {
			this.isSuccess = isSuccess;
		}
	}

	@Override
	public ModifyCostUnitResponse getInstance(UnmarshallerContext context) {
		return	ModifyCostUnitResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
