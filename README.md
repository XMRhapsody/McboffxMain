# McboffxMain

这是一个既可以在Spigot也可以在BungeeCord上运行的Minecraft插件。

## 特性

- 自动检测运行环境（Spigot或BungeeCord）
- 根据不同环境加载相应的插件功能
- 支持Minecraft 1.13及以上版本

## 安装

1. 下载最新的插件JAR文件
2. 将JAR文件放入服务器的`plugins`文件夹中
3. 重启服务器
4. 插件将自动检测运行环境并加载相应功能

## 构建

这个项目使用Maven构建。你可以使用以下命令构建它：

```bash
mvn clean package
```

构建完成后，你可以在`target`目录中找到生成的JAR文件。

## 配置

插件会在第一次运行时生成配置文件。你可以根据需要修改这些配置文件。

## 许可证

此项目采用MIT许可证。详见LICENSE文件。 