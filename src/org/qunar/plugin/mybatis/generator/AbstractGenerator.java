/*
 * Copyright (c) 2017 Qunar.com. All Rights Reserved.
 */
package org.qunar.plugin.mybatis.generator;

import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiElement;
import com.intellij.sql.psi.SqlElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.qunar.plugin.bean.ModuleSetting;
import org.qunar.plugin.util.Modules;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * mybatis mapper generator
 *
 * Author: jianyu.lin
 * Date: 2016/12/22 Time: 下午2:58
 */
public abstract class AbstractGenerator<T> {

    protected static final Logger logger = LoggerFactory.getLogger(AbstractGenerator.class);

    @NotNull
    protected final Project project;
    @NotNull
    protected final SqlElement myCreateTableDdl;
    protected final ModuleSetting moduleSetting;

    public AbstractGenerator(@NotNull Project project, @NotNull SqlElement myCreateTableDdl) {
        this.project = project;
        this.myCreateTableDdl = myCreateTableDdl;
        moduleSetting = Modules.getModuleSettingByElement(myCreateTableDdl);
    }

    /**
     * generate psi element
     * @return psi element generated by this plugin
     */
    @Nullable
    public abstract T generate();
}
