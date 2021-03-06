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

package com.aliyuncs.vcs.model.v20200515;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vcs.transform.v20200515.DescribeAiotPersonTableItemsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAiotPersonTableItemsResponse extends AcsResponse {

	private String message;

	private String requestId;

	private String code;

	private PersonTableItems personTableItems;

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public PersonTableItems getPersonTableItems() {
		return this.personTableItems;
	}

	public void setPersonTableItems(PersonTableItems personTableItems) {
		this.personTableItems = personTableItems;
	}

	public static class PersonTableItems {

		private Long totalNum;

		private Long pageSize;

		private Long pageNum;

		private List<PersonTableItemListItem> personTableItemList;

		public Long getTotalNum() {
			return this.totalNum;
		}

		public void setTotalNum(Long totalNum) {
			this.totalNum = totalNum;
		}

		public Long getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Long pageSize) {
			this.pageSize = pageSize;
		}

		public Long getPageNum() {
			return this.pageNum;
		}

		public void setPageNum(Long pageNum) {
			this.pageNum = pageNum;
		}

		public List<PersonTableItemListItem> getPersonTableItemList() {
			return this.personTableItemList;
		}

		public void setPersonTableItemList(List<PersonTableItemListItem> personTableItemList) {
			this.personTableItemList = personTableItemList;
		}

		public static class PersonTableItemListItem {

			private String personTableId;

			private Long identificationNum;

			private String personName;

			private String personId;

			private String remarks;

			private Long imageNum;

			private String lastChange;

			private String personCode;

			private List<IdentificationType> identificationList;

			private List<SubImageType> imageList;

			public String getPersonTableId() {
				return this.personTableId;
			}

			public void setPersonTableId(String personTableId) {
				this.personTableId = personTableId;
			}

			public Long getIdentificationNum() {
				return this.identificationNum;
			}

			public void setIdentificationNum(Long identificationNum) {
				this.identificationNum = identificationNum;
			}

			public String getPersonName() {
				return this.personName;
			}

			public void setPersonName(String personName) {
				this.personName = personName;
			}

			public String getPersonId() {
				return this.personId;
			}

			public void setPersonId(String personId) {
				this.personId = personId;
			}

			public String getRemarks() {
				return this.remarks;
			}

			public void setRemarks(String remarks) {
				this.remarks = remarks;
			}

			public Long getImageNum() {
				return this.imageNum;
			}

			public void setImageNum(Long imageNum) {
				this.imageNum = imageNum;
			}

			public String getLastChange() {
				return this.lastChange;
			}

			public void setLastChange(String lastChange) {
				this.lastChange = lastChange;
			}

			public String getPersonCode() {
				return this.personCode;
			}

			public void setPersonCode(String personCode) {
				this.personCode = personCode;
			}

			public List<IdentificationType> getIdentificationList() {
				return this.identificationList;
			}

			public void setIdentificationList(List<IdentificationType> identificationList) {
				this.identificationList = identificationList;
			}

			public List<SubImageType> getImageList() {
				return this.imageList;
			}

			public void setImageList(List<SubImageType> imageList) {
				this.imageList = imageList;
			}

			public static class IdentificationType {

				private Long type;

				private String number;

				public Long getType() {
					return this.type;
				}

				public void setType(Long type) {
					this.type = type;
				}

				public String getNumber() {
					return this.number;
				}

				public void setNumber(String number) {
					this.number = number;
				}
			}

			public static class SubImageType {

				private String type;

				private String storagePath;

				private Long size;

				private String deviceId;

				private String imageId;

				private String eventSort;

				private String data;

				private Long height;

				private String shotTime;

				private String fileFormat;

				private Long width;

				private FeatureInfo featureInfo;

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public String getStoragePath() {
					return this.storagePath;
				}

				public void setStoragePath(String storagePath) {
					this.storagePath = storagePath;
				}

				public Long getSize() {
					return this.size;
				}

				public void setSize(Long size) {
					this.size = size;
				}

				public String getDeviceId() {
					return this.deviceId;
				}

				public void setDeviceId(String deviceId) {
					this.deviceId = deviceId;
				}

				public String getImageId() {
					return this.imageId;
				}

				public void setImageId(String imageId) {
					this.imageId = imageId;
				}

				public String getEventSort() {
					return this.eventSort;
				}

				public void setEventSort(String eventSort) {
					this.eventSort = eventSort;
				}

				public String getData() {
					return this.data;
				}

				public void setData(String data) {
					this.data = data;
				}

				public Long getHeight() {
					return this.height;
				}

				public void setHeight(Long height) {
					this.height = height;
				}

				public String getShotTime() {
					return this.shotTime;
				}

				public void setShotTime(String shotTime) {
					this.shotTime = shotTime;
				}

				public String getFileFormat() {
					return this.fileFormat;
				}

				public void setFileFormat(String fileFormat) {
					this.fileFormat = fileFormat;
				}

				public Long getWidth() {
					return this.width;
				}

				public void setWidth(Long width) {
					this.width = width;
				}

				public FeatureInfo getFeatureInfo() {
					return this.featureInfo;
				}

				public void setFeatureInfo(FeatureInfo featureInfo) {
					this.featureInfo = featureInfo;
				}

				public static class FeatureInfo {

					private String tableId;

					private String algorithmType;

					private String objectId;

					private String imageId;

					private String algorithmVersion;

					private String featureData;

					private String vendor;

					public String getTableId() {
						return this.tableId;
					}

					public void setTableId(String tableId) {
						this.tableId = tableId;
					}

					public String getAlgorithmType() {
						return this.algorithmType;
					}

					public void setAlgorithmType(String algorithmType) {
						this.algorithmType = algorithmType;
					}

					public String getObjectId() {
						return this.objectId;
					}

					public void setObjectId(String objectId) {
						this.objectId = objectId;
					}

					public String getImageId() {
						return this.imageId;
					}

					public void setImageId(String imageId) {
						this.imageId = imageId;
					}

					public String getAlgorithmVersion() {
						return this.algorithmVersion;
					}

					public void setAlgorithmVersion(String algorithmVersion) {
						this.algorithmVersion = algorithmVersion;
					}

					public String getFeatureData() {
						return this.featureData;
					}

					public void setFeatureData(String featureData) {
						this.featureData = featureData;
					}

					public String getVendor() {
						return this.vendor;
					}

					public void setVendor(String vendor) {
						this.vendor = vendor;
					}
				}
			}
		}
	}

	@Override
	public DescribeAiotPersonTableItemsResponse getInstance(UnmarshallerContext context) {
		return	DescribeAiotPersonTableItemsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
