# Intro Site (Spring Boot + Maven)

一个可直接导入 IntelliJ IDEA 的个人自我介绍网站示例（含 4 个页面：Home / About / Projects / Contact）。

## 导入
1. 打开 IntelliJ IDEA → File → New → Project from Existing Sources…
2. 选择目录 `/workspace/intro-site`（或你下载到本地的项目目录）
3. 选择 "Maven" 作为项目模型，保持默认，完成导入

## 运行
- 方式一：IDEA 运行 `IntroSiteApplication`
- 方式二：命令行

```bash
mvn spring-boot:run
```

访问：`http://localhost:8080`

## 项目结构
- `src/main/java`：应用代码
  - `com.example.introsite.IntroSiteApplication` 入口类
  - `controller.HomeController` 控制器与路由
- `src/main/resources/templates`：Thymeleaf 页面模板（`layout.html`、`home.html`、`about.html`、`projects.html`、`contact.html`）
- `src/main/resources/static`：静态资源（CSS）
- `application.properties`：基础配置

## 自定义
- 修改模板内容即可个性化你的介绍
- 如需增加页面：
  1. 在 `controller` 中新增路由
  2. 在 `templates` 新增对应模板
  3. 导航栏在 `templates/layout.html` 中维护