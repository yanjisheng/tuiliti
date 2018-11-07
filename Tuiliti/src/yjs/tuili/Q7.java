package yjs.tuili;

public class Q7 implements Question {

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
		//7.在此10道题中，被选中次数最少的选项字母为
		//A.C B.B C.A D.D
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
		if((this.answer==1&&(countC<countA&&countC<countB&&countC<countD))||
				(this.answer==2&&(countB<countA&&countB<countC&&countB<countD))||
				(this.answer==3&&(countA<countB&&countA<countC&&countA<countD))||
				(this.answer==4&&(countD<countA&&countD<countB&&countD<countC))){
			result = true;
		}
		return result;
	}

}
