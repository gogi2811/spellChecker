package com.github.gogi2811.spellchecker.services

import com.intellij.openapi.project.Project
import com.github.gogi2811.spellchecker.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
