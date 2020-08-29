package com.github.tonels.fantasticpalmtree.services

import com.intellij.openapi.project.Project
import com.github.tonels.fantasticpalmtree.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
