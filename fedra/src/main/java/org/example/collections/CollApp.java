package org.example.collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sun.awt.AppContext;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class CollApp {

    @PostConstruct
    public void post() {
        System.out.print("@PostConstruct: ");
        System.out.println(assessService);
    }

    public void init() {
        System.out.print("init: ");
        System.out.println(assessService);
    }

    private AssessService assessService;

    @Resource
    private AssessExamService assessExamService;

    public CollApp() {
        System.out.print("construct: ");
        System.out.println(assessService);
    }

    public static void main(String[] args) {
        ApplicationContext c = new ClassPathXmlApplicationContext("collections.xml");
        ApplicationContext c2 = new AnnotationConfigApplicationContext(OurConfig.class);

        CollApp app = c.getBean("collApp1", CollApp.class);
        app.run();
    }

    public void run() {

        Exam exam = new Exam();
        exam.setAssessStrategy(AssessStrategyEnum.STRICT);

        double result = assessService.assessExam(exam);
        System.out.println(result);

        System.out.println(getService().assessExam());

        System.out.println(getService().assessExam());

    }


    public AssessExamService getService( ) {
        throw new IllegalStateException();
    }

    private Collection<String> items;
    private Map<Integer, String> namesByIds;


    public Collection<String> getItems() {
        return items;
    }

    public CollApp setItems(Collection<String> items) {
        System.out.println(items.getClass());
        System.out.println(items);
        this.items = items;
        return this;
    }

    public Map<Integer, String> getNamesByIds() {
        return namesByIds;
    }

    public CollApp setNamesByIds(Map<Integer, String> namesByIds) {
        System.out.println(namesByIds.getClass());
        System.out.println(namesByIds);
        this.namesByIds = namesByIds;
        return this;
    }

    public AssessService getAssessService() {
        return assessService;
    }

    public CollApp setAssessService(AssessService assessService) {
        this.assessService = assessService;
        return this;
    }

    public AssessExamService getAssessExamService() {
        return assessExamService;
    }

    @Required
    public CollApp setAssessExamService(AssessExamService assessExamService) {
        this.assessExamService = assessExamService;
        return this;
    }
}
