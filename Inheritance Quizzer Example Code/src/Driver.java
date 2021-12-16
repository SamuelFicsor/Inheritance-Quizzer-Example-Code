import java.util.ArrayList;

public class Driver
	{

		public static void main(String[] args)
			{
				ArrayList<Question> Quiz = new ArrayList<Question>();
				String firstAnswer = "1) \"Make noise\"\n";
				String secondAnswer = "2) The instrument sounds correct now.\n";
				String thirdAnswer = "3) Rock and roll ahhahaha\n";
				String fourthAnswer = "4) Error\n";
				
				Quiz.add(new Question("What will output when the following code runs: \n"
						+ "Instrument x = new Instrument();\nx.makeNoise()\n",
						firstAnswer,
						secondAnswer,
						thirdAnswer,
						fourthAnswer, ));
			}

	}
