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

package com.aliyuncs.ecsops.transform.v20160401;

import com.aliyuncs.ecsops.model.v20160401.OpsQueryDiagnoseFeedbackInfoResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryDiagnoseFeedbackInfoResponse.DiagnoseFeedbackInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsQueryDiagnoseFeedbackInfoResponseUnmarshaller {

	public static OpsQueryDiagnoseFeedbackInfoResponse unmarshall(OpsQueryDiagnoseFeedbackInfoResponse opsQueryDiagnoseFeedbackInfoResponse, UnmarshallerContext _ctx) {
		
		opsQueryDiagnoseFeedbackInfoResponse.setRequestId(_ctx.stringValue("OpsQueryDiagnoseFeedbackInfoResponse.RequestId"));
		opsQueryDiagnoseFeedbackInfoResponse.setFeedbackFlag(_ctx.stringValue("OpsQueryDiagnoseFeedbackInfoResponse.FeedbackFlag"));

		DiagnoseFeedbackInfo diagnoseFeedbackInfo = new DiagnoseFeedbackInfo();
		diagnoseFeedbackInfo.setMachineId(_ctx.stringValue("OpsQueryDiagnoseFeedbackInfoResponse.DiagnoseFeedbackInfo.MachineId"));
		diagnoseFeedbackInfo.setNcIp(_ctx.stringValue("OpsQueryDiagnoseFeedbackInfoResponse.DiagnoseFeedbackInfo.NcIp"));
		diagnoseFeedbackInfo.setSrcExceptionName(_ctx.stringValue("OpsQueryDiagnoseFeedbackInfoResponse.DiagnoseFeedbackInfo.SrcExceptionName"));
		diagnoseFeedbackInfo.setSrcExceptionType(_ctx.stringValue("OpsQueryDiagnoseFeedbackInfoResponse.DiagnoseFeedbackInfo.SrcExceptionType"));
		diagnoseFeedbackInfo.setSrcExceptionTime(_ctx.stringValue("OpsQueryDiagnoseFeedbackInfoResponse.DiagnoseFeedbackInfo.SrcExceptionTime"));
		diagnoseFeedbackInfo.setSrcReason(_ctx.stringValue("OpsQueryDiagnoseFeedbackInfoResponse.DiagnoseFeedbackInfo.SrcReason"));
		diagnoseFeedbackInfo.setSrcErrorDesc(_ctx.stringValue("OpsQueryDiagnoseFeedbackInfoResponse.DiagnoseFeedbackInfo.SrcErrorDesc"));
		diagnoseFeedbackInfo.setSrcTeams(_ctx.stringValue("OpsQueryDiagnoseFeedbackInfoResponse.DiagnoseFeedbackInfo.SrcTeams"));
		diagnoseFeedbackInfo.setCompareResult(_ctx.stringValue("OpsQueryDiagnoseFeedbackInfoResponse.DiagnoseFeedbackInfo.CompareResult"));
		diagnoseFeedbackInfo.setMatchedFeatures(_ctx.stringValue("OpsQueryDiagnoseFeedbackInfoResponse.DiagnoseFeedbackInfo.MatchedFeatures"));
		diagnoseFeedbackInfo.setSuggestExceptionName(_ctx.stringValue("OpsQueryDiagnoseFeedbackInfoResponse.DiagnoseFeedbackInfo.SuggestExceptionName"));
		diagnoseFeedbackInfo.setSuggestReason(_ctx.stringValue("OpsQueryDiagnoseFeedbackInfoResponse.DiagnoseFeedbackInfo.SuggestReason"));
		diagnoseFeedbackInfo.setSuggestErrorDesc(_ctx.stringValue("OpsQueryDiagnoseFeedbackInfoResponse.DiagnoseFeedbackInfo.SuggestErrorDesc"));
		diagnoseFeedbackInfo.setSuggestTeams(_ctx.stringValue("OpsQueryDiagnoseFeedbackInfoResponse.DiagnoseFeedbackInfo.SuggestTeams"));
		diagnoseFeedbackInfo.setSuggestOthers(_ctx.stringValue("OpsQueryDiagnoseFeedbackInfoResponse.DiagnoseFeedbackInfo.SuggestOthers"));
		diagnoseFeedbackInfo.setFeedbackUserId(_ctx.stringValue("OpsQueryDiagnoseFeedbackInfoResponse.DiagnoseFeedbackInfo.FeedbackUserId"));
		diagnoseFeedbackInfo.setFeedbackUserName(_ctx.stringValue("OpsQueryDiagnoseFeedbackInfoResponse.DiagnoseFeedbackInfo.FeedbackUserName"));
		diagnoseFeedbackInfo.setGmtCreated(_ctx.stringValue("OpsQueryDiagnoseFeedbackInfoResponse.DiagnoseFeedbackInfo.GmtCreated"));
		opsQueryDiagnoseFeedbackInfoResponse.setDiagnoseFeedbackInfo(diagnoseFeedbackInfo);
	 
	 	return opsQueryDiagnoseFeedbackInfoResponse;
	}
}