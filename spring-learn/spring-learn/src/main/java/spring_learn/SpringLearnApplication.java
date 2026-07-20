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

        displayDate();

    }


    public static void displayDate() {

        // Load Spring XML configuration file
        ApplicationContext context =
                new ClassPathXmlApplicationContext("date-format.xml");


        // Get SimpleDateFormat bean from Spring container
        SimpleDateFormat format =
                context.getBean("dateFormat", SimpleDateFormat.class);


        try {

            // Convert String date into Date object
            Date date = format.parse("31/12/2018");

            // Display date
            System.out.println("Parsed Date: " + date);

        } 
        catch (Exception e) {

            e.printStackTrace();

        }

    }

}