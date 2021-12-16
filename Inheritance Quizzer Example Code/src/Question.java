
public class Question
	{
		private String asking;
		private int answer;
		
		public Question(String a,int an)
		{
			asking = a;
			answer = an;
		}

		public String getAsking()
			{
				return asking;
			}

		public void setAsking(String asking)
			{
				this.asking = asking;
			}

		public int getAnswer()
			{
				return answer;
			}

		public void setAnswer(int answer)
			{
				this.answer = answer;
			}
	}
