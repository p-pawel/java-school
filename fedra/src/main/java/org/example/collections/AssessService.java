package org.example.collections;

import java.util.Map;

public class AssessService {

    private final Map<AssessStrategyEnum, AssessStrategy> assessStrategies;

    public AssessService(Map<AssessStrategyEnum, AssessStrategy> assessStrategies) {
        this.assessStrategies = assessStrategies;
    }

    public Map<AssessStrategyEnum, AssessStrategy> getAssessStrategies() {
        return assessStrategies;
    }

    public double assessExam(Exam exam) {
        return assessStrategies.get(exam.getAssessStrategy()).calculate();
    }

}
