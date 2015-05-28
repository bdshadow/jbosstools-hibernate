package org.hibernate.eclipse.console.extensionpoint;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.viewers.StructuredViewer;
import org.hibernate.eclipse.console.actions.ConsoleConfigReadyUseBaseAction;

public class ConfigurationActionsContributionHandler {

	private static final String ACTIONS_EP_ID = "org.hibernate.eclipse.console.actions"; //$NON-NLS-1$
	
	private Set<ConsoleConfigReadyUseBaseAction> extensionActions = new HashSet<ConsoleConfigReadyUseBaseAction>();
	
	public ConfigurationActionsContributionHandler(StructuredViewer selectionProvider) {
		IExtensionRegistry registry = Platform.getExtensionRegistry();
		IConfigurationElement[] config = registry.getConfigurationElementsFor(ACTIONS_EP_ID);
		try {
			for (IConfigurationElement element : config) {
				ConsoleConfigReadyUseBaseAction action = (ConsoleConfigReadyUseBaseAction)element.createExecutableExtension("class"); //$NON-NLS-1$
				action.init(selectionProvider);
				extensionActions.add(action);
			}
		}
		catch (CoreException reflectionException) {
			// log exception
		}
	}
	
	public Set<ConsoleConfigReadyUseBaseAction> getExtensions() {
		return this.extensionActions;
	}
}
