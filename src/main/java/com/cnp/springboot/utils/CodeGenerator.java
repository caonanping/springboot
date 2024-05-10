package com.cnp.springboot.utils;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;

import java.util.Collections;

public class CodeGenerator {

    public static void main(String[] args) {
        generate();
    }
    public static final String url = "jdbc:mysql://localhost:3306/mybatis_plus?serverTimezone=GMT%2b8";
    public static final String username ="root";
    public static final String password ="987654";

    private static void generate() {
        FastAutoGenerator.create(url, username, password)
                .globalConfig(builder -> {
                    builder.author("cnp") // 设置作者
                            //.enableSwagger() // 开启 swagger 模式
                            .fileOverride() // 覆盖已生成文件
                            .outputDir("D:\\wujie\\springboot\\src\\main\\java\\"); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.cnp.springboot") // 设置父包名
                            .moduleName(null) // 设置父包模块名
                            .pathInfo(Collections.singletonMap(OutputFile.mapperXml, "D:\\wujie\\springboot\\src\\main\\resources\\mybatis\\")); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.entityBuilder().enableLombok();//entity中使用lombok
                    builder.mapperBuilder().enableMapperAnnotation().build();//mapper接口中默认添加mapper注解
                    builder.controllerBuilder().enableHyphenStyle()  // 开启驼峰转连字符
                            .enableRestStyle();  // 开启生成@RestController 控制器
                    builder.addInclude("sys_user"); // 设置需要生成的表名
                            //.addTablePrefix("t_", "sys_"); // 设置过滤表前缀
                })
                //.templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }

}
