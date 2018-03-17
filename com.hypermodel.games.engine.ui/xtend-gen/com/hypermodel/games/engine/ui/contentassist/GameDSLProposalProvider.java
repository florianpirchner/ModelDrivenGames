/**
 * generated by Xtext 2.12.0
 */
package com.hypermodel.games.engine.ui.contentassist;

import com.hypermodel.games.engine.ui.contentassist.AbstractGameDSLProposalProvider;
import com.hypermodel.games.engine.ui.contentassist.DirTextApplier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ui.editor.contentassist.ConfigurableCompletionProposal;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;

/**
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#content-assist
 * on how to customize the content assistant.
 */
@SuppressWarnings("all")
public class GameDSLProposalProvider extends AbstractGameDSLProposalProvider {
  @Override
  protected boolean isKeywordWorthyToPropose(final Keyword keyword) {
    return true;
  }
  
  public void dirPickerProposal(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    ICompletionProposal _createCompletionProposal = this.createCompletionProposal("Select Android SDK directory...", context);
    ConfigurableCompletionProposal fileName = ((ConfigurableCompletionProposal) _createCompletionProposal);
    if ((fileName != null)) {
      DirTextApplier applier = new DirTextApplier();
      applier.setContext(context);
      fileName.setTextApplier(applier);
    }
    acceptor.accept(fileName);
  }
}