package yjs.tuili;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		//定义问题列表
		Question[] questions = new Question[10];
		questions[0] = new Q1();
		questions[1] = new Q2();
		questions[2] = new Q3();
		questions[3] = new Q4();
		questions[4] = new Q5();
		questions[5] = new Q6();
		questions[6] = new Q7();
		questions[7] = new Q8();
		questions[8] = new Q9();
		questions[9] = new Q10();
		
		//定义答案列表
		AnswerList answers = new AnswerList();
		
		//正确答案
		StringBuffer result = new StringBuffer();
		
		//遍历出所有可能的答案
		boolean flag = true;
		while(flag){			
			//正确的题目数
			byte numberOfCorrectAnswers = 0;
			//给每个问题设置答案
			for(byte i=1;i<=10;i++){				
				questions[i-1].setAnswer(answers.get(i));									
			}
			//检查十道题答案是否正确
			for(byte i=1;i<=10;i++){
				if(questions[i-1].isCorrectAnswer()){
					numberOfCorrectAnswers++;
				}
			}
			//十道题都正确则输出结果
			if(numberOfCorrectAnswers==10){
				result.append("正确答案为：");
				for(byte i=1;i<=10;i++){
					result.append(i+".");
					switch(answers.get(i)){
					case 1:
						result.append("A");
						break;
					case 2:
						result.append("B");
						break;
					case 3:
						result.append("C");
						break;
					case 4:
						result.append("D");
						break;
					}
					result.append(" ");
				}
			}
			flag = answers.next();
		}

		if(result.toString().equals("")){
			System.out.println("程序结束，没有正确答案");
		}else{
			System.out.println(result.toString()+"程序结束");
		}
	}
}
