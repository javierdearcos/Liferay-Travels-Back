package com.liferay.travels.rest.internal.resource.v1_0;

import com.liferay.travels.rest.resource.v1_0.StageResource;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ServiceScope;

/**
 * @author Javier de Arcos
 */
@Component(
	properties = "OSGI-INF/liferay/rest/v1_0/stage.properties",
	scope = ServiceScope.PROTOTYPE, service = StageResource.class
)
public class StageResourceImpl extends BaseStageResourceImpl {
}