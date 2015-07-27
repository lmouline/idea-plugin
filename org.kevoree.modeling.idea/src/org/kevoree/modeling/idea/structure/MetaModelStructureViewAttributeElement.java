package org.kevoree.modeling.idea.structure;

import com.intellij.ide.structureView.StructureViewTreeElement;
import com.intellij.ide.util.treeView.smartTree.SortableTreeElement;
import com.intellij.ide.util.treeView.smartTree.TreeElement;
import com.intellij.navigation.ItemPresentation;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.editor.ScrollType;
import com.intellij.util.PlatformIcons;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.kevoree.modeling.idea.psi.MetaModelAttributeDeclaration;
import org.kevoree.modeling.idea.psi.MetaModelRelationDeclaration;
import org.kevoree.modeling.util.PrimitiveTypes;

import javax.swing.*;

public class MetaModelStructureViewAttributeElement implements StructureViewTreeElement, SortableTreeElement {

    private MetaModelAttributeDeclaration attDecl;
    private Editor editor;
    private Icon myIcon = PlatformIcons.FIELD_ICON;
    private String simpleType;
    private boolean id = false;
    private boolean contained = false;

    public MetaModelStructureViewAttributeElement(MetaModelAttributeDeclaration attDecl, Editor editor) {
        this.attDecl = attDecl;
        this.editor = editor;
        simpleType = attDecl.getTypeDeclaration().getName().substring(attDecl.getTypeDeclaration().getName().lastIndexOf(".") + 1);
    }

    public boolean isAttribute() {
        return true;
    }

    public boolean isId() {
        return id;
    }

    public boolean isContained() {
        return contained;
    }

    @Override
    public Object getValue() {
        return attDecl;
    }

    @Override
    public void navigate(boolean b) {
        editor.getCaretModel().moveToOffset(attDecl.getTextOffset());
        editor.getScrollingModel().scrollToCaret(ScrollType.CENTER_UP);
    }


    @Override
    public boolean canNavigate() {
        return true;
    }

    @Override
    public boolean canNavigateToSource() {
        return true;
    }

    @NotNull
    @Override
    public ItemPresentation getPresentation() {
        return new ItemPresentation() {
            @Nullable
            @Override
            public String getPresentableText() {
                return attDecl.getAttributeName().getText() + " : " + simpleType;
            }

            @Nullable
            @Override
            public String getLocationString() {
                return null;
            }

            @Nullable
            @Override
            public Icon getIcon(boolean b) {
                return myIcon;
            }
        };
    }

    @Override
    public TreeElement[] getChildren() {
        return EMPTY_ARRAY;
    }

    @NotNull
    @Override
    public String getAlphaSortKey() {
        return attDecl.getAttributeName().getText();
    }
}