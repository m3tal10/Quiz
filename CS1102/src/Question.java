import java.awt.*;
import javax.swing.*;

public abstract class Question {
	static int nQuestions = 0; 
	static int nCorrect = 0;
	QuestionDialog question;
	String correctAnswer;
	Question(String question) {
		this.question = new QuestionDialog();
		this.question.setLayout(new GridLayout(0,1));
		this.question.add(new JLabel( "      "+question+"",JLabel.CENTER));
		
	}
	void initQuestionDialog() {
		this.question.setModal(true);
		this.question.pack();
		this.question.setLocationRelativeTo(null);
	}
	String ask() {
		// TODO Auto-generated method stub
		question.setVisible(true);
		return question.answer;
		}
	void check()
	{
		nQuestions++;
		String answer= ask();
		if(answer.equals(correctAnswer))
		{
			nCorrect++;
			JOptionPane.showMessageDialog(null,"Correct!");
		}
		else 
		{
			JOptionPane.showMessageDialog(null,"Incorrect! The correct answer is "+correctAnswer);
		}
	}
	
	static void showResults() 
	{	
		String a=Integer.toString(nQuestions);
		String b=Integer.toString(nCorrect);
		JOptionPane.showMessageDialog(null,b+" Correct out of "+a);
	}

}
