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

package com.liferay.lms.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link ModuleResultLocalService}.
 * </p>
 *
 * @author    TLS
 * @see       ModuleResultLocalService
 * @generated
 */
public class ModuleResultLocalServiceWrapper implements ModuleResultLocalService,
	ServiceWrapper<ModuleResultLocalService> {
	public ModuleResultLocalServiceWrapper(
		ModuleResultLocalService moduleResultLocalService) {
		_moduleResultLocalService = moduleResultLocalService;
	}

	/**
	* Adds the module result to the database. Also notifies the appropriate model listeners.
	*
	* @param moduleResult the module result
	* @return the module result that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.lms.model.ModuleResult addModuleResult(
		com.liferay.lms.model.ModuleResult moduleResult)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _moduleResultLocalService.addModuleResult(moduleResult);
	}

	/**
	* Creates a new module result with the primary key. Does not add the module result to the database.
	*
	* @param mrId the primary key for the new module result
	* @return the new module result
	*/
	public com.liferay.lms.model.ModuleResult createModuleResult(long mrId) {
		return _moduleResultLocalService.createModuleResult(mrId);
	}

	/**
	* Deletes the module result with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param mrId the primary key of the module result
	* @return the module result that was removed
	* @throws PortalException if a module result with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.lms.model.ModuleResult deleteModuleResult(long mrId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _moduleResultLocalService.deleteModuleResult(mrId);
	}

	/**
	* Deletes the module result from the database. Also notifies the appropriate model listeners.
	*
	* @param moduleResult the module result
	* @return the module result that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.lms.model.ModuleResult deleteModuleResult(
		com.liferay.lms.model.ModuleResult moduleResult)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _moduleResultLocalService.deleteModuleResult(moduleResult);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _moduleResultLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _moduleResultLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _moduleResultLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _moduleResultLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _moduleResultLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.liferay.lms.model.ModuleResult fetchModuleResult(long mrId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _moduleResultLocalService.fetchModuleResult(mrId);
	}

	/**
	* Returns the module result with the primary key.
	*
	* @param mrId the primary key of the module result
	* @return the module result
	* @throws PortalException if a module result with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.lms.model.ModuleResult getModuleResult(long mrId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _moduleResultLocalService.getModuleResult(mrId);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _moduleResultLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the module results.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of module results
	* @param end the upper bound of the range of module results (not inclusive)
	* @return the range of module results
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.lms.model.ModuleResult> getModuleResults(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _moduleResultLocalService.getModuleResults(start, end);
	}

	/**
	* Returns the number of module results.
	*
	* @return the number of module results
	* @throws SystemException if a system exception occurred
	*/
	public int getModuleResultsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _moduleResultLocalService.getModuleResultsCount();
	}

	/**
	* Updates the module result in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param moduleResult the module result
	* @return the module result that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.lms.model.ModuleResult updateModuleResult(
		com.liferay.lms.model.ModuleResult moduleResult)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _moduleResultLocalService.updateModuleResult(moduleResult);
	}

	/**
	* Updates the module result in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param moduleResult the module result
	* @param merge whether to merge the module result with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the module result that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.lms.model.ModuleResult updateModuleResult(
		com.liferay.lms.model.ModuleResult moduleResult, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _moduleResultLocalService.updateModuleResult(moduleResult, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _moduleResultLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_moduleResultLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _moduleResultLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	public com.liferay.lms.model.ModuleResult getByModuleAndUser(
		long moduleId, long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _moduleResultLocalService.getByModuleAndUser(moduleId, userId);
	}

	/**
	* No deberÃ¯Â¿Â½a haber nunca mÃ¯Â¿Â½s de un result para el mismo usuario y modulo.
	* Se hace para eliminar los duplicados.
	*
	* @param moduleId
	* @param userId
	* @return La lista de todos los moduleresult del usuario
	* @throws SystemException
	*/
	public java.util.List<com.liferay.lms.model.ModuleResult> getListModuleResultByModuleAndUser(
		long moduleId, long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _moduleResultLocalService.getListModuleResultByModuleAndUser(moduleId,
			userId);
	}

	public java.util.List<com.liferay.lms.model.ModuleResult> getByUserId(
		long userId) {
		return _moduleResultLocalService.getByUserId(userId);
	}

	public long countByModule(long moduleId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _moduleResultLocalService.countByModule(moduleId);
	}

	/**
	* Devuelve los estudiantes que han comenzado el mÃ¯Â¿Â½dulo. Si se tienen ya los ids de los usuarios excluidos (profesores y editores) se
	* deberÃ¯Â¿Â½ llamar a countByModuleOnlyStudents(long moduleId, long[] userIds)
	*
	* @param companyId id del company del curso
	* @param courseGroupCreatedId id del group del curso
	* @param moduleId id del mÃ¯Â¿Â½dulo del que queremos los estudiantes que han comenzado
	* @return nÃ¯Â¿Â½mero de estudiantes que han iniciado el mÃ¯Â¿Â½dulo
	* @throws SystemException
	*/
	public long countByModuleOnlyStudents(long companyId,
		long courseGroupCreatedId, long moduleId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _moduleResultLocalService.countByModuleOnlyStudents(companyId,
			courseGroupCreatedId, moduleId);
	}

	/**
	* @deprecated Deprecado por eficiencia, se debe llamar a los mÃ¯Â¿Â½todos countByModuleOnlyStudents(long companyId, long courseGroupCreatedId, long moduleId)
	o countByModuleOnlyStudents(long moduleId ,long[] userIds) ya que se calcula en base a los usuarios excluidos
	* @param companyId id del company del curso
	* @param courseGroupCreatedId id del group del curso
	* @param moduleId  id del mÃ¯Â¿Â½dulo del que queremos los estudiantes que han comenzado
	* @param _students Lista de estudiantes, si viene vacÃ¯Â¿Â½a se calcula dentro
	* @return nÃ¯Â¿Â½mero de estudiantes que han iniciado el modulo
	* @throws SystemException
	*/
	public long countByModuleOnlyStudents(long companyId,
		long courseGropupCreatedId, long moduleId,
		java.util.List<com.liferay.portal.model.User> _students)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _moduleResultLocalService.countByModuleOnlyStudents(companyId,
			courseGropupCreatedId, moduleId, _students);
	}

	public long countByModulePassed(long moduleId, boolean passed)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _moduleResultLocalService.countByModulePassed(moduleId, passed);
	}

	/**
	* Devuelve los estudiantes que han aprobado o suspendido (en el caso de suspenso no tiene en cuenta que hayan finalizado) el mÃ¯Â¿Â½dulo.
	* Si se tienen ya los ids de los usuarios excluidos (profesores y editores) se deberÃ¯Â¿Â½ llamar a
	* countByModulePassedOnlyStudents(long moduleId, boolean passed, long[] userIds)
	*
	* @param companyId id del company del curso
	* @param courseGroupCreatedId id del group del curso
	* @param moduleId id del mÃ¯Â¿Â½dulo del que queremos los estudiantes que han comenzado
	* @param passed Si queremos los que han aprobado el modulo o no
	* @return nÃ¯Â¿Â½mero de estudiantes que han aprobado el modulo (en caso de passed = true) o de los que lo han suspendido o todavÃ¯Â¿Â½a no lo han termiando (passed = false)
	* @throws SystemException
	*/
	public long countByModulePassedOnlyStudents(long companyId,
		long courseGroupCreatedId, long moduleId, boolean passed)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _moduleResultLocalService.countByModulePassedOnlyStudents(companyId,
			courseGroupCreatedId, moduleId, passed);
	}

	/**
	* @deprecated Deprecado por eficiencia, se debe llamar a los mÃ¯Â¿Â½todos countByModulePassedOnlyStudents(long companyId, long courseGroupCreatedId, long moduleId, boolean passed)
	o countByModulePassedOnlyStudents(long moduleId, boolean passed, long[] userIds) ya que se calcula en base a los usuarios excluidos
	* @param companyId id del company del curso
	* @param courseGroupCreatedId id del group del curso
	* @param moduleId  id del mÃ¯Â¿Â½dulo del que queremos los estudiantes
	* @param passed Si queremos los que han aprobado el modulo o no
	* @param _students Lista de estudiantes, si viene vacÃ¯Â¿Â½a se calcula dentro
	* @return nÃ¯Â¿Â½mero de estudiantes que han aprobado el curso (en caso de passed = true) o de los que lo han suspendido o todavÃ¯Â¿Â½a no lo han termiando (passed = false)
	* @throws SystemException
	*/
	public long countByModulePassedOnlyStudents(long companyId,
		long courseGroupCreatedId, long moduleId, boolean passed,
		java.util.List<com.liferay.portal.model.User> _students)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _moduleResultLocalService.countByModulePassedOnlyStudents(companyId,
			courseGroupCreatedId, moduleId, passed, _students);
	}

	/**
	* Devuelve los estudiantes que han aprobado o suspendido (en el caso de suspenso no tiene en cuenta que hayan finalizado o no) el mÃ¯Â¿Â½dulo.
	*
	* @param moduleId id del mÃ¯Â¿Â½dulo del que queremos los estudiantes
	* @param passed Si queremos los que han aprobado el modulo o no
	* @param userExcludedIds ids de usuarios excluidos (profesores y editores)
	* @return nÃ¯Â¿Â½mero de estudiantes que han aprobado el modulo (en caso de passed = true) o de los que lo han suspendido o todavÃ¯Â¿Â½a no lo han termiando (passed = false)
	* @throws SystemException
	*/
	public int countByModulePassedOnlyStudents(long moduleId, boolean passed,
		long[] userExcludedIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _moduleResultLocalService.countByModulePassedOnlyStudents(moduleId,
			passed, userExcludedIds);
	}

	/**
	* Cuenta los estudiantes que han iniciado el modulo: solo llamar si se tiene la lista de usuarios excluidos
	*
	* @param moduleId id del mÃ¯Â¿Â½dulo
	* @param userExcludedIds ids de usuarios excluidos (profesores y editores)
	* @return nÃ¯Â¿Â½mero de estudiantes que han comenzado el modulo
	* @throws SystemException
	*/
	public int countStudentsByModuleIdUserExcludedIdsStarted(long moduleId,
		long[] userExcludedIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _moduleResultLocalService.countStudentsByModuleIdUserExcludedIdsStarted(moduleId,
			userExcludedIds);
	}

	/**
	* Cuenta los estudiantes que han finalizado el modulo: solo llamar si se tiene la lista de usuarios excluidos
	*
	* @param moduleId id del mÃ¯Â¿Â½dulo
	* @param userExcludedIds ids de usuarios excluidos (profesores y editores)
	* @return nÃ¯Â¿Â½mero de estudiantes que han finalizado el mÃ¯Â¿Â½dulo
	* @throws SystemException
	*/
	public int countStudentsByModuleIdUserExcludedIdsFinished(long moduleId,
		long[] userExcludedIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _moduleResultLocalService.countStudentsByModuleIdUserExcludedIdsFinished(moduleId,
			userExcludedIds);
	}

	/**
	* Cuenta los estudiantes que han iniciado el modulo, esta funciÃ¯Â¿Â½n estÃ¯Â¿Â½ pensada para pasar una lista de estudiantes filtrada
	* (por ejemplo para los equipos) para pedir de todos los estudiantes usar countStudentsByModuleIdUserExcludedIdsStarted
	*
	* @param moduleId id del mÃ¯Â¿Â½dulo
	* @param userIds ids de los usuarios filtrados
	* @return nÃ¯Â¿Â½mero de estudiantes que han comenzado el modulo
	* @throws SystemException
	*/
	public int countStudentsByModuleIdUserIdsStarted(long moduleId,
		long[] userIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _moduleResultLocalService.countStudentsByModuleIdUserIdsStarted(moduleId,
			userIds);
	}

	/**
	* Cuenta los estudiantes que han finalizado el modulo, esta funciÃ¯Â¿Â½n estÃ¯Â¿Â½ pensada para pasar una lista de estudiantes filtrada
	* (por ejemplo para los equipos) para pedir de todos los estudiantes usar countStudentsByModuleIdUserExcludedIdsFinished
	*
	* @param moduleId id del mÃ¯Â¿Â½dulo
	* @param userIds ids de los usuarios filtrados
	* @return nÃ¯Â¿Â½mero de estudiantes que han finalizado el mÃ¯Â¿Â½dulo
	* @throws SystemException
	*/
	public int countStudentsByModuleIdUserIdsFinished(long moduleId,
		long[] userIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _moduleResultLocalService.countStudentsByModuleIdUserIdsFinished(moduleId,
			userIds);
	}

	/**
	* Cuenta los estudiantes que han finalizado el modulo y lo hayan aprobado
	*
	* @param moduleId id del mÃ¯Â¿Â½dulo
	* @param userExcludedIds ids de usuarios excluidos (profesores y editores)
	* @return nÃ¯Â¿Â½mero de estudiantes que han finalizado y aprobado el mÃ¯Â¿Â½dulo
	* @throws SystemException
	*/
	public int countStudentsByModuleIdUserExcludedIdsPassed(long moduleId,
		long[] userExcludedIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _moduleResultLocalService.countStudentsByModuleIdUserExcludedIdsPassed(moduleId,
			userExcludedIds);
	}

	/**
	* Cuenta los estudiantes que han finalizado el modulo y lo hayan suspendido
	*
	* @param moduleId id del mÃ¯Â¿Â½dulo
	* @param userExcludedIds ids de usuarios excluidos (profesores y editores)
	* @return nÃ¯Â¿Â½mero de estudiantes que han finalizado y suspendido el mÃ¯Â¿Â½dulo
	* @throws SystemException
	*/
	public int countStudentsByModuleIdUserExcludedIdsFailed(long moduleId,
		long[] userExcludedIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _moduleResultLocalService.countStudentsByModuleIdUserExcludedIdsFailed(moduleId,
			userExcludedIds);
	}

	public void update(com.liferay.lms.model.LearningActivityResult lactr)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_moduleResultLocalService.update(lactr);
	}

	public int updateAllUsers(long groupId, long moduleId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _moduleResultLocalService.updateAllUsers(groupId, moduleId);
	}

	public void updateAllCoursesAllModulesAllUsers()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_moduleResultLocalService.updateAllCoursesAllModulesAllUsers();
	}

	public boolean update(long moduleId, long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _moduleResultLocalService.update(moduleId, userId);
	}

	public java.util.Date calculateModuleResultStartDate(long moduleId,
		long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _moduleResultLocalService.calculateModuleResultStartDate(moduleId,
			userId);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public ModuleResultLocalService getWrappedModuleResultLocalService() {
		return _moduleResultLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedModuleResultLocalService(
		ModuleResultLocalService moduleResultLocalService) {
		_moduleResultLocalService = moduleResultLocalService;
	}

	public ModuleResultLocalService getWrappedService() {
		return _moduleResultLocalService;
	}

	public void setWrappedService(
		ModuleResultLocalService moduleResultLocalService) {
		_moduleResultLocalService = moduleResultLocalService;
	}

	private ModuleResultLocalService _moduleResultLocalService;
}