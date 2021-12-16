import java.util.ArrayList;
import java.util.Scanner;

public class Driver
	{
		static ArrayList<Question> Quiz = new ArrayList<Question>();
		
		public static void main(String[] args)
			{
				Quiz.add(new Question("Instrument x = new Instrument();\nx.makeNoise();\n", 1));
				Quiz.add(new Question("Instrument x = new Guitar();\nx.makeNoise();\n", 4));
				Quiz.add(new Question("Guitar x = new Instrument();\nx.makeNoise();\n", 5));
				Quiz.add(new Question("Guitar x = new Guitar();\nx.makeNoise();", 4));
				
				Quiz.add(new Question("Instrument x = new Instrument();\nx.tune();\n", 2));
				Quiz.add(new Question("Instrument x = new Guitar();\nx.tune();\n", 2));
				Quiz.add(new Question("Guitar x = new Instrument();\nx.tune();\n", 5));
				Quiz.add(new Question("Guitar x = new Guitar();\nx.tune();", 2));
				
				Quiz.add(new Question("Instrument x = new Instrument();\nx.rockNRoll();\n", 5));
				Quiz.add(new Question("Instrument x = new Guitar();\nx.rockNRoll();\n", 5));
				Quiz.add(new Question("Guitar x = new Instrument();\nx.rockNRoll();\n", 5));
				Quiz.add(new Question("Guitar x = new Guitar();\nx.rockNRoll();", 3));
				
				test();
			}
		
		public static void test()
			{
				Scanner userInput = new Scanner(System.in);
				int input;
				int score = 0;
				
				for(int i = 0 ; i < 12 ; i++)
					{
						System.out.println("What will output when this code is run?\n");
						System.out.println(Quiz.get(i).getAsking());
						displayOptions();
						input = userInput.nextInt();
						System.out.println();
						
						if(input == Quiz.get(i).getAnswer())
							{
								System.out.println("That's correct!\n");
								score++;
							}
						else
							{
								System.out.println("That's incorrect.\n");
							}
					}
				
				System.out.println("Your final score is: " + score + "/12");
				
				if(score >= 10)
					{
						System.out.println("Good job!");
					}
				else if(score >= 7)
					{
						System.out.println("Pretty good, but you can do better!");
					}
				else
					{
						System.out.println("Get your tattoo redone it's fading");
					}
			}
		
		public static void displayOptions()
		{
			System.out.println("1) \"Make noise\"\n"
							+ "2) The instrument sounds correct now.\n"
							+ "3) Rock and roll ahhahaha\n"
							+ "4) ebeosbfoesmfemfsenfadflaksjfh\n"
							+ "5) error\n");
		}

	}
