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

package com.aliyuncs.iot.transform.v20180120;

import com.aliyuncs.iot.model.v20180120.BatchUnbindProjectDevicesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchUnbindProjectDevicesResponseUnmarshaller {

	public static BatchUnbindProjectDevicesResponse unmarshall(BatchUnbindProjectDevicesResponse batchUnbindProjectDevicesResponse, UnmarshallerContext _ctx) {
		
		batchUnbindProjectDevicesResponse.setRequestId(_ctx.stringValue("BatchUnbindProjectDevicesResponse.RequestId"));
		batchUnbindProjectDevicesResponse.setSuccess(_ctx.booleanValue("BatchUnbindProjectDevicesResponse.Success"));
		batchUnbindProjectDevicesResponse.setCode(_ctx.stringValue("BatchUnbindProjectDevicesResponse.Code"));
		batchUnbindProjectDevicesResponse.setErrorMessage(_ctx.stringValue("BatchUnbindProjectDevicesResponse.ErrorMessage"));
		batchUnbindProjectDevicesResponse.setData(_ctx.booleanValue("BatchUnbindProjectDevicesResponse.Data"));
	 
	 	return batchUnbindProjectDevicesResponse;
	}
}