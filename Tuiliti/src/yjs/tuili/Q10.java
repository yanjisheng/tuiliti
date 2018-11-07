package yjs.tuili;

public class Q10 implements Question {

	private static byte answer;
	
	@Override
	public void setAnswer(byte answer) {
		// TODO Auto-generated method stub
		if(answer>=1&&answer<=4){
			this.answer=answer;
		}
	}

	@Override
	public byte getAnswer() {
		// TODO Auto-generated method stub
		return this.answer;
	}

	@Override
	public boolean isCorrectAnswer() {
		// TODO Auto-generated method stub
		//10.在此10道题中，ABCD四个字母出现次数最多与最少者的差为
		//A.3 B.2 C.4 D.1
		boolean result = false;
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
		byte countA = 0;
		byte countB = 0;
		byte countC = 0;
		byte countD = 0;
		for(byte i=1;i<=10;i++){
			switch(questions[i-1].getAnswer()){
			case 1:
				countA++;
				break;
			case 2:
				countB++;
				break;
			case 3:
				countC++;
				break;
			case 4:
				countD++;
				break;
			}
		}
		byte countMax = 0;
		byte countMin = 10;
		while(!(countMax>=countA&&countMax>=countB&&countMax>=countC&&countMax>=countD)){
			countMax++;
		}
		while(!(countMin<=countA&&countMin<=countB&&countMin<=countC&&countMin<=countD)){
			countMin--;
		}
		if((this.answer==1&&(countMax-countMin==3))||
				(this.answer==2&&(countMax-countMin==2))||
				(this.answer==3&&(countMax-countMin==4))||
				(this.answer==4&&(countMax-countMin==1))){
			result = true;
		}
		return result;
	}

}
