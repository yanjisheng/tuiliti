package yjs.tuili;

public class Q6 implements Question {

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
		//6.����ѡ����������Ĵ����8����ͬ
		//A.��2��4�� B.��1��6�� C.��3��10�� D.��5��9��
		boolean result = false;
		byte q8answer = (new Q8()).getAnswer();
		byte q2answer = (new Q2()).getAnswer();
		byte q4answer = (new Q4()).getAnswer();
		byte q1answer = (new Q1()).getAnswer();
		byte q6answer = (new Q6()).getAnswer();
		byte q3answer = (new Q3()).getAnswer();
		byte q10answer = (new Q10()).getAnswer();
		byte q5answer = (new Q5()).getAnswer();
		byte q9answer = (new Q9()).getAnswer();
		if((this.answer==1&&(q8answer==q2answer&&q8answer==q4answer))||
				(this.answer==2&&(q8answer==q1answer&&q8answer==q6answer))||
				(this.answer==3&&(q8answer==q3answer&&q8answer==q10answer))||
				(this.answer==4&&(q8answer==q5answer&&q8answer==q9answer))){
			result = true;
		}
		return result;
	}

}
