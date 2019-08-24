package JavaProHW01;

import java.util.Hashtable;
import java.util.Map;
import java.util.Objects;

public class Question {

    private String name;
    private Map<String, Integer> answer;

    public Question(String name) {
        this.name = name;
        this.answer = new Hashtable<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Integer> getAnswer() {
        return answer;
    }

    public void setAnswer(String key, Integer value) {
        this.answer.put(key, value);
    }

    public void updateAnswer(String key){
        answer.computeIfPresent(key, (k, v) -> ++v);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Question question = (Question) o;
        return name.equals(question.name) &&
                answer.equals(question.answer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, answer);
    }

    @Override
    public String toString() {
        return "Question{" +
                "name='" + name + '\'' +
                ", answer=" + answer +
                '}';
    }
}
