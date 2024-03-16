根据数字空间站的https://www.writebug.com/git/colaer/Recruitment-website-springboot.git
有所删改，创建的招聘系统项目。功能有不足。

目录
1系统需求	1
1.1项目简介	1
1.2实现内容	1
1.3开发环境	2
1.4项目技术	2
2系统概要设计	3
2.1总体结构	3
2.2功能设计	3
2.3数据库设计	3
3系统详细设计	6
3.1 ER图	6
4系统实现	7
4.1系统源码实现说明	7
5系统测试	11
5.1运行截图	11
6结束语	19
心得体会	20
参考文献	21

 
1系统需求
1.1项目简介
 招聘系统的设计初衷源于对在校大学生找工作困难以及消息渠道闭塞的实际问题的关注。为了解决这一问题，开发了一款招聘系统平台，旨在帮助大学生们安全、快速、高效地找到工作机会。这个平台可以让大学生们，通过平台找到工作，增加收入，提高消费水平，减轻家庭经济负担的机会。同时，通过参与实际工作，大学生们可以更好地消化所学知识，积累社会经验，拓展社交圈子，锻炼各方面的能力。
通过这个平台，大学生们可以在实践中不断积累经验，增长见识，建立起良好的价值观，促进身心的健康有效发展。本报告是针对这个招聘系统进行设计和开发的。报告主要围绕招聘系统平台的需求分析、系统设计与开发实现进行了详细的阐述，最后对所设计的招聘系统进行了系统测试，并对全文进行了总结。
在这个互助平台上，大学生们可以浏览到各种类型的兼职信息，搜素各类兼职信息，根据自己的兴趣和能力选择适合自己的工作。还可以进行在线编写简历，投递简历。
在开发这个平台的过程中，我充分考虑到了用户的需求和体验，努力提供一个功能完善、易于操作的平台。采用了现代化的技术和方法，保证了平台的稳定性和安全性。通过这个平台，希望能够为大学生们提供一个更加便捷、安全、高效的兼职求职平台，让他们能够更好地融入社会，实现自我增值。 

1.2实现内容
招聘系统将为招聘者和求职者构建一个功能齐全、方便快捷的招聘平台，减少双方投入招聘活动的成本，为招聘求职双方带来便利。系统将实现如下目标：求职者可以通过此系统进行注册、登录、职位查看、职位搜索、简历制作和投递、查看投递状况等操作。
招聘系统旨在打造一个功能齐全、操作便捷的招聘平台，为招聘者和求职者提供一站式的招聘解决方案，从而降低双方在招聘活动中的成本，提升招聘效率，为就业双方带来更多便利。该系统将实现以下核心目标：
首先，为求职者提供注册和登录功能，使其能够轻松创建个人账户并进行登录操作。注册后，求职者将获得完整的平台权限，方便其使用系统的各项功能。

其次，求职者可以通过系统浏览各类职位信息，并进行灵活的职位搜索，以便找到符合自身需求和条件的工作机会。这将极大地节省求职者的时间和精力，提高了求职的效率和成功率。
第三，系统将提供简历制作和投递功能，让求职者可以轻松地创建和管理个人简历，并将简历直接投递给感兴趣的岗位。这一功能将帮助求职者更好地展示个人能力和经历，增加被雇主注意的机会。
此外，求职者还能够随时查看自己的简历投递状态，了解求职进展情况，从而及时调整求职策略，提升求职效果。
总的来说，招聘系统将为求职者和招聘者构建一个高效便捷的招聘平台，为双方提供全方位的招聘服务，助力求职者顺利找到理想工作，帮助招聘者快速找到合适人才，实现双赢局面。

1.3开发环境
运行环境：JDK 1.8
开发工具：IDEA
服务器：SpringBoot自带 apache tomcat
操作系统：Windows 10
数据库：MySQL5.7.24
数据库可视化工具：Navicat for MySQL
1.4项目技术
后端：JAVA、SpringBoot、MyBatis、mysql
前端：jQuery、JSP、bootstrap、HTML+CSS实现页面布局、JavaScript


 
2系统概要设计
2.1总体结构
招聘系统，个人用户管理，包括个人信息管理（注册，登录），简历管理（创建简历，修改简历，删除简历），求职申请（投递简历，查看投递简历记录）。

2.2功能设计
（1）个人用户注册，登录，注销。
（2）查看，搜索求职信息。
（3）简历创建，修改，删除。
（4）简历投递，查看简历投递记录。

2.3数据库设计
2.3.1 数据库表结构

 
图2.3.1.1 公司表 

 
图2.3.1.2 公司招聘者表

 
图2.3.1.3 用户表 

 
图2.3.1.4 个人荣誉表 

 
图2.3.1.5 职位表 

 
图2.3.1.6 项目经验表 

 
图2.3.1.7 简历表 


 
图2.3.1.8 技能表 






 
3系统详细设计
3.1 ER图
 


















4系统实现
4.1系统源码实现说明
4.1.1maven配置
例如：
<dependencies>
    <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    <dependency>
      <groupId>org.mybatis.spring.boot</groupId>
      <artifactId>mybatis-spring-boot-starter</artifactId>
      <version>2.1.2</version>
    </dependency>
……

4.1.2项目配置
例如：
server:
  servlet:
    context-path: /
  port: 8081
  tomcat:
    uri-encoding: utf-8

4.1.3实体类
将前台获取到的个人信息（公司信息）封装到该类中，再按相应的需求决定是否把这些信息录入数据库。在pojo和pojoVo包中
例如用户实体类：
public class Customer implements Serializable {
        private Integer custId;
        private String custName;
        private Long custTelno;
    	 private String custEmail;
    private String custPassword;
……
}

4.1.4 业务类
业务类中包含的方法示例如下：
1.	login()：个人用户通过该方法登录到系统的主界面
@GetMapping("/login")
@ResponseBody
public ServerResponse login(String username, String password, Integer type, Integer userType, HttpServletRequest request) {
        ServerResponse serverResponse = null;
        if (1 == type) { // 手机号、邮箱 & 密码
            // userType = 0手机号；1邮箱
serverResponse=customerService.getByUsernameAndPwd(username, password, userType);
if (serverResponse.getStatus() == 1) { // 登录成功 用户存在
Customer	customer	=(Customer)	serverResponse.getData();
                request.getSession().setAttribute("loginCustomer", customer);
            }
        } else {
            // 手机号 & 验证码
            System.out.println("手机号，验证码登录");
       		 }
        return serverResponse;
}

2.	add()：创建个人简历
@RequestMapping("/add")
    public String add(HttpServletRequest request) {
    Customer	customer=(Customer) request.getSession().getAttribute("loginCustomer");
        Resume resume = new Resume();
        resume.setResumeName("我的简历");
        resume.setCustId(customer.getCustId());
        resume.setResumeTelno(customer.getCustTelno());
        resumeService.add(resume);
        resume = (Resume) resumeService.getLatestResume().getData();
        Integer resumeId = resume.getResumeId();
        return "redirect:" + resumeId + "/edit";
    }

3.	getCheckedCode():获取验证码
    @GetMapping("/getCode")
    @ResponseBody
    public ServerResponse getCheckedCode(Long custTelno) {
        // 数据库中查看手机号是否已经注册
        ServerResponse serverResponse = customerService.getByTelno(custTelno);
        ServerResponse result;
        if (serverResponse.getStatus() != 1) {
            // 失败 - 用户不存在，可以创建
            //生成随机的4位验证码
            String code = ValidateCodeUtils.generateValidateCode(4).toString();
            //为了测试，防止真实的手机号泄露，控制台直接输出验证码
            log.info("code={}", code);

            // 获取验证码 - 调用短信接口
            //调用阿里云提供的短信服务API，完成发送短信
            //SMSUtils.sendMessage("招聘系统","",phone,code);
            // String code =  GetMessageCode.getCode(telnoStr);

            result = ServerResponse.getSuccess(code);
        } else {
            // 成功 - 用户已经存在
            result = ServerResponse.getFailed("用户已存在，请前往登录页面");
        }
        return result;
}

4.1.5 前端代码
例如首页代码如下：
<html>
<head>
    <title>校园招聘网</title>
    <link	rel="stylesheet" href="${pageContext.request.contextPath}/css/index.css">
</head>
<body>
<jsp:include page="navigate/navigate.jsp"/>
<div id="container">        
    <div id="Position_list">
        <!--职位信息-->
        <div id="Specific_info">
            <ul id="jobUL" class="js_content"></ul>
            <a href="${pageContext.request.contextPath}/job/jobInfo" class="btn">查看更多</a>
        </div>
    </div>
</div>
……



 
5系统测试
5.1运行截图
5.1.1用户注册
根据提示，输入信息。
1.输入手机号码，手机号为11位有效数字，判断1开头。超过11位不能输入。
2. 输入密码和确认密码，两个密码要相同。
3. 点击“发送验证码”判断手机号格式是否正确，如不正确则提示用户“手机号格式错误”。
4. 通过手机短信的验证码（本次报告验证码在后端控制台输出，防止真实手机号码泄露），输入4位的短信验证码。
5. 所有必填信息填写完整之后，注册按钮点亮，可以点击，未填写完整则立即注册按钮为灰色且点击无效果。

 






5.1.2用户登录
输入正确的手机号和密码，点击登录按钮，即可完成登录功能。
 


登录完成后，进入首页
 
5.1.3创建简历
点击上方简历，在简历页面点击创建简历。
 
进入创建简历页面。
 

	
点击添加，根据提示，填写基本信息（简历名称，出生日期，手机号码，邮箱，性别，求职状态，年收入，工作类型）、项目经验（项目的开始时间，结束时间，公司名称，项目名称，项目描述，责任描述）、专业技能和在校荣誉的表单，逐个点击保存，完成简历的创建。
 
 


点击预览，查看简历的预览效果。
 

	
回到简历中心，查看已经写好的简历，简历名称为“简历”。
 

5.1.4简历修改
在简历中心页面，点击编辑。
 




进入简历编辑页面，对需要修改的内容进行修改编辑，最后点击保存。
 

5.1.5查看职位
点击首页的“查看更多”按钮。 
 
进入以下页面，可以看到很多职位信息。
 

5.1.6搜索职位
在搜素栏输入想要搜索的职位，如“php”，之后点击右方的搜素按钮，就能看到搜索之后的职位信息，包括职位名，公司名，工作地点，薪资信息和发布时间。
 

5.1.7投递简历
点击“php”职位名，蓝色代表超链接，进入职位信息页面，页面中包括很多信息，包括公司信息，职位学历的要求，招聘人数要求，专业要求等等信息。
在右上方有一个蓝色按钮，写着“申请职位”，点击之后进行投递简历。
	 
根据提示，选择想要投递的简历，之后点击确认按钮。
 



绿色框，写着“投递成功”提示，说明投递简历成功完成。
 


5.1.8查看投递记录
点击黑色框中的投递记录，即可查看投递记录。有投递的简历名称信息，投递的岗位信息，薪资信息，投递时间信息，企业名称信息。
 



5.1.9退出登录
点击黑色框中的“退出登录”，即可实现退出登录。
 




点击退出登录之后，进入首页。
  
6结束语
遇到的问题，一个请求，返回一个对象，对象里面有日期，返回的对象的日期却比实际的日期少了一天。
产生原因，spring boot默认使用Jackson对返回到前端的值进行序列化。Jackson框架默认的时区是UTC，相比于东八区少了8小时(东+西-)。hh:12小时制,HH:24小时制。
解决方法
1）使用@JsonFormat注解和@DateTimeFormat注解。在与时间有关的实体类中的属性名上方，输入以下两行代码。
@DateTimeFormat(pattern = "yyyy-MM-dd")
@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
private Date resumeUpdateTime;
 
2) 在application.yml中使用如下配置
spring:
jackson:
date-format: yyyy-MM-dd
time-zone: GMT+8
3）在application.yml的数据库链接url后面添加如下参数。
serverTimezone=Asia/Shanghai
遇到的还有短信发送验证码的问题，为了实现短信发送验证码功能，需要先导入aliyun的maven坐标，调用API，注册aliyun短信服务，由于需要审核且个人认证不容易通过，为了防止真实的手机号码泄露，我就把随机生成的验证码直接从后端控制台输出了，这样就可以在进行注册功能的时候，从控制台查看短信验证码，再把验证码输入指定位置，就能够完成注册功能了，短信发送验证码功能也能成功实现了。
不足之处有页面不够美观，功能不够完善，没有实现企业用户进行职位发布增删改查的功能等。

 
心得体会
在本次开发招聘系统设计与实现的过程中，我深刻体会到了Spring Boot框架优雅的设计和强大的功能，为系统的快速搭建和高效运行提供了有力支持。
首先，Spring Boot的快速开发特性让我能够迅速构建出招聘系统的雏形。通过使用自动配置和约定大于配置的原则，我省去了大量的繁琐配置工作，专注于业务逻辑的实现。这加速了开发周期，使我能够更灵活地应对业务需求的变化。
其次，Spring Boot的模块化设计为招聘系统的扩展和维护提供了良好的支持。通过合理划分模块，我能够实现代码的高内聚、低耦合。框架的设计理念使得系统具备良好的可维护性，同时也降低了新功能的引入和老功能的修改对系统稳定性的影响。在使用 Spring Boot 开发招聘系统的过程中，我深刻体会到了其简化了项目的搭建和开发流程，提高了开发效率的优势。同时，结合 Spring Boot 的特性，我在设计与实现过程中积累了一些经验与心得。
在系统设计阶段，我充分利用了 Spring Boot 的快速启动特性和自动配置功能。通过简单的配置，就能够快速构建一个基础的 Web 应用程序，省去了繁琐的配置过程，使得我能够更专注于业务逻辑的实现。另外，Spring Boot 提供了丰富的 starter 包，集成了常用的功能模块，比如数据库访问、安全认证、日志管理等，这些都大大减少了开发者的工作量，加速了项目的开发进度。在实现过程中，我尽可能地遵循了 Spring Boot 的最佳实践和约定大于配置的原则。除此之外，我还注重了用户体验和界面设计。通过合理的布局和页面交互设计，使得用户能够更加方便地使用系统，提高了系统的易用性和友好度。同时，我也加入了一些功能性的小细节，比如表单验证、提示信息等，提升了用户体验。在数据库操作方面，Spring Boot的整合使得与数据库的交互变得简单而高效。通过使用MyBatis，免除了几乎所有的 JDBC 代码以及设置参数和获取结果集的工作，还通过简单的 XML 或注解来配置和映射原始类型、接口和 Java POJO为数据库中的记录。我能够通过简单的XML定义实体类和数据访问层，大大减少了对数据库的操作代码。这使得代码更加清晰，也方便了数据库结构的维护和升级。另外，通过本次系统的设计与实现，使我对前后端分离的项目有了更加深刻的印象，前端使用了现代化的技术栈，使得用户界面更加交互和响应。后端则专注于数据处理和业务逻辑，通过RESTful API与前端进行通信。
总的来说，通过使用Spring Boot框架，我成功地搭建了一个高效、稳定的招聘系统。其简洁的开发方式、模块化的设计以及优雅的数据库操作，使我在系统开发中体验到了极大的便利和效率提升。这次的经验让我对Spring Boot框架更加信任和熟悉，也为未来的项目开发提供了宝贵的参考。
