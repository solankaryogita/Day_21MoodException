package day21MoodAnalysis;

public class MoodAnalysisException extends NullPointerException {
		
		public MoodAnalysisException() {
			super();
			
		}

		public MoodAnalysisException(String s) {
			super(s);
		}	
	}

	public class MoodAnalyse {
		
		private String message = "null";	
		
		public MoodAnalyse() {
			
		}
		
		public MoodAnalyse(String message) {
			this.message = message;
		}
	  
		public String mood() throws MoodAnalysisException {
			try {
				if(message.contains("sad")) {
					return "sad";
				}
				else if(message.contains("any") || message.contains("happy")) {
					return "happy";
				}
				else if(message.equals("null")) {
					throw new MoodAnalysisException();
				}
				else if (message != null) {
					return "happy";
				}
			
			} catch (MoodAnalysisException e) {
				System.out.println("Exception is handle");
				return "happy";
			}
			return message;
			
		}		
}
}