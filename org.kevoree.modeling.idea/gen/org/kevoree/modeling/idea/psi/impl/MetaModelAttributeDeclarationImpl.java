// This is a generated file. Not intended for manual editing.
package org.kevoree.modeling.idea.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.kevoree.modeling.idea.psi.MetaModelTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.kevoree.modeling.idea.psi.*;

public class MetaModelAttributeDeclarationImpl extends ASTWrapperPsiElement implements MetaModelAttributeDeclaration {

  public MetaModelAttributeDeclarationImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MetaModelVisitor visitor) {
    visitor.visitAttributeDeclaration(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MetaModelVisitor) accept((MetaModelVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public MetaModelAttributeName getAttributeName() {
    return findNotNullChildByClass(MetaModelAttributeName.class);
  }

  @Override
  @Nullable
  public MetaModelSemanticDeclr getSemanticDeclr() {
    return findChildByClass(MetaModelSemanticDeclr.class);
  }

  @Override
  @NotNull
  public MetaModelTypeDeclaration getTypeDeclaration() {
    return findNotNullChildByClass(MetaModelTypeDeclaration.class);
  }

}
