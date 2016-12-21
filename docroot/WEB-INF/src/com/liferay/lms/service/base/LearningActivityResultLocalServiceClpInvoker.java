/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.lms.service.base;

import com.liferay.lms.service.LearningActivityResultLocalServiceUtil;

import java.util.Arrays;

/**
 * @author Brian Wing Shun Chan
 */
public class LearningActivityResultLocalServiceClpInvoker {
	public LearningActivityResultLocalServiceClpInvoker() {
		_methodName0 = "addLearningActivityResult";

		_methodParameterTypes0 = new String[] {
				"com.liferay.lms.model.LearningActivityResult"
			};

		_methodName1 = "createLearningActivityResult";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deleteLearningActivityResult";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deleteLearningActivityResult";

		_methodParameterTypes3 = new String[] {
				"com.liferay.lms.model.LearningActivityResult"
			};

		_methodName4 = "dynamicQuery";

		_methodParameterTypes4 = new String[] {  };

		_methodName5 = "dynamicQuery";

		_methodParameterTypes5 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery"
			};

		_methodName6 = "dynamicQuery";

		_methodParameterTypes6 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int"
			};

		_methodName7 = "dynamicQuery";

		_methodParameterTypes7 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName8 = "dynamicQueryCount";

		_methodParameterTypes8 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery"
			};

		_methodName9 = "fetchLearningActivityResult";

		_methodParameterTypes9 = new String[] { "long" };

		_methodName10 = "getLearningActivityResult";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "getPersistedModel";

		_methodParameterTypes11 = new String[] { "java.io.Serializable" };

		_methodName12 = "getLearningActivityResults";

		_methodParameterTypes12 = new String[] { "int", "int" };

		_methodName13 = "getLearningActivityResultsCount";

		_methodParameterTypes13 = new String[] {  };

		_methodName14 = "updateLearningActivityResult";

		_methodParameterTypes14 = new String[] {
				"com.liferay.lms.model.LearningActivityResult"
			};

		_methodName15 = "updateLearningActivityResult";

		_methodParameterTypes15 = new String[] {
				"com.liferay.lms.model.LearningActivityResult", "boolean"
			};

		_methodName150 = "getBeanIdentifier";

		_methodParameterTypes150 = new String[] {  };

		_methodName151 = "setBeanIdentifier";

		_methodParameterTypes151 = new String[] { "java.lang.String" };

		_methodName156 = "update";

		_methodParameterTypes156 = new String[] {
				"com.liferay.lms.model.LearningActivityTry"
			};

		_methodName157 = "update";

		_methodParameterTypes157 = new String[] {
				"long", "long", "java.lang.String", "long"
			};

		_methodName158 = "update";

		_methodParameterTypes158 = new String[] {
				"long", "java.lang.String", "long"
			};

		_methodName159 = "update";

		_methodParameterTypes159 = new String[] {
				"long", "java.lang.String", "java.lang.String", "long"
			};

		_methodName160 = "existsLearningActivityResult";

		_methodParameterTypes160 = new String[] { "long", "long" };

		_methodName161 = "userPassed";

		_methodParameterTypes161 = new String[] { "long", "long" };

		_methodName162 = "countPassed";

		_methodParameterTypes162 = new String[] { "long" };

		_methodName163 = "countByActId";

		_methodParameterTypes163 = new String[] { "long" };

		_methodName164 = "countPassedOnlyStudents";

		_methodParameterTypes164 = new String[] {
				"long", "long", "long", "boolean"
			};

		_methodName165 = "countPassedOnlyStudents";

		_methodParameterTypes165 = new String[] {
				"long", "long", "long", "boolean", "java.util.List"
			};

		_methodName166 = "countNotPassed";

		_methodParameterTypes166 = new String[] { "long" };

		_methodName167 = "countNotPassedOnlyStudents";

		_methodParameterTypes167 = new String[] { "long", "long", "long" };

		_methodName168 = "countNotPassedOnlyStudents";

		_methodParameterTypes168 = new String[] {
				"long", "long", "long", "java.util.List"
			};

		_methodName169 = "avgResult";

		_methodParameterTypes169 = new String[] { "long" };

		_methodName170 = "avgResultOnlyStudents";

		_methodParameterTypes170 = new String[] { "long", "long", "long" };

		_methodName171 = "avgResultOnlyStudents";

		_methodParameterTypes171 = new String[] {
				"long", "long", "long", "java.util.List"
			};

		_methodName172 = "avgResultByActIdUserExcludedIds";

		_methodParameterTypes172 = new String[] { "long", "long[][]" };

		_methodName173 = "avgResultByActIdUserIds";

		_methodParameterTypes173 = new String[] { "long", "long[][]" };

		_methodName174 = "countStarted";

		_methodParameterTypes174 = new String[] { "long" };

		_methodName175 = "countStartedOnlyStudents";

		_methodParameterTypes175 = new String[] { "long", "long", "long" };

		_methodName176 = "countStartedOnlyStudents";

		_methodParameterTypes176 = new String[] {
				"long", "long", "long", "java.util.List"
			};

		_methodName177 = "countFinishedOnlyStudents";

		_methodParameterTypes177 = new String[] { "long", "long", "long" };

		_methodName178 = "countFinishedOnlyStudents";

		_methodParameterTypes178 = new String[] {
				"long", "long", "long", "java.util.List"
			};

		_methodName179 = "triesPerUser";

		_methodParameterTypes179 = new String[] { "long" };

		_methodName180 = "triesPerUserOnlyStudents";

		_methodParameterTypes180 = new String[] { "long", "long", "long" };

		_methodName181 = "triesPerUserOnlyStudents";

		_methodParameterTypes181 = new String[] {
				"long", "long", "long", "java.util.List"
			};

		_methodName182 = "avgTriesByActIdUserExcludedIds";

		_methodParameterTypes182 = new String[] { "long", "long[][]" };

		_methodName183 = "avgTriesByActIdUserIds";

		_methodParameterTypes183 = new String[] { "long", "long[][]" };

		_methodName184 = "getByActIdAndUserId";

		_methodParameterTypes184 = new String[] { "long", "long" };

		_methodName185 = "getLastEndDateByUserId";

		_methodParameterTypes185 = new String[] { "long" };

		_methodName186 = "getByActId";

		_methodParameterTypes186 = new String[] { "long" };

		_methodName187 = "getByGroupIdUserId";

		_methodParameterTypes187 = new String[] { "long", "long" };

		_methodName188 = "getMandatoryByGroupIdUserId";

		_methodParameterTypes188 = new String[] { "long", "long" };

		_methodName189 = "getByModuleIdUserId";

		_methodParameterTypes189 = new String[] { "long", "long" };

		_methodName190 = "getByModuleIdUserIdPassed";

		_methodParameterTypes190 = new String[] { "long", "long" };

		_methodName191 = "getMandatoryByModuleIdUserIdPassed";

		_methodParameterTypes191 = new String[] { "long", "long" };

		_methodName192 = "getByUserId";

		_methodParameterTypes192 = new String[] { "long" };

		_methodName193 = "countMandatoryByModuleIdUserIdPassed";

		_methodParameterTypes193 = new String[] { "long", "long" };

		_methodName194 = "translateResult";

		_methodParameterTypes194 = new String[] {
				"java.util.Locale", "double", "long"
			};

		_methodName195 = "getCalificationTypeSuffix";

		_methodParameterTypes195 = new String[] {
				"java.util.Locale", "double", "long"
			};

		_methodName196 = "deleteLearningActivityResult";

		_methodParameterTypes196 = new String[] {
				"com.liferay.lms.model.LearningActivityResult"
			};

		_methodName197 = "countStudentsByActIdUserExcludedIdsStarted";

		_methodParameterTypes197 = new String[] { "long", "long[][]" };

		_methodName198 = "countStudentsByActIdUserExcludedIdsFinished";

		_methodParameterTypes198 = new String[] { "long", "long[][]" };

		_methodName199 = "countStudentsByActIdUserExcludedIdsPassed";

		_methodParameterTypes199 = new String[] { "long", "long[][]" };

		_methodName200 = "countStudentsByActIdUserExcludedIdsFailed";

		_methodParameterTypes200 = new String[] { "long", "long[][]" };

		_methodName201 = "countStudentsByActIdUserIdsStarted";

		_methodParameterTypes201 = new String[] { "long", "long[][]" };

		_methodName202 = "countStudentsByActIdUserIdsFinished";

		_methodParameterTypes202 = new String[] { "long", "long[][]" };

		_methodName203 = "countStudentsByActIdUserIdsPassed";

		_methodParameterTypes203 = new String[] { "long", "long[][]" };

		_methodName204 = "countStudentsByActIdUserIdsFailed";

		_methodParameterTypes204 = new String[] { "long", "long[][]" };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return LearningActivityResultLocalServiceUtil.addLearningActivityResult((com.liferay.lms.model.LearningActivityResult)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return LearningActivityResultLocalServiceUtil.createLearningActivityResult(((Long)arguments[0]).longValue());
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return LearningActivityResultLocalServiceUtil.deleteLearningActivityResult(((Long)arguments[0]).longValue());
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return LearningActivityResultLocalServiceUtil.deleteLearningActivityResult((com.liferay.lms.model.LearningActivityResult)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return LearningActivityResultLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return LearningActivityResultLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return LearningActivityResultLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return LearningActivityResultLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return LearningActivityResultLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return LearningActivityResultLocalServiceUtil.fetchLearningActivityResult(((Long)arguments[0]).longValue());
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return LearningActivityResultLocalServiceUtil.getLearningActivityResult(((Long)arguments[0]).longValue());
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return LearningActivityResultLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return LearningActivityResultLocalServiceUtil.getLearningActivityResults(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return LearningActivityResultLocalServiceUtil.getLearningActivityResultsCount();
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return LearningActivityResultLocalServiceUtil.updateLearningActivityResult((com.liferay.lms.model.LearningActivityResult)arguments[0]);
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return LearningActivityResultLocalServiceUtil.updateLearningActivityResult((com.liferay.lms.model.LearningActivityResult)arguments[0],
				((Boolean)arguments[1]).booleanValue());
		}

		if (_methodName150.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes150, parameterTypes)) {
			return LearningActivityResultLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName151.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes151, parameterTypes)) {
			LearningActivityResultLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);
		}

		if (_methodName156.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes156, parameterTypes)) {
			return LearningActivityResultLocalServiceUtil.update((com.liferay.lms.model.LearningActivityTry)arguments[0]);
		}

		if (_methodName157.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes157, parameterTypes)) {
			return LearningActivityResultLocalServiceUtil.update(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				(java.lang.String)arguments[2], ((Long)arguments[3]).longValue());
		}

		if (_methodName158.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes158, parameterTypes)) {
			return LearningActivityResultLocalServiceUtil.update(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1], ((Long)arguments[2]).longValue());
		}

		if (_methodName159.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes159, parameterTypes)) {
			return LearningActivityResultLocalServiceUtil.update(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1], (java.lang.String)arguments[2],
				((Long)arguments[3]).longValue());
		}

		if (_methodName160.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes160, parameterTypes)) {
			return LearningActivityResultLocalServiceUtil.existsLearningActivityResult(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName161.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes161, parameterTypes)) {
			return LearningActivityResultLocalServiceUtil.userPassed(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName162.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes162, parameterTypes)) {
			return LearningActivityResultLocalServiceUtil.countPassed(((Long)arguments[0]).longValue());
		}

		if (_methodName163.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes163, parameterTypes)) {
			return LearningActivityResultLocalServiceUtil.countByActId(((Long)arguments[0]).longValue());
		}

		if (_methodName164.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes164, parameterTypes)) {
			return LearningActivityResultLocalServiceUtil.countPassedOnlyStudents(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Long)arguments[2]).longValue(),
				((Boolean)arguments[3]).booleanValue());
		}

		if (_methodName165.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes165, parameterTypes)) {
			return LearningActivityResultLocalServiceUtil.countPassedOnlyStudents(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Long)arguments[2]).longValue(),
				((Boolean)arguments[3]).booleanValue(),
				(java.util.List<com.liferay.portal.model.User>)arguments[4]);
		}

		if (_methodName166.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes166, parameterTypes)) {
			return LearningActivityResultLocalServiceUtil.countNotPassed(((Long)arguments[0]).longValue());
		}

		if (_methodName167.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes167, parameterTypes)) {
			return LearningActivityResultLocalServiceUtil.countNotPassedOnlyStudents(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Long)arguments[2]).longValue());
		}

		if (_methodName168.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes168, parameterTypes)) {
			return LearningActivityResultLocalServiceUtil.countNotPassedOnlyStudents(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Long)arguments[2]).longValue(),
				(java.util.List<com.liferay.portal.model.User>)arguments[3]);
		}

		if (_methodName169.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes169, parameterTypes)) {
			return LearningActivityResultLocalServiceUtil.avgResult(((Long)arguments[0]).longValue());
		}

		if (_methodName170.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes170, parameterTypes)) {
			return LearningActivityResultLocalServiceUtil.avgResultOnlyStudents(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Long)arguments[2]).longValue());
		}

		if (_methodName171.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes171, parameterTypes)) {
			return LearningActivityResultLocalServiceUtil.avgResultOnlyStudents(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Long)arguments[2]).longValue(),
				(java.util.List<com.liferay.portal.model.User>)arguments[3]);
		}

		if (_methodName172.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes172, parameterTypes)) {
			return LearningActivityResultLocalServiceUtil.avgResultByActIdUserExcludedIds(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);
		}

		if (_methodName173.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes173, parameterTypes)) {
			return LearningActivityResultLocalServiceUtil.avgResultByActIdUserIds(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);
		}

		if (_methodName174.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes174, parameterTypes)) {
			return LearningActivityResultLocalServiceUtil.countStarted(((Long)arguments[0]).longValue());
		}

		if (_methodName175.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes175, parameterTypes)) {
			return LearningActivityResultLocalServiceUtil.countStartedOnlyStudents(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Long)arguments[2]).longValue());
		}

		if (_methodName176.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes176, parameterTypes)) {
			return LearningActivityResultLocalServiceUtil.countStartedOnlyStudents(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Long)arguments[2]).longValue(),
				(java.util.List<com.liferay.portal.model.User>)arguments[3]);
		}

		if (_methodName177.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes177, parameterTypes)) {
			return LearningActivityResultLocalServiceUtil.countFinishedOnlyStudents(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Long)arguments[2]).longValue());
		}

		if (_methodName178.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes178, parameterTypes)) {
			return LearningActivityResultLocalServiceUtil.countFinishedOnlyStudents(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Long)arguments[2]).longValue(),
				(java.util.List<com.liferay.portal.model.User>)arguments[3]);
		}

		if (_methodName179.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes179, parameterTypes)) {
			return LearningActivityResultLocalServiceUtil.triesPerUser(((Long)arguments[0]).longValue());
		}

		if (_methodName180.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes180, parameterTypes)) {
			return LearningActivityResultLocalServiceUtil.triesPerUserOnlyStudents(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Long)arguments[2]).longValue());
		}

		if (_methodName181.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes181, parameterTypes)) {
			return LearningActivityResultLocalServiceUtil.triesPerUserOnlyStudents(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Long)arguments[2]).longValue(),
				(java.util.List<com.liferay.portal.model.User>)arguments[3]);
		}

		if (_methodName182.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes182, parameterTypes)) {
			return LearningActivityResultLocalServiceUtil.avgTriesByActIdUserExcludedIds(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);
		}

		if (_methodName183.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes183, parameterTypes)) {
			return LearningActivityResultLocalServiceUtil.avgTriesByActIdUserIds(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);
		}

		if (_methodName184.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes184, parameterTypes)) {
			return LearningActivityResultLocalServiceUtil.getByActIdAndUserId(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName185.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes185, parameterTypes)) {
			return LearningActivityResultLocalServiceUtil.getLastEndDateByUserId(((Long)arguments[0]).longValue());
		}

		if (_methodName186.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes186, parameterTypes)) {
			return LearningActivityResultLocalServiceUtil.getByActId(((Long)arguments[0]).longValue());
		}

		if (_methodName187.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes187, parameterTypes)) {
			return LearningActivityResultLocalServiceUtil.getByGroupIdUserId(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName188.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes188, parameterTypes)) {
			return LearningActivityResultLocalServiceUtil.getMandatoryByGroupIdUserId(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName189.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes189, parameterTypes)) {
			return LearningActivityResultLocalServiceUtil.getByModuleIdUserId(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName190.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes190, parameterTypes)) {
			return LearningActivityResultLocalServiceUtil.getByModuleIdUserIdPassed(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName191.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes191, parameterTypes)) {
			return LearningActivityResultLocalServiceUtil.getMandatoryByModuleIdUserIdPassed(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName192.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes192, parameterTypes)) {
			return LearningActivityResultLocalServiceUtil.getByUserId(((Long)arguments[0]).longValue());
		}

		if (_methodName193.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes193, parameterTypes)) {
			return LearningActivityResultLocalServiceUtil.countMandatoryByModuleIdUserIdPassed(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName194.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes194, parameterTypes)) {
			return LearningActivityResultLocalServiceUtil.translateResult((java.util.Locale)arguments[0],
				((Double)arguments[1]).doubleValue(),
				((Long)arguments[2]).longValue());
		}

		if (_methodName195.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes195, parameterTypes)) {
			return LearningActivityResultLocalServiceUtil.getCalificationTypeSuffix((java.util.Locale)arguments[0],
				((Double)arguments[1]).doubleValue(),
				((Long)arguments[2]).longValue());
		}

		if (_methodName196.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes196, parameterTypes)) {
			return LearningActivityResultLocalServiceUtil.deleteLearningActivityResult((com.liferay.lms.model.LearningActivityResult)arguments[0]);
		}

		if (_methodName197.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes197, parameterTypes)) {
			return LearningActivityResultLocalServiceUtil.countStudentsByActIdUserExcludedIdsStarted(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);
		}

		if (_methodName198.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes198, parameterTypes)) {
			return LearningActivityResultLocalServiceUtil.countStudentsByActIdUserExcludedIdsFinished(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);
		}

		if (_methodName199.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes199, parameterTypes)) {
			return LearningActivityResultLocalServiceUtil.countStudentsByActIdUserExcludedIdsPassed(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);
		}

		if (_methodName200.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes200, parameterTypes)) {
			return LearningActivityResultLocalServiceUtil.countStudentsByActIdUserExcludedIdsFailed(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);
		}

		if (_methodName201.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes201, parameterTypes)) {
			return LearningActivityResultLocalServiceUtil.countStudentsByActIdUserIdsStarted(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);
		}

		if (_methodName202.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes202, parameterTypes)) {
			return LearningActivityResultLocalServiceUtil.countStudentsByActIdUserIdsFinished(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);
		}

		if (_methodName203.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes203, parameterTypes)) {
			return LearningActivityResultLocalServiceUtil.countStudentsByActIdUserIdsPassed(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);
		}

		if (_methodName204.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes204, parameterTypes)) {
			return LearningActivityResultLocalServiceUtil.countStudentsByActIdUserIdsFailed(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);
		}

		throw new UnsupportedOperationException();
	}

	private String _methodName0;
	private String[] _methodParameterTypes0;
	private String _methodName1;
	private String[] _methodParameterTypes1;
	private String _methodName2;
	private String[] _methodParameterTypes2;
	private String _methodName3;
	private String[] _methodParameterTypes3;
	private String _methodName4;
	private String[] _methodParameterTypes4;
	private String _methodName5;
	private String[] _methodParameterTypes5;
	private String _methodName6;
	private String[] _methodParameterTypes6;
	private String _methodName7;
	private String[] _methodParameterTypes7;
	private String _methodName8;
	private String[] _methodParameterTypes8;
	private String _methodName9;
	private String[] _methodParameterTypes9;
	private String _methodName10;
	private String[] _methodParameterTypes10;
	private String _methodName11;
	private String[] _methodParameterTypes11;
	private String _methodName12;
	private String[] _methodParameterTypes12;
	private String _methodName13;
	private String[] _methodParameterTypes13;
	private String _methodName14;
	private String[] _methodParameterTypes14;
	private String _methodName15;
	private String[] _methodParameterTypes15;
	private String _methodName150;
	private String[] _methodParameterTypes150;
	private String _methodName151;
	private String[] _methodParameterTypes151;
	private String _methodName156;
	private String[] _methodParameterTypes156;
	private String _methodName157;
	private String[] _methodParameterTypes157;
	private String _methodName158;
	private String[] _methodParameterTypes158;
	private String _methodName159;
	private String[] _methodParameterTypes159;
	private String _methodName160;
	private String[] _methodParameterTypes160;
	private String _methodName161;
	private String[] _methodParameterTypes161;
	private String _methodName162;
	private String[] _methodParameterTypes162;
	private String _methodName163;
	private String[] _methodParameterTypes163;
	private String _methodName164;
	private String[] _methodParameterTypes164;
	private String _methodName165;
	private String[] _methodParameterTypes165;
	private String _methodName166;
	private String[] _methodParameterTypes166;
	private String _methodName167;
	private String[] _methodParameterTypes167;
	private String _methodName168;
	private String[] _methodParameterTypes168;
	private String _methodName169;
	private String[] _methodParameterTypes169;
	private String _methodName170;
	private String[] _methodParameterTypes170;
	private String _methodName171;
	private String[] _methodParameterTypes171;
	private String _methodName172;
	private String[] _methodParameterTypes172;
	private String _methodName173;
	private String[] _methodParameterTypes173;
	private String _methodName174;
	private String[] _methodParameterTypes174;
	private String _methodName175;
	private String[] _methodParameterTypes175;
	private String _methodName176;
	private String[] _methodParameterTypes176;
	private String _methodName177;
	private String[] _methodParameterTypes177;
	private String _methodName178;
	private String[] _methodParameterTypes178;
	private String _methodName179;
	private String[] _methodParameterTypes179;
	private String _methodName180;
	private String[] _methodParameterTypes180;
	private String _methodName181;
	private String[] _methodParameterTypes181;
	private String _methodName182;
	private String[] _methodParameterTypes182;
	private String _methodName183;
	private String[] _methodParameterTypes183;
	private String _methodName184;
	private String[] _methodParameterTypes184;
	private String _methodName185;
	private String[] _methodParameterTypes185;
	private String _methodName186;
	private String[] _methodParameterTypes186;
	private String _methodName187;
	private String[] _methodParameterTypes187;
	private String _methodName188;
	private String[] _methodParameterTypes188;
	private String _methodName189;
	private String[] _methodParameterTypes189;
	private String _methodName190;
	private String[] _methodParameterTypes190;
	private String _methodName191;
	private String[] _methodParameterTypes191;
	private String _methodName192;
	private String[] _methodParameterTypes192;
	private String _methodName193;
	private String[] _methodParameterTypes193;
	private String _methodName194;
	private String[] _methodParameterTypes194;
	private String _methodName195;
	private String[] _methodParameterTypes195;
	private String _methodName196;
	private String[] _methodParameterTypes196;
	private String _methodName197;
	private String[] _methodParameterTypes197;
	private String _methodName198;
	private String[] _methodParameterTypes198;
	private String _methodName199;
	private String[] _methodParameterTypes199;
	private String _methodName200;
	private String[] _methodParameterTypes200;
	private String _methodName201;
	private String[] _methodParameterTypes201;
	private String _methodName202;
	private String[] _methodParameterTypes202;
	private String _methodName203;
	private String[] _methodParameterTypes203;
	private String _methodName204;
	private String[] _methodParameterTypes204;
}