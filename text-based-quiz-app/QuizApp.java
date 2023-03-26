import java.util.*;

public class QuizApp {
    public static void main(String[] args) {
        List<Question> quiz = Arrays.asList(
                new Question("What is the capital of France?", new String[]{"Paris", "Berlin", "Madrid", "Rome"}, 1),
                new Question("Which planet is closest to the sun?", new String[]{"Mars", "Venus", "Mercury", "Earth"}, 3)
                // Add more questions and answers as needed
        );

        quizApp(quiz);
    }

    public static void quizApp(List<Question> questions) {
        Collections.shuffle(questions);

        int score = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < questions.size(); i++) {
            Question questionObj = questions.get(i);
            System.out.printf("Question %d: %s%n", i + 1, questionObj.question);

            for (int j = 0; j < questionObj.answers.length; j++) {
                System.out.printf("%d: %s%n", j + 1, questionObj.answers[j]);
            }

            System.out.print("Enter the correct answer index (1-4): ");
            int userAnswer = scanner.nextInt();

            if (userAnswer == questionObj.correctAnswer) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.printf("Incorrect. The correct answer is: %s%n", questionObj.answers[questionObj.correctAnswer - 1]);
            }

            System.out.println("----------------------------");
        }

        System.out.printf("Your final score is %d out of %d%n", score, questions.size());
        scanner.close();
    }

    static class Question {
        String question;
        String[] answers;
        int correctAnswer;

        Question(String question, String[] answers, int correctAnswer) {
            this.question = question;
            this.answers = answers;
            this.correctAnswer = correctAnswer;
        }
    }
}