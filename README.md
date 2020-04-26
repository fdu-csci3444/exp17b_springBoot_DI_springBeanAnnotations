# exp17b_springBoot_commandLineRunner
Example project showing;

- commandLineRunner (see exp17b.Exp17bSpringBootCommandLineRunnerApplication)
- Declaring classes to become a "Spring Bean" via @Component and it's children annotations (@Service, @Repository, @Controller, @RestController)
	- @Service (see exp17b.di.dis.services)
- Declaring classes to become a "Spring Bean" via @Bean;
	- in @Configuration (see exp17b.di.bean.configs.Config4Person)
	- in @Component (see exp17b.di.bean.components.Component4Person)
- DI of @Bean beans via property injection;
	- @Bean used in @Configuration (see exp17b.di.bean.PersonBeansUser4config)
	- @Bean used in @Component (see exp17b.di.bean.PersonBeansUser4component)
- DI (Dependency Injection) of @Component beans via
	- property Injection (see exp17b.di.dis.ServiceUser_viaPropertyInjection and ServiceUsersUser)
	- setter injection (see exp17b.di.dis.ServiceUser_viaSetterInjection)
	- constructor injection (see exp17b.di.dis.ServiceUser_viaConstuctorInjection)

## to clone and then import project
- if you have windows laptop, make sure gitbash is installed. Then open gitbash
- if you have mac, open Terminal
- issue below to clone the projects
```bash
cd /c/fdu/csci3444/projects
git clone https://github.com/fdu-csci3444/exp17b_springBoot_DI_springBeanAnnotations.git
```

- import the project to STS
	- File -> Import -> General -> Projects from Folder or Archive
	- select above cloned project

## to directly import project from github into STS
- 1st copy the github url of the remote project
Go to github link <br>
 https://github.com/fdu-csci3444/exp17b_springBoot_DI_springBeanAnnotations.git <br>
   click "Clone or Download" pull down button, click "book" icon to the right of the github url

- import directly from github url into STS
File --> Import --> Git --> Project from Git <br>
 click Next <br>
   click Clone URI <br>
     click Next (the github url should be auto filled, if you had clicked the "book" icon above <br>
       click Next <br>
        choose remote branch (master should be auto picked) <br>
          click Next <br>
            choose "Destination" "Directory" for the project to be created in <br>
              click Finish

## to run the project in STS
- make sure maven dependencies are made available to project
	- right click on project, Maven, Update project
- to run project
	- right click on project, Run as, Java Application
	- or
	- right click on project, Run as, Spring Boot App

