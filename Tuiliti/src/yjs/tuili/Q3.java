package yjs.tuili;

public class Q3 implements Question {

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
		//3.以下选项中哪一题的答案与其他三项不同
		//A.第3题 B.第6题 C.第2题 D.第4题
		boolean result = false;
		byte q3answer = (new Q3()).getAnswer();
		byte q6answer = (new Q6()).getAnswer();
		byte q2answer = (new Q6()).getAnswer();
		byte q4answer = (new Q6()).getAnswer();
		if((this.answer==1&&(q6answer==q2answer&&q6answer==q4answer&&q6answer!=q3answer))||
				(this.answer==2&&(q3answer==q2answer&&q3answer==q4answer&&q3answer!=q6answer))||
				(this.answer==3&&(q3answer==q6answer&&q3answer==q4answer&&q3answer!=q2answer))||
				(this.answer==4&&(q3answer==q6answer&&q3answer==q2answer&&q3answer!=q4answer))){
			result = true;
		}
		return result;
	}

}
