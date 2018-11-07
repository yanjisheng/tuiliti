package yjs.tuili;

public class Q4 implements Question {

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
		//4.以下选项中哪两题的答案相同
		//A.第1，5题 B.第2，7题 C.第1，9题 D.第6，10题
		boolean result = false;
		byte q1answer = (new Q1()).getAnswer();
		byte q5answer = (new Q5()).getAnswer();
		byte q2answer = (new Q2()).getAnswer();
		byte q7answer = (new Q7()).getAnswer();
		byte q9answer = (new Q9()).getAnswer();
		byte q6answer = (new Q6()).getAnswer();
		byte q10answer = (new Q10()).getAnswer();
		if((this.answer==1&&(q1answer==q5answer))||
				(this.answer==2&&(q2answer==q7answer))||
				(this.answer==3&&(q1answer==q9answer))||
				(this.answer==4&&(q6answer==q10answer))){
			result = true;
		}
		return result;
	}

}
