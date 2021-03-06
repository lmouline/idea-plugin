package org.kevoree.modeling.idea;

import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;
import org.jetbrains.annotations.NotNull;
import org.kevoree.modeling.MetaModelLanguageType;

public class MetaModelFileTypeFactory extends FileTypeFactory {
    @Override
    public void createFileTypes(@NotNull FileTypeConsumer fileTypeConsumer) {
        fileTypeConsumer.consume(MetaModelLanguageType.INSTANCE, MetaModelLanguageType.INSTANCE.getDefaultExtension());
    }
}
