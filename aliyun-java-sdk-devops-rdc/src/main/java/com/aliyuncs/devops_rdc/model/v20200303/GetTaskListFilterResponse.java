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

package com.aliyuncs.devops_rdc.model.v20200303;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.devops_rdc.transform.v20200303.GetTaskListFilterResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetTaskListFilterResponse extends AcsResponse {

	private String errorMsg;

	private String requestId;

	private String errorCode;

	private String successful;

	private Object object;

	public String getErrorMsg() {
		return this.errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getSuccessful() {
		return this.successful;
	}

	public void setSuccessful(String successful) {
		this.successful = successful;
	}

	public Object getObject() {
		return this.object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public static class Object {

		private String nextPageToken;

		private Integer totalSize;

		private List<Task> result;

		public String getNextPageToken() {
			return this.nextPageToken;
		}

		public void setNextPageToken(String nextPageToken) {
			this.nextPageToken = nextPageToken;
		}

		public Integer getTotalSize() {
			return this.totalSize;
		}

		public void setTotalSize(Integer totalSize) {
			this.totalSize = totalSize;
		}

		public List<Task> getResult() {
			return this.result;
		}

		public void setResult(List<Task> result) {
			this.result = result;
		}

		public static class Task {

			private String id;

			private String creatorId;

			private String executorId;

			private String projectId;

			private String taskListId;

			private String organizationId;

			private String stageId;

			private String visible;

			private String updated;

			private String created;

			private Boolean isArchived;

			private Boolean isDone;

			private Boolean isTopInProject;

			private Integer priority;

			private Integer pos;

			private String startDate;

			private String dueDate;

			private String accomplished;

			private String note;

			private String content;

			private String recurrence;

			private String sourceId;

			private String sourceDate;

			private Integer commentsCount;

			private Integer attachmentsCount;

			private Integer likesCount;

			private Integer objectlinksCount;

			private Integer uniqueId;

			private String storyPoint;

			private Integer progress;

			private Integer rating;

			private Boolean isFavorite;

			private String scenariofFeldConfigId;

			private Integer shareStatus;

			private String sprintId;

			private String taskFlowStatusId;

			private String objectType;

			private String source;

			private String untilDate;

			private String taskId;

			private String sprint;

			private String parent;

			private String taskUniqueId;

			private List<Customfield> customfields;

			private List<String> ancestorIds;

			private List<String> labels;

			private List<String> tagIds;

			private List<String> involveMembers;

			private List<String> divisions;

			private WorkTime workTime;

			private Badges badges;

			private SubtaskCount subtaskCount;

			private Reminder reminder;

			private Creator creator;

			private Stage stage;

			private Executor executor;

			private TaskFlowStatus taskFlowStatus;

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getCreatorId() {
				return this.creatorId;
			}

			public void setCreatorId(String creatorId) {
				this.creatorId = creatorId;
			}

			public String getExecutorId() {
				return this.executorId;
			}

			public void setExecutorId(String executorId) {
				this.executorId = executorId;
			}

			public String getProjectId() {
				return this.projectId;
			}

			public void setProjectId(String projectId) {
				this.projectId = projectId;
			}

			public String getTaskListId() {
				return this.taskListId;
			}

			public void setTaskListId(String taskListId) {
				this.taskListId = taskListId;
			}

			public String getOrganizationId() {
				return this.organizationId;
			}

			public void setOrganizationId(String organizationId) {
				this.organizationId = organizationId;
			}

			public String getStageId() {
				return this.stageId;
			}

			public void setStageId(String stageId) {
				this.stageId = stageId;
			}

			public String getVisible() {
				return this.visible;
			}

			public void setVisible(String visible) {
				this.visible = visible;
			}

			public String getUpdated() {
				return this.updated;
			}

			public void setUpdated(String updated) {
				this.updated = updated;
			}

			public String getCreated() {
				return this.created;
			}

			public void setCreated(String created) {
				this.created = created;
			}

			public Boolean getIsArchived() {
				return this.isArchived;
			}

			public void setIsArchived(Boolean isArchived) {
				this.isArchived = isArchived;
			}

			public Boolean getIsDone() {
				return this.isDone;
			}

			public void setIsDone(Boolean isDone) {
				this.isDone = isDone;
			}

			public Boolean getIsTopInProject() {
				return this.isTopInProject;
			}

			public void setIsTopInProject(Boolean isTopInProject) {
				this.isTopInProject = isTopInProject;
			}

			public Integer getPriority() {
				return this.priority;
			}

			public void setPriority(Integer priority) {
				this.priority = priority;
			}

			public Integer getPos() {
				return this.pos;
			}

			public void setPos(Integer pos) {
				this.pos = pos;
			}

			public String getStartDate() {
				return this.startDate;
			}

			public void setStartDate(String startDate) {
				this.startDate = startDate;
			}

			public String getDueDate() {
				return this.dueDate;
			}

			public void setDueDate(String dueDate) {
				this.dueDate = dueDate;
			}

			public String getAccomplished() {
				return this.accomplished;
			}

			public void setAccomplished(String accomplished) {
				this.accomplished = accomplished;
			}

			public String getNote() {
				return this.note;
			}

			public void setNote(String note) {
				this.note = note;
			}

			public String getContent() {
				return this.content;
			}

			public void setContent(String content) {
				this.content = content;
			}

			public String getRecurrence() {
				return this.recurrence;
			}

			public void setRecurrence(String recurrence) {
				this.recurrence = recurrence;
			}

			public String getSourceId() {
				return this.sourceId;
			}

			public void setSourceId(String sourceId) {
				this.sourceId = sourceId;
			}

			public String getSourceDate() {
				return this.sourceDate;
			}

			public void setSourceDate(String sourceDate) {
				this.sourceDate = sourceDate;
			}

			public Integer getCommentsCount() {
				return this.commentsCount;
			}

			public void setCommentsCount(Integer commentsCount) {
				this.commentsCount = commentsCount;
			}

			public Integer getAttachmentsCount() {
				return this.attachmentsCount;
			}

			public void setAttachmentsCount(Integer attachmentsCount) {
				this.attachmentsCount = attachmentsCount;
			}

			public Integer getLikesCount() {
				return this.likesCount;
			}

			public void setLikesCount(Integer likesCount) {
				this.likesCount = likesCount;
			}

			public Integer getObjectlinksCount() {
				return this.objectlinksCount;
			}

			public void setObjectlinksCount(Integer objectlinksCount) {
				this.objectlinksCount = objectlinksCount;
			}

			public Integer getUniqueId() {
				return this.uniqueId;
			}

			public void setUniqueId(Integer uniqueId) {
				this.uniqueId = uniqueId;
			}

			public String getStoryPoint() {
				return this.storyPoint;
			}

			public void setStoryPoint(String storyPoint) {
				this.storyPoint = storyPoint;
			}

			public Integer getProgress() {
				return this.progress;
			}

			public void setProgress(Integer progress) {
				this.progress = progress;
			}

			public Integer getRating() {
				return this.rating;
			}

			public void setRating(Integer rating) {
				this.rating = rating;
			}

			public Boolean getIsFavorite() {
				return this.isFavorite;
			}

			public void setIsFavorite(Boolean isFavorite) {
				this.isFavorite = isFavorite;
			}

			public String getScenariofFeldConfigId() {
				return this.scenariofFeldConfigId;
			}

			public void setScenariofFeldConfigId(String scenariofFeldConfigId) {
				this.scenariofFeldConfigId = scenariofFeldConfigId;
			}

			public Integer getShareStatus() {
				return this.shareStatus;
			}

			public void setShareStatus(Integer shareStatus) {
				this.shareStatus = shareStatus;
			}

			public String getSprintId() {
				return this.sprintId;
			}

			public void setSprintId(String sprintId) {
				this.sprintId = sprintId;
			}

			public String getTaskFlowStatusId() {
				return this.taskFlowStatusId;
			}

			public void setTaskFlowStatusId(String taskFlowStatusId) {
				this.taskFlowStatusId = taskFlowStatusId;
			}

			public String getObjectType() {
				return this.objectType;
			}

			public void setObjectType(String objectType) {
				this.objectType = objectType;
			}

			public String getSource() {
				return this.source;
			}

			public void setSource(String source) {
				this.source = source;
			}

			public String getUntilDate() {
				return this.untilDate;
			}

			public void setUntilDate(String untilDate) {
				this.untilDate = untilDate;
			}

			public String getTaskId() {
				return this.taskId;
			}

			public void setTaskId(String taskId) {
				this.taskId = taskId;
			}

			public String getSprint() {
				return this.sprint;
			}

			public void setSprint(String sprint) {
				this.sprint = sprint;
			}

			public String getParent() {
				return this.parent;
			}

			public void setParent(String parent) {
				this.parent = parent;
			}

			public String getTaskUniqueId() {
				return this.taskUniqueId;
			}

			public void setTaskUniqueId(String taskUniqueId) {
				this.taskUniqueId = taskUniqueId;
			}

			public List<Customfield> getCustomfields() {
				return this.customfields;
			}

			public void setCustomfields(List<Customfield> customfields) {
				this.customfields = customfields;
			}

			public List<String> getAncestorIds() {
				return this.ancestorIds;
			}

			public void setAncestorIds(List<String> ancestorIds) {
				this.ancestorIds = ancestorIds;
			}

			public List<String> getLabels() {
				return this.labels;
			}

			public void setLabels(List<String> labels) {
				this.labels = labels;
			}

			public List<String> getTagIds() {
				return this.tagIds;
			}

			public void setTagIds(List<String> tagIds) {
				this.tagIds = tagIds;
			}

			public List<String> getInvolveMembers() {
				return this.involveMembers;
			}

			public void setInvolveMembers(List<String> involveMembers) {
				this.involveMembers = involveMembers;
			}

			public List<String> getDivisions() {
				return this.divisions;
			}

			public void setDivisions(List<String> divisions) {
				this.divisions = divisions;
			}

			public WorkTime getWorkTime() {
				return this.workTime;
			}

			public void setWorkTime(WorkTime workTime) {
				this.workTime = workTime;
			}

			public Badges getBadges() {
				return this.badges;
			}

			public void setBadges(Badges badges) {
				this.badges = badges;
			}

			public SubtaskCount getSubtaskCount() {
				return this.subtaskCount;
			}

			public void setSubtaskCount(SubtaskCount subtaskCount) {
				this.subtaskCount = subtaskCount;
			}

			public Reminder getReminder() {
				return this.reminder;
			}

			public void setReminder(Reminder reminder) {
				this.reminder = reminder;
			}

			public Creator getCreator() {
				return this.creator;
			}

			public void setCreator(Creator creator) {
				this.creator = creator;
			}

			public Stage getStage() {
				return this.stage;
			}

			public void setStage(Stage stage) {
				this.stage = stage;
			}

			public Executor getExecutor() {
				return this.executor;
			}

			public void setExecutor(Executor executor) {
				this.executor = executor;
			}

			public TaskFlowStatus getTaskFlowStatus() {
				return this.taskFlowStatus;
			}

			public void setTaskFlowStatus(TaskFlowStatus taskFlowStatus) {
				this.taskFlowStatus = taskFlowStatus;
			}

			public static class Customfield {

				private String customfieldId;

				private String type;

				private String values;

				private List<ValueItem> value;

				public String getCustomfieldId() {
					return this.customfieldId;
				}

				public void setCustomfieldId(String customfieldId) {
					this.customfieldId = customfieldId;
				}

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public String getValues() {
					return this.values;
				}

				public void setValues(String values) {
					this.values = values;
				}

				public List<ValueItem> getValue() {
					return this.value;
				}

				public void setValue(List<ValueItem> value) {
					this.value = value;
				}

				public static class ValueItem {

					private String id;

					private String title;

					public String getId() {
						return this.id;
					}

					public void setId(String id) {
						this.id = id;
					}

					public String getTitle() {
						return this.title;
					}

					public void setTitle(String title) {
						this.title = title;
					}
				}
			}

			public static class WorkTime {

				private Integer totalTime;

				private Integer usedTime;

				private String unit;

				public Integer getTotalTime() {
					return this.totalTime;
				}

				public void setTotalTime(Integer totalTime) {
					this.totalTime = totalTime;
				}

				public Integer getUsedTime() {
					return this.usedTime;
				}

				public void setUsedTime(Integer usedTime) {
					this.usedTime = usedTime;
				}

				public String getUnit() {
					return this.unit;
				}

				public void setUnit(String unit) {
					this.unit = unit;
				}
			}

			public static class Badges {

				private Integer objectlinksCount;

				private Integer commentsCount;

				private Integer attachmentsCount;

				private Integer likesCount;

				public Integer getObjectlinksCount() {
					return this.objectlinksCount;
				}

				public void setObjectlinksCount(Integer objectlinksCount) {
					this.objectlinksCount = objectlinksCount;
				}

				public Integer getCommentsCount() {
					return this.commentsCount;
				}

				public void setCommentsCount(Integer commentsCount) {
					this.commentsCount = commentsCount;
				}

				public Integer getAttachmentsCount() {
					return this.attachmentsCount;
				}

				public void setAttachmentsCount(Integer attachmentsCount) {
					this.attachmentsCount = attachmentsCount;
				}

				public Integer getLikesCount() {
					return this.likesCount;
				}

				public void setLikesCount(Integer likesCount) {
					this.likesCount = likesCount;
				}
			}

			public static class SubtaskCount {

				private Integer total;

				private Integer done;

				public Integer getTotal() {
					return this.total;
				}

				public void setTotal(Integer total) {
					this.total = total;
				}

				public Integer getDone() {
					return this.done;
				}

				public void setDone(Integer done) {
					this.done = done;
				}
			}

			public static class Reminder {

				private String type;

				private String date;

				private String creatorId;

				private List<String> members;

				private List<String> rules;

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public String getDate() {
					return this.date;
				}

				public void setDate(String date) {
					this.date = date;
				}

				public String getCreatorId() {
					return this.creatorId;
				}

				public void setCreatorId(String creatorId) {
					this.creatorId = creatorId;
				}

				public List<String> getMembers() {
					return this.members;
				}

				public void setMembers(List<String> members) {
					this.members = members;
				}

				public List<String> getRules() {
					return this.rules;
				}

				public void setRules(List<String> rules) {
					this.rules = rules;
				}
			}

			public static class Creator {

				private String id;

				private String name;

				private String avatarUrl;

				public String getId() {
					return this.id;
				}

				public void setId(String id) {
					this.id = id;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getAvatarUrl() {
					return this.avatarUrl;
				}

				public void setAvatarUrl(String avatarUrl) {
					this.avatarUrl = avatarUrl;
				}
			}

			public static class Stage {

				private String id;

				private String name;

				public String getId() {
					return this.id;
				}

				public void setId(String id) {
					this.id = id;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}
			}

			public static class Executor {

				private String id;

				private String name;

				private String avatarUrl;

				public String getId() {
					return this.id;
				}

				public void setId(String id) {
					this.id = id;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getAvatarUrl() {
					return this.avatarUrl;
				}

				public void setAvatarUrl(String avatarUrl) {
					this.avatarUrl = avatarUrl;
				}
			}

			public static class TaskFlowStatus {

				private String id;

				private String name;

				private String kind;

				private Integer pos;

				private String taskFlowId;

				public String getId() {
					return this.id;
				}

				public void setId(String id) {
					this.id = id;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getKind() {
					return this.kind;
				}

				public void setKind(String kind) {
					this.kind = kind;
				}

				public Integer getPos() {
					return this.pos;
				}

				public void setPos(Integer pos) {
					this.pos = pos;
				}

				public String getTaskFlowId() {
					return this.taskFlowId;
				}

				public void setTaskFlowId(String taskFlowId) {
					this.taskFlowId = taskFlowId;
				}
			}
		}
	}

	@Override
	public GetTaskListFilterResponse getInstance(UnmarshallerContext context) {
		return	GetTaskListFilterResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
