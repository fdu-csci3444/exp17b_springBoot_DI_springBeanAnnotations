# exp17b_springBoot_commandLineRunner
Example project showing
- commandLineRunner (see exp17b.Exp17bSpringBootCommandLineRunnerApplication)
- Declaring classes to become a "Spring Bean" via @Component and it's children annotations (@Service, @Repository, @Controller, @RestController)
	- @Service (see exp17b.di.dis.services)
- Declaring classes to become a "Spring Bean" via @Bean;
	- in @Configuration (see exp17b.di.bean.configs.Config4Person)
	- in @Component (see exp17b.di.bean.configs.Component4Person)
- DI of @Bean beans via property injection;
	- @Bean used in @Configuration (see exp17b.di.bean.PersonBeansUser4config)
	- @Bean used in @Component (see exp17b.di.bean.PersonBeansUser4component)
- DI (Dependency Injection) of @Component beans via
	- property Injection (see exp17b.di.dis.ServiceUser_viaPropertyInjection and ServiceUsersUser)
	- setter injection (see exp17b.di.dis.ServiceUser_viaSetterInjection)
	- constructor injection (see exp17b.di.dis.ServiceUser_viaConstuctorInjection)
