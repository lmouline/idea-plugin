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

public class MetaModelDeclarationImpl extends ASTWrapperPsiElement implements MetaModelDeclaration {

  public MetaModelDeclarationImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MetaModelVisitor visitor) {
    visitor.visitDeclaration(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MetaModelVisitor) accept((MetaModelVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public MetaModelClassDeclaration getClassDeclaration() {
    return findChildByClass(MetaModelClassDeclaration.class);
  }

  @Override
  @Nullable
  public MetaModelEnumDeclaration getEnumDeclaration() {
    return findChildByClass(MetaModelEnumDeclaration.class);
  }

  @Override
  @Nullable
  public MetaModelIndexDeclaration getIndexDeclaration() {
    return findChildByClass(MetaModelIndexDeclaration.class);
  }

}
