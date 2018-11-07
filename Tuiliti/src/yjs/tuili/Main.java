package yjs.tuili;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		//���������б�
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
		
		//������б�
		AnswerList answers = new AnswerList();
		
		//��ȷ��
		StringBuffer result = new StringBuffer();
		
		//���������п��ܵĴ�
		boolean flag = true;
		while(flag){			
			//��ȷ����Ŀ��
			byte numberOfCorrectAnswers = 0;
			//��ÿ���������ô�
			for(byte i=1;i<=10;i++){				
				questions[i-1].setAnswer(answers.get(i));									
			}
			//���ʮ������Ƿ���ȷ
			for(byte i=1;i<=10;i++){
				if(questions[i-1].isCorrectAnswer()){
					numberOfCorrectAnswers++;
				}
			}
			//ʮ���ⶼ��ȷ��������
			if(numberOfCorrectAnswers==10){
				result.append("��ȷ��Ϊ��");
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
			System.out.println("���������û����ȷ��");
		}else{
			System.out.println(result.toString()+"�������");
		}
	}
}
