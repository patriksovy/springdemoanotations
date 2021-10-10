package sk.itsovy.kincel;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ADApp {
    public static void main(String[] args) {


        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContextAnnotations.xml");
        Coach coach=context.getBean("tennisCoach",Coach.class);

        System.out.println(coach.getDailyWorkout());

        System.out.println(coach.getDailyFortune());

        context.close();

    }
}
