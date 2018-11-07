package yjs.tuili;

public class Q2 implements Question {

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
		//2.第5题的答案是
		//A.C B.D C.A D.B
		boolean result = false;
		byte q5answer = (new Q5()).getAnswer();
		if((this.answer==1&&q5answer==3)||
				(this.answer==2&&q5answer==4)||
				(this.answer==3&&q5answer==1)||
				(this.answer==4&&q5answer==2)){
			result = true;
		}
		return result;
	}

}
