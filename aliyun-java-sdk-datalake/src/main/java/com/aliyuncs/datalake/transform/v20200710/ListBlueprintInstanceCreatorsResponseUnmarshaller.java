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

package com.aliyuncs.datalake.transform.v20200710;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.datalake.model.v20200710.ListBlueprintInstanceCreatorsResponse;
import com.aliyuncs.datalake.model.v20200710.ListBlueprintInstanceCreatorsResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListBlueprintInstanceCreatorsResponseUnmarshaller {

	public static ListBlueprintInstanceCreatorsResponse unmarshall(ListBlueprintInstanceCreatorsResponse listBlueprintInstanceCreatorsResponse, UnmarshallerContext _ctx) {
		
		listBlueprintInstanceCreatorsResponse.setRequestId(_ctx.stringValue("ListBlueprintInstanceCreatorsResponse.RequestId"));
		listBlueprintInstanceCreatorsResponse.setSuccess(_ctx.booleanValue("ListBlueprintInstanceCreatorsResponse.Success"));
		listBlueprintInstanceCreatorsResponse.setTotalCount(_ctx.integerValue("ListBlueprintInstanceCreatorsResponse.TotalCount"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListBlueprintInstanceCreatorsResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setCreator(_ctx.stringValue("ListBlueprintInstanceCreatorsResponse.Data["+ i +"].Creator"));
			dataItem.setCreatorLoginName(_ctx.stringValue("ListBlueprintInstanceCreatorsResponse.Data["+ i +"].CreatorLoginName"));

			data.add(dataItem);
		}
		listBlueprintInstanceCreatorsResponse.setData(data);
	 
	 	return listBlueprintInstanceCreatorsResponse;
	}
}