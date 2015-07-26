package de.espend.idea.php.toolbox.extension;

import com.intellij.codeInsight.lookup.LookupElement;
import com.intellij.psi.PsiElement;
import de.espend.idea.php.toolbox.provider.source.SourceContributorDeclarationHandlerParameter;
import de.espend.idea.php.toolbox.provider.source.SourceContributorParameter;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;

public interface SourceContributorInterface {

    @NotNull
    public Collection<LookupElement> getLookupElements(@NotNull SourceContributorParameter parameter);

    @NotNull
    public Collection<PsiElement> getPsiTargets(@NotNull SourceContributorDeclarationHandlerParameter parameter);

    @NotNull
    public String getName();

}