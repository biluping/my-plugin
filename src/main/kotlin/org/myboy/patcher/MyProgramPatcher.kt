package org.myboy.patcher

import com.intellij.execution.Executor
import com.intellij.execution.configurations.JavaParameters
import com.intellij.execution.configurations.RunProfile
import com.intellij.execution.runners.JavaProgramPatcher

class MyProgramPatcher : JavaProgramPatcher() {

    override fun patchJavaParameters(executor: Executor, runProfile: RunProfile, javaParameters: JavaParameters) {
        println("patchJavaParameters")
        javaParameters.vmParametersList.add("-Xmx1024m")
    }
}