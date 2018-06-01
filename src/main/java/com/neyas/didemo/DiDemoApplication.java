package com.neyas.didemo;

import com.neyas.didemo.controllers.ConstructorInjectedController;
import com.neyas.didemo.controllers.MyController;
import com.neyas.didemo.controllers.PropertyInjectedController;
import com.neyas.didemo.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

		MyController controller = (MyController) ctx.getBean("myController");
//		controller.hello();

        System.out.println(controller.hello());
        System.out.println(ctx.getBean(PropertyInjectedController.class).sayGreeting());
        System.out.println(ctx.getBean(SetterInjectedController.class).sayGreeting());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayGreeting());
	}
}
