package spring_learn;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringLearnApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringLearnApplication.class, args);

        // Previous hands-on code
        displayDate();

    }


    public static void displayDate() {

        // Loading Spring XML configuration
        ApplicationContext context =
                new ClassPathXmlApplicationContext("date-format.xml");


        // Getting SimpleDateFormat bean
        SimpleDateFormat format =
                context.getBean("dateFormat", SimpleDateFormat.class);


        try {

            Date date = format.parse("31/12/2018");

            System.out.println("Parsed Date: " + date);

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

}