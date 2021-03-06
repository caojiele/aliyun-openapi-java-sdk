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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsQueryUserQuotaCategoryResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryUserQuotaCategoryResponse.Category;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsQueryUserQuotaCategoryResponseUnmarshaller {

	public static OpsQueryUserQuotaCategoryResponse unmarshall(OpsQueryUserQuotaCategoryResponse opsQueryUserQuotaCategoryResponse, UnmarshallerContext _ctx) {
		
		opsQueryUserQuotaCategoryResponse.setRequestId(_ctx.stringValue("OpsQueryUserQuotaCategoryResponse.RequestId"));
		opsQueryUserQuotaCategoryResponse.setTotalCount(_ctx.integerValue("OpsQueryUserQuotaCategoryResponse.TotalCount"));
		opsQueryUserQuotaCategoryResponse.setPageNumber(_ctx.integerValue("OpsQueryUserQuotaCategoryResponse.PageNumber"));
		opsQueryUserQuotaCategoryResponse.setPageSize(_ctx.integerValue("OpsQueryUserQuotaCategoryResponse.PageSize"));
		opsQueryUserQuotaCategoryResponse.setNextToken(_ctx.stringValue("OpsQueryUserQuotaCategoryResponse.NextToken"));

		List<Category> categories = new ArrayList<Category>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryUserQuotaCategoryResponse.Categories.Length"); i++) {
			Category category = new Category();
			category.setId(_ctx.longValue("OpsQueryUserQuotaCategoryResponse.Categories["+ i +"].Id"));
			category.setGmtCreateStr(_ctx.stringValue("OpsQueryUserQuotaCategoryResponse.Categories["+ i +"].GmtCreateStr"));
			category.setGmtModifiedStr(_ctx.stringValue("OpsQueryUserQuotaCategoryResponse.Categories["+ i +"].GmtModifiedStr"));
			category.setRegionId(_ctx.stringValue("OpsQueryUserQuotaCategoryResponse.Categories["+ i +"].RegionId"));
			category.setZoneId(_ctx.stringValue("OpsQueryUserQuotaCategoryResponse.Categories["+ i +"].ZoneId"));
			category.setPayType(_ctx.integerValue("OpsQueryUserQuotaCategoryResponse.Categories["+ i +"].PayType"));
			category.setResourceType(_ctx.longValue("OpsQueryUserQuotaCategoryResponse.Categories["+ i +"].ResourceType"));
			category.setResourceName(_ctx.stringValue("OpsQueryUserQuotaCategoryResponse.Categories["+ i +"].ResourceName"));
			category.setNetworkType(_ctx.integerValue("OpsQueryUserQuotaCategoryResponse.Categories["+ i +"].NetworkType"));
			category.setQuotaUnit(_ctx.stringValue("OpsQueryUserQuotaCategoryResponse.Categories["+ i +"].QuotaUnit"));
			category.setCategoryName(_ctx.stringValue("OpsQueryUserQuotaCategoryResponse.Categories["+ i +"].CategoryName"));
			category.setCategoryId(_ctx.stringValue("OpsQueryUserQuotaCategoryResponse.Categories["+ i +"].CategoryId"));
			category.setReservedQuota(_ctx.longValue("OpsQueryUserQuotaCategoryResponse.Categories["+ i +"].ReservedQuota"));
			category.setBaseQuota(_ctx.longValue("OpsQueryUserQuotaCategoryResponse.Categories["+ i +"].BaseQuota"));
			category.setBurstQuota(_ctx.longValue("OpsQueryUserQuotaCategoryResponse.Categories["+ i +"].BurstQuota"));

			categories.add(category);
		}
		opsQueryUserQuotaCategoryResponse.setCategories(categories);
	 
	 	return opsQueryUserQuotaCategoryResponse;
	}
}