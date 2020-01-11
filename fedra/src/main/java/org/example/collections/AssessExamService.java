package org.example.collections;

import java.util.Map;
import java.util.Random;

public class AssessExamService {

    private Exam exam;
    private final Map<AssessStrategyEnum, AssessStrategy> assessStrategies;

    public AssessExamService(Exam exam, Map<AssessStrategyEnum, AssessStrategy> assessStrategies) {
        System.out.println("constructor AssessExamService");
        this.exam = exam;
        this.assessStrategies = assessStrategies;
    }

    public Map<AssessStrategyEnum, AssessStrategy> getAssessStrategies() {
        return assessStrategies;
    }

    public double assessExam() {
        return hashCode();
    }

}
