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

package com.aliyuncs.csb.model.v20171118;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.csb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class FindBrokerSLOHisListRequest extends RpcAcsRequest<FindBrokerSLOHisListResponse> {
	   

	private Long csbId;

	private String beginDdHHmm;

	private String endDdHHmm;
	public FindBrokerSLOHisListRequest() {
		super("CSB", "2017-11-18", "FindBrokerSLOHisList");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getCsbId() {
		return this.csbId;
	}

	public void setCsbId(Long csbId) {
		this.csbId = csbId;
		if(csbId != null){
			putQueryParameter("CsbId", csbId.toString());
		}
	}

	public String getBeginDdHHmm() {
		return this.beginDdHHmm;
	}

	public void setBeginDdHHmm(String beginDdHHmm) {
		this.beginDdHHmm = beginDdHHmm;
		if(beginDdHHmm != null){
			putQueryParameter("BeginDdHHmm", beginDdHHmm);
		}
	}

	public String getEndDdHHmm() {
		return this.endDdHHmm;
	}

	public void setEndDdHHmm(String endDdHHmm) {
		this.endDdHHmm = endDdHHmm;
		if(endDdHHmm != null){
			putQueryParameter("EndDdHHmm", endDdHHmm);
		}
	}

	@Override
	public Class<FindBrokerSLOHisListResponse> getResponseClass() {
		return FindBrokerSLOHisListResponse.class;
	}

}
