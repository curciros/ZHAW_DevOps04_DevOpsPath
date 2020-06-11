package ch.zhaw.iwi.adimed.service.interactionelement.list;

import com.google.inject.Inject;
import com.google.inject.Injector;

import ch.zhaw.iwi.adimed.model.interactionelement.list.ButtonListElement;
import ch.zhaw.iwi.adimed.service.AbstractCrudRestService;

public class ButtonListElementRestService extends AbstractCrudRestService<ButtonListElement, Long, ButtonListElementDatabaseService> {

	@Inject
	public ButtonListElementRestService(Injector injector) {
		super(injector, ButtonListElementDatabaseService.class);
	}

}
