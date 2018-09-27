import org.gradle.api.Project
import org.gradle.api.Plugin

class NevercodePlugin implements Plugin<Project> {
    void apply(Project project) {
        project.task("nevercodePlugin") {
            doLast {
                println("Hello from nevercodePlugin")
            }
        }
    }
}
try {
    com.android.ddmlib.DdmPreferences.setTimeOut(120000)
} catch (Exception ignored) {
    // Do nothing
}
