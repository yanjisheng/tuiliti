package yjs.tuili;

public class Q1 implements Question {

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
		//1.这道题的答案是
		//A.A B.B C.C D.D 
		return true;
	}

}
