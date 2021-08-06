package lab.tasks;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.InputFile;
import org.gradle.api.tasks.OutputFile;
import org.gradle.api.tasks.TaskAction;
import org.gradle.api.file.RegularFileProperty;

public abstract class JarSize extends DefaultTask {

    @InputFile
    public abstract RegularFileProperty getJar();

    @OutputFile
    public abstract RegularFileProperty getJarSizeTxt();

    @TaskAction
    public void calculateSize() throws java.io.IOException {
        java.io.File jarFile = getJar().get().getAsFile();
        java.io.FileWriter txtFile = new java.io.FileWriter(getJarSizeTxt().get().getAsFile());
        txtFile.append("Jar name is " + jarFile.getName() + "\n");
        txtFile.append("Jar size is " + jarFile.length() + "\n");
        txtFile.close();
    }
}