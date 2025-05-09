import groovy.io.FileType;
import com.cleanroommc.groovyscript.helper.GroovyFile;

// 源目录
GroovyFile sourceDir = new GroovyFile("recipes");
// 目标目录
GroovyFile targetDir = new GroovyFile("recipes_refactoring");

// 遍历源目录中的所有文件
sourceDir.eachFileRecurse(FileType.FILES) { GroovyFile file ->
    // 计算目标文件路径
    String relativePath = file.getPath().substring(sourceDir.getPath().length());
    GroovyFile targetFile = new GroovyFile(targetDir, relativePath);

    // 读取文件内容
    String content = file.getText();

    // 修改文件内容 (这里是简单的示例：替换 "foo" 为 "bar")
    String modifiedContent = content.replaceAll(/(.*\.recipeBuilder\(\))(?:\r\n|\n)((?:(?:\s*)\.(?:[^\(\)]*)\((?:.*)\)(\n|$|\r\n))+)/) { outer ->
  outer[1] + ".with {\n" + outer[2].replaceAll(/(?:(\s*)\.([^\(\)]*)\((.*)\)(?:\n|$|\r\n))/) { inner ->
    inner[1] + inner[2] + (inner[3]?" ":"()") + inner[3]  + "\n"
  } + "}" + outer[3]
}

    targetFile.createNewFile();
    // 写入到目标文件
    targetFile.write(modifiedContent);
};
