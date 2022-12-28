public class Quiz {
	
	public static void main(String[] args) {
		Question question = new TrueFalseQuestion( "The sun rises in the west.\n ",
		"FALSE");
		question.check();
		Question question2 = new TrueFalseQuestion( "The elephant is a mammal. \n ",
				"TRUE");
		question2.check();
		Question question3 = new TrueFalseQuestion( "A Horse runs faster than a cheetah. \n ",
				"FALSE");
		question3.check();
		Question question4 = new TrueFalseQuestion( "There are 7 wonders of the world. \n ",
				"TRUE");
		question4.check();
		Question question5 = new TrueFalseQuestion( "There are 6 continents in the world.\n ",
				"FALSE");
		question5.check();
		Question question6 = new MultipleChoiceQuestion(
				 "Which city is the most densely populated?",
				 "Mumbai",
				 "Tokyo",
				 "Manila",
				 "Paris",
				 "Yangon",
				 "c");
		question6.check();
		
		Question question7 = new MultipleChoiceQuestion(
				"How many alphabets are there in English literature?\n ",
				"19",
				"39",
				"36",
				"25",
				"26",
				"e");
		question7.check();
		
		Question question8 = new MultipleChoiceQuestion(
				 "How many football team in English Premier League?",
				 "11",
				 "15",
				 "18",
				 "20",
				 "25",
				 "d");
		question8.check();
		
		Question question9 = new MultipleChoiceQuestion(
				"Who has won the most balon d'or?",
				"Messi",
				"Kaka",
				"Neymar",
				"Ronaldo",
				"Benzema",
				"a");
		question9.check();
		
		Question question10 = new MultipleChoiceQuestion(
				"How many balon d'or have Messi won?",
				"4",
				"5",
				"6",
				"7",
				"8",
				"d");
		question10.check();
		
		MultipleChoiceQuestion.showResults();
	}

}
