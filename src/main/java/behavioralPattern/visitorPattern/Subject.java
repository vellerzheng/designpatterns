package behavioralPattern.visitorPattern;

public interface Subject {
     void accept(Visitor visitor);
     String getSubject();
}
