/*
 * generated by Xtext
 */
package edu.iastate.cs.boa.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;

import edu.iastate.cs.boa.ui.syntaxcoloring.BoaAntlrTokenToAttributeIdMapper;
import edu.iastate.cs.boa.ui.syntaxcoloring.BoaHighlightingConfiguration;

/**
 * Use this class to register components to be used within the IDE.
 */
public class BoaUiModule extends edu.iastate.cs.boa.ui.AbstractBoaUiModule {
	public BoaUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}

	public Class<? extends DefaultHighlightingConfiguration> bindILexicalHighlightingConfiguration() {
		return BoaHighlightingConfiguration.class;
	}

	public Class<? extends DefaultAntlrTokenToAttributeIdMapper> bindAbstractAntlrTokenToAttributeIdMapper() {
		return BoaAntlrTokenToAttributeIdMapper.class;
	}
}
